package core.graph.util;

import core.common.log.BetterLogger;
import core.graph.GraphEdge;
import core.graph.GraphNode;

import java.util.List;

public class DigraphUtil
{
	public static class NodeUtil
	{
		public static String getFont(GraphNode node)
		{
			return "Times";
		}

		public static String getShape(GraphNode node)
		{
			switch (node.getType())
			{

				case ProgramRoot:
				case DataDefinition:
				case InterfaceDefinition:
				case InteractionDefinition:
				case InteractionParam:
				case Identifier:
					return "ellipse";
				case ModuleRoot:
				case DataTypeElem:
				case InterfaceTypeElem:
				case InterfaceInstance:
				case InternalCallParam:
					return "box";
				case CoreInteraction:
					return "house";
				case FunctionCall:
					return "cylinder";
			}
			// fallback
			return "plaintext";
		}

		public static String getStyle(GraphNode node)
		{
			return "filled";
		}

		public static String getColor(GraphNode node)
		{
			switch (node.getType())
			{

				case ProgramRoot:
				case ModuleRoot:
				case DataDefinition:
				case InterfaceDefinition:
				case InteractionDefinition:
				case InteractionParam:
				case CompositionElement:
				case Expression:
					return "#ffd1d1";
				case Identifier:
					return "#F7FF1B";
				case FunctionCall:
				case DataTypeElem:
				case InternalCallParam:
					return "#C0E9FF";
				case InterfaceTypeElem:
					return "#C0CCFF";
				case CoreInteraction:
					return "#FFF78C";
				case InterfaceInstance:
				case ActiveSource:
				case LocalVariable:
				case ParamInstance:
				case ReturnInstance:
				case Assignment:
				case NodeCall:
				case NodeDef:
				case Const:
				case NodeVars:
				case NodeBody:
				case Node:
					return "#FFF9AF";
			}
			// fallback
			return "#888888";
		}

		public static String getLabel(GraphNode node)
		{
			StringBuilder sb = new StringBuilder();
			if (BetterLogger.getLogLevel().level <= BetterLogger.LogLevel.Debug.level)
			{
				sb.append(node.getId()).append("\n");
			}
			switch (node.getType())
			{
				case ProgramRoot:
					sb.append("ProgramRoot").append("\n");
					break;
				case ModuleRoot:
					sb.append("ModuleRoot").append("\n");
					sb.append("File ")
					  .append(node.getMeta(GraphNode.MetaType.Name, String.class).orElse("Unknown Name"))
					  .append("\n");
					sb.append("Pkg ")
					  .append(node.getMeta(GraphNode.MetaType.Package, String.class).orElse("Unknown Pkg"))
					  .append("\n");
					var l = node.getMeta(GraphNode.MetaType.Imports, List.class).orElse(null);
					if (l != null && l.size() != 0)
					{
						sb.append("Imports: ").append("\n");
						for (var i : l)
						{
							sb.append(i).append("\n");
						}
					}
					break;
				case DataDefinition:
					sb.append("Data").append("\n");
					sb.append(node.getMeta(GraphNode.MetaType.Name, String.class).orElse("Error")).append("\n");
					break;
				case InterfaceDefinition:
					sb.append("Interface").append("\n");
					sb.append(node.getMeta(GraphNode.MetaType.Name, String.class).orElse("Error")).append("\n");
					break;
				case InteractionDefinition:
					sb.append("Interaction").append("\n");
					sb.append(node.getMeta(GraphNode.MetaType.Name, String.class).orElse("Error")).append("\n");
					break;
				case DataTypeElem:
					sb.append(node.getMeta(GraphNode.MetaType.Name, String.class).orElse("Error"))
					  .append(": ")
					  .append(node.getMeta(GraphNode.MetaType.SubType, String.class).orElse("Error"));
					break;
				case InterfaceTypeElem:
					sb.append(node.getMeta(GraphNode.MetaType.Name, String.class).orElse("Error"))
					  .append(": ")
					  .append(node.getMeta(GraphNode.MetaType.SubType, String.class).orElse("Error"))
					  .append(" ").append(node.getMeta(GraphNode.MetaType.Direction, String.class).orElse(""));
					break;
				case InteractionParam:
					sb.append("Param").append("\n");
					break;
				case Expression:
					sb.append("Expression").append("\n");
					switch (node.getMeta(GraphNode.MetaType.Type, String.class).orElse("Error"))
					{
						case GraphNode.MetaValue.Reference:
							sb.append(node.getMeta(GraphNode.MetaType.Name, String.class).orElse("Error")).append("\n");
							break;
						case GraphNode.MetaValue.Literal:
							Class<?> c = node.getMeta(GraphNode.MetaType.ClassType, Class.class).orElseThrow();
							Object val = c.cast(node.getMeta(GraphNode.MetaType.Value, c).orElseThrow());
							sb.append(node.getMeta(GraphNode.MetaType.SubType, String.class).orElse("Error"))
							  .append(" ")
							  .append(val);
							break;
						case GraphNode.MetaValue.Composition:
							sb.append("Composition");
							break;
						case "Error":
							sb.append("Error");
							break;
					}
					break;
				case CompositionElement:
					sb.append("CompositionElement\n")
					  .append(node.getMeta(GraphNode.MetaType.Name, String.class).orElse("Error"));
					break;
				case Identifier:
					sb.append("Identifier\n")
					  .append(node.getMeta(GraphNode.MetaType.Name, String.class).orElse("Error"));
					break;
				case FunctionCall:
					sb.append("FunctionCall\n")
					  .append(node.getMeta(GraphNode.MetaType.Name, String.class).orElse("Error"));
					break;
				case CoreInteraction:
					sb.append("Core Interaction\n")
					  .append(node.getMeta(GraphNode.MetaType.Name, String.class).orElse("Error"));
					break;
				case InterfaceInstance:
				case NodeDef:
				case ReturnInstance:
				case ParamInstance:
				case LocalVariable:
				case NodeVars:
				case Assignment:
				case NodeCall:
				case NodeBody:
				case Const:
				case Node:
					sb.append(node.getType().toString())
					  .append("\n")
					  .append((node.getMeta(GraphNode.MetaType.Code, String.class)
								   .orElse("Error") + "\n").replace("\n", "\\l"));
					break;
				default:
					sb.append(node.getType().toString());
			}
			return sb.toString();
		}
	}

