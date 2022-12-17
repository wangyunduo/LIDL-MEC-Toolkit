package core.graph.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LustreLibCodeUtil
{
	private static final String OP_PLUS = """
			node operatorPlus(x: Number; y: Number) returns (z: Number)
			var
				activated: bool;
				val: real;
			let
				activated = x.act and y.act;
				val = x.value + y.value;
				z = if activated
					then Number {act = true ; value = val}
					else Number {act = false; value = 0.0};
			tel
			""";

	private static final String OP_MINUS = """
			node operatorMinus(x: Number; y: Number) returns (z: Number)
			var
				activated: bool;
				val: real;
			let
				activated = x.act and y.act;
				val = x.value - y.value;
				z = if activated
					then Number {act = true ; value = val}
					else Number {act = false; value = 0.0};
			tel
			""";

	private static final String LIDL_LIB = """
			type Number =
			struct
			{
				act: bool;
				value: real;
			};
			   
			const real_default = 0.0;
			   
			type Activation = bool;
			   
			type Boolean =
			struct
			{
				act: bool;
				value: bool;
			};
			   
			type Char =
			struct
			{
				code: int;
			};
			   
			type string = Char^200;
			   
			const string_default = Char{code=0}^200;
			   
			type Text =
			struct
			{
				act: bool;
				value: string;
			};
			""";

	public enum CodeType
	{
		Plus("operatorPlus"),
		Minus("operatorMinus"),
		Lib("lidlLib");


		private final String name;

		CodeType(String n)
		{
			name = n;
		}

		@Override
		public String toString()
		{
			return name;
		}

		public static CodeType tryParse(String type)
		{
			return Arrays.stream(CodeType.values())
						 .filter((x) -> x.name.equals(type))
						 .findFirst().orElse(null);
		}
	}

	private static Map<CodeType, String> codeMap = new HashMap<>();

	static
	{
		codeMap.put(CodeType.Plus, OP_PLUS);
		codeMap.put(CodeType.Minus, OP_MINUS);
		codeMap.put(CodeType.Lib, LIDL_LIB);
	}

	public static String getLibCode(CodeType node)
	{
		return codeMap.get(node);
	}
}
