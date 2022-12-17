package core.graph.util;

import core.common.math.FixedPoint;
import core.graph.Graph;
import core.graph.GraphNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LidlUtil
{
	public static class Const
	{
		/**
		 * anonymous interface name (e.g. Activation in)
		 */
		public static final String ANONYMOUS_INF_NAME = "theInterface";

		/**
		 * native function call received by analyser should be a temp node with:
		 * node type: Expression
		 * meta Type: Reference
		 * meta Name: [startsWith FUNC_PREFIX]
		 */
		public static final String FUNC_PREFIX = "function_";

		/**
		 * standard form of core interaction:
		 * () With Behaviour ()
		 */
		public static final String WITH_BEHAVIOUR = "$With_Behaviour$";
		public static final String[] WITH_BEHAVIOUR_ACCEPT_LIST = new String[]{
				WITH_BEHAVIOUR,
				"$With_Behavior$",
		};

		/**
		 * standard form of core interaction:
		 * apply () to () and get ()
		 */
		public static final String APPLY_TO_AND_GET = "Apply$To$And_Get$";
		public static final String[] APPLY_TO_AND_GET_ACCEPT_LIST = new String[]{
				APPLY_TO_AND_GET,
		};

		/**
		 * standard form of core interaction:
		 * if () then () else ()
		 */
		public static final String IF_THEN_ELSE = "If$Then$Else$";
		public static final String[] IF_THEN_ELSE_ACCEPT_LIST = new String[]{
				IF_THEN_ELSE,
		};

		/**
		 * standard form of core interaction:
		 * when () then ()
		 */
		public static final String WHEN_THEN = "When$Then$";
		public static final String[] WHEN_THEN_ACCEPT_LIST = new String[]{
				WHEN_THEN,
		};

		/**
		 * standard form of core interaction:
		 * when () then ()
		 */
		public static final String All2 = "All$$";
		public static final String[] ALL2_ACCEPT_LIST = new String[]{
				All2,
		};

		/**
		 * standard form of core interaction:
		 * () = ()
		 */
		public static final String ASSIGNMENT = "$=$";
		public static final String[] ASSIGNMENT_ACCEPT_LIST = new String[]{
				ASSIGNMENT,
		};

		/**
		 * standard form of core interaction:
		 * Previous ()
		 */
		public static final String PREVIOUS = "Previous$";
		public static final String[] PREVIOUS_ACCEPT_LIST = new String[]{
				PREVIOUS,
		};

		/**
		 * standard form of core interaction:
		 * Make () Is A Flow Initially ()
		 */
		public static final String MAKE_IS_A_FLOW_INITIALLY = "Make$Is_A_Flow_Initially$";
		public static final String[] MAKE_IS_A_FLOW_INITIALLY_ACCEPT_LIST = new String[]{
				MAKE_IS_A_FLOW_INITIALLY,
		};

		private static final Map<String, String> CORE_IA_MAP = new HashMap<>();

		private static final List<String[]> STANDARD_CORE_IAS = new ArrayList<>();

		private static final Map<String, Class<?>> LITERAL_CLASS_MAP = new HashMap<>();

		static
		{
			STANDARD_CORE_IAS.add(WITH_BEHAVIOUR_ACCEPT_LIST);
			STANDARD_CORE_IAS.add(APPLY_TO_AND_GET_ACCEPT_LIST);
			STANDARD_CORE_IAS.add(IF_THEN_ELSE_ACCEPT_LIST);
			STANDARD_CORE_IAS.add(ASSIGNMENT_ACCEPT_LIST);
			STANDARD_CORE_IAS.add(PREVIOUS_ACCEPT_LIST);
			STANDARD_CORE_IAS.add(MAKE_IS_A_FLOW_INITIALLY_ACCEPT_LIST);
			STANDARD_CORE_IAS.add(WHEN_THEN_ACCEPT_LIST);
			STANDARD_CORE_IAS.add(ALL2_ACCEPT_LIST);

			for (var list : STANDARD_CORE_IAS)
			{
				for (var ia : list)
				{
					CORE_IA_MAP.put(ia, list[0]);
				}
			}
		}

		static
		{
			LITERAL_CLASS_MAP.put(GraphNode.MetaValue.Activation, String.class);
			LITERAL_CLASS_MAP.put(GraphNode.MetaValue.Boolean, String.class);
			LITERAL_CLASS_MAP.put(GraphNode.MetaValue.Text, String.class);
			LITERAL_CLASS_MAP.put(GraphNode.MetaValue.Number, FixedPoint.class);
		}
	}

	public static Class<?> getLiteralValueClass(GraphNode constNode)
	{
		var type = constNode.getMeta(GraphNode.MetaType.SubType, String.class).orElseThrow();
		return Const.LITERAL_CLASS_MAP.get(type);
	}


	public static String translateCoreIA(String id)
	{
		return Const.CORE_IA_MAP.get(id);
	}

	public static boolean checkIfCoreIA(String id)
	{
		return Const.CORE_IA_MAP.containsKey(id);
	}

	public static String getInterfaceSignature(Graph graph, GraphNode ifNode)
	{
		assert (ifNode.getType() == GraphNode.Type.InterfaceDefinition);

		StringBuilder sb = new StringBuilder();
		String id = graph.findNodesInDirectChildren(
								 ifNode,
								 node -> node.getType() == GraphNode.Type.InterfaceTypeElem)
						 .stream().map(
						node -> node.getMeta(GraphNode.MetaType.Name, String.class)
									.orElseThrow() +
								":" +
								node.getMeta(GraphNode.MetaType.SubType, String.class)
									.orElseThrow() +
								"-" +
								(
										node.hasMeta(GraphNode.MetaType.Direction) ?
										node.getMeta(GraphNode.MetaType.Direction, String.class)
											.orElseThrow() :
										""
								))
						 .reduce((x, y) -> x + "," + y).orElseThrow();

		sb.append('{')
		  .append(id)
		  .append('}');

		return sb.toString();
	}

	public String getConjInf(String inf)
	{
		return inf.replace("-in", "--temp--")
				  .replace("-out", "-in")
				  .replace("--temp--", "-out");
	}
}