	public static class EdgeUtil
	{
		public static String getFont(GraphEdge edge)
		{
			return "Times-Italic";
		}

		public static String getDir(GraphEdge edge)
		{
			return "forward";
		}

		public static String getArrowHead(GraphEdge edge)
		{
			return "normal";
		}

		public static String getArrowSize(GraphEdge edge)
		{
			return "1";
		}

		public static String getColor(GraphEdge edge)
		{
			switch (edge.getType())
			{
				case TypeRef2Def:
				case CompositeElement2ParamRet:
				case Var2DefaultValue:
				case Param2ParamRet:
					return "#84CFFF";
				case Data2NestData:
				case Interface2NestInterface:
				case Interaction2NestInteraction:
					return "#878DC6";
				case Interaction2OutInterface:
					return "#BBFF00";
				case DataFlowSource2Dest:
					return "#FFCD4C";
			}
			return "#d00000";
		}

		public static String getLabel(GraphEdge edge)
		{
			if (BetterLogger.getLogLevel().level > BetterLogger.LogLevel.Debug.level)
			{
				return "";
			}
			return edge.getType().toString();
		}

		public static String getHeadLabel(GraphEdge edge)
		{
			StringBuilder sb = new StringBuilder();
			switch (edge.getType())
			{
				case CompositeElement2Expression:
				case Expression2FunctionCall:
				case Expression2SubExpression:
				case Interaction2Param:
				case Node2Sentence:
				case Node2Param:
				case Node2Return:
					sb.append(edge.getMeta(GraphEdge.Meta.ToIndex, Integer.class).map(String::valueOf).orElse("Error"));
					break;
				case DataFlowSource2Dest:
					sb.append(edge.getMeta(GraphEdge.Meta.ToIndex, Integer.class)
								  .map(String::valueOf)
								  .orElse("Error"))
					  .append(": ")
					  .append(edge.getMeta(GraphEdge.Meta.ToInf, String.class)
								  .orElse(""));
					break;
			}
			return sb.toString();
		}

		public static String getTailLabel(GraphEdge edge)
		{
			StringBuilder sb = new StringBuilder();
			switch (edge.getType())
			{
				case CompositeElement2Expression:
				case Expression2FunctionCall:
				case Expression2SubExpression:
				case Node2Sentence:
				case Interaction2Param:
				case Node2Param:
				case Node2Return:
					sb.append(edge.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
								  .map(String::valueOf)
								  .orElse("Error"));
					break;
				case DataFlowSource2Dest:
					sb.append(edge.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
								  .map(String::valueOf)
								  .orElse("Error"))
					  .append(": ")
					  .append(edge.getMeta(GraphEdge.Meta.FromInf, String.class)
								  .orElse(""));
					break;
			}
			return sb.toString();
		}

		public static String getStyle(GraphEdge edge)
		{
			switch (edge.getType())
			{
				case TypeRef2Def:
				case Var2DefaultValue:
				case CompositeElement2ParamRet:
				case Param2ParamRet:
					return "dashed";
			}
			return "normal";
		}
	}


}
