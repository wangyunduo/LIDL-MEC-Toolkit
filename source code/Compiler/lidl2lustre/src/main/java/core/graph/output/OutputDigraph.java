package core.graph.output;

import core.common.AbstractProcessor;
import core.common.FSUtils;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;
import core.graph.util.DigraphUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;

public class OutputDigraph extends AbstractProcessor<Graph>
{
	public OutputDigraph()
	{
		super("GT Processor", "Output Digraph");
	}

	private String toDigraph(Graph graph)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("digraph g{\n");

		for (var node : graph.getNodes())
			sb.append(toDigraph(node)).append("\n");

		for (var edge : graph.getEdges())
			sb.append(toDigraph(edge)).append("\n");

		sb.append("}");
		return sb.toString();
	}

	private String toDigraph(GraphNode node)
	{
		return node.getId() +
		       " [ " +
		       String.join(", ",
		                   String.format("shape=\"%s\"", DigraphUtil.NodeUtil.getShape(node)),
		                   String.format("style=\"%s\"", DigraphUtil.NodeUtil.getStyle(node)),
		                   String.format("color=\"%s\"", DigraphUtil.NodeUtil.getColor(node)),
		                   String.format("fontname=\"%s\"", DigraphUtil.NodeUtil.getFont(node)),
		                   String.format("label=\"%s\"", DigraphUtil.NodeUtil.getLabel(node))
		       ) +
		       " ]";
	}

	private String toDigraph(GraphEdge edge)
	{
		return edge.from().getId() + " -> " + edge.to().getId() +
		       " [ " +
		       String.join(", ",
		                   String.format("dir=\"%s\"", DigraphUtil.EdgeUtil.getDir(edge)),
		                   String.format("style=\"%s\"", DigraphUtil.EdgeUtil.getStyle(edge)),
		                   String.format("arrowHead=\"%s\"", DigraphUtil.EdgeUtil.getArrowHead(edge)),
		                   String.format("fontname=\"%s\"", DigraphUtil.EdgeUtil.getFont(edge)),
		                   String.format("arrowsize=\"%s\"", DigraphUtil.EdgeUtil.getArrowSize(edge)),
		                   String.format("color=\"%s\"", DigraphUtil.EdgeUtil.getColor(edge)),
		                   String.format("label=\"%s\"", DigraphUtil.EdgeUtil.getLabel(edge)),
		                   String.format("headlabel=\"%s\"", DigraphUtil.EdgeUtil.getHeadLabel(edge)),
		                   String.format("taillabel=\"%s\"", DigraphUtil.EdgeUtil.getTailLabel(edge))
		       ) +
		       " ]";
	}

	@Override
	protected boolean process(Graph item)
	{
		if (workDir != null)
		{
			try
			{
				String fileName = String.format("%d%s", item.getStep(), Optional.ofNullable(item.getStage())
				                                                                .orElse("Start"));
				FSUtils.createDir(workDir, "core/graph");

				File f = FSUtils.createFile(fileName, workDir, "graphRaw");
				FileWriter fw = new FileWriter(f);
				fw.write(toDigraph(item));
				fw.close();

//				Graphviz.fromFile(new File(FSUtils.dirConcat(workDir, "graphRaw", fileName)))
//				        .render(Format.PNG)
//				        .toFile(new File(FSUtils.dirConcat(workDir, "graph", fileName)));
//				return true;
				Runtime rt = Runtime.getRuntime();
				Process p = rt.exec(String.format("dot -Tpng ./graphRaw/%s -o ./graph/%s.png -q", fileName, fileName),
				                    null, new File(workDir));
				BetterLogger.notice("Output Digraph", "Waiting for Process dot... \n" + String.format(
						"dot -T png ./graphRaw/%s -o ./graph/%s.png", fileName, fileName));
				return p.waitFor() == 0;
			} catch (IOException | InterruptedException e)
			{
				e.printStackTrace();
			}
//			catch (InterruptedException e)
//			{
//				e.printStackTrace();
//				throw new RuntimeException(e);
//			}
		}
		return true;
	}
}
