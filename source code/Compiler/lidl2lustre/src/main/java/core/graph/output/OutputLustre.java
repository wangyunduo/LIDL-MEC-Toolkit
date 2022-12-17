package core.graph.output;

import core.common.AbstractProcessor;
import core.common.FSUtils;
import core.graph.Graph;
import core.graph.GraphNode;
import core.graph.util.LustreLibCodeUtil;

import java.io.*;

public class OutputLustre extends AbstractProcessor<Graph>
{
	public OutputLustre()
	{
		super("GT Output", "Output Lustre Code");
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);
		String outFile = item.getOutFileName();
		File f;
		if (outFile != null)
		{
			try
			{
				f = FSUtils.createFile(outFile);
			} catch (IOException e)
			{
				e.printStackTrace();
				return false;
			}
		}
		else if (workDir != null)
		{
			try
			{
				f = FSUtils.createFile("outres.lus", workDir, "output");
			} catch (IOException e)
			{
				e.printStackTrace();
				return false;
			}
		}
		else
		{
			try
			{
				f = FSUtils.createFile("outres.lus", ".", "output");
			} catch (IOException e)
			{
				e.printStackTrace();
				return false;
			}
		}

		try (PrintWriter pw = new PrintWriter(f))
		{
			if (!outputAppendices(item, pw))
				return false;

			if (!outputNodes(item, pw))
				return false;
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
			return false;
		}

		return true;
	}

	private boolean outputAppendices(Graph graph, PrintWriter pw)
	{
		var list = graph.getAppendices();
		for (var type : list)
		{
			String code = LustreLibCodeUtil.getLibCode(type);
			pw.println(code);
		}
		return true;
	}

	private boolean outputNodes(Graph graph, PrintWriter pw)
	{
		var nodes = graph.findNodesOfType(GraphNode.Type.Node);
		nodes.forEach(n -> {
			pw.println(n.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow());
			pw.println();
		});
		return true;
	}
}
