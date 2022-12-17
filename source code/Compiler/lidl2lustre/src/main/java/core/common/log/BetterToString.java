package core.common.log;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class BetterToString
{
	private static <K, V> String mapToString(Map<K, V> map)
	{
		return mapToString(map, 0);
	}

	private static <K, V> String mapToString(Map<K, V> map, int indent)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(indentStr(indent)).append("{").append("\n");
		map.forEach(
				(key, value) ->
				{
					var s = str(value, indent + 2);
					sb.append(indentStr(indent + 1)).append("key: ").append("\n")
					  .append(str(key, indent + 2)).append("\n")
					  .append(indentStr(indent + 1)).append("value: ").append("\n")
					  .append(s).append(s.endsWith("\n") ? "" : "\n");
				}

		);
		sb.append(indentStr(indent)).append("}").append("\n");
		return sb.toString();
	}

	private static <T> String listToString(Collection<T> list)
	{
		return listToString(list, 0);
	}

	private static <T> String listToString(Collection<T> list, int indent)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(indentStr(indent)).append("[").append("\n");
		list.forEach(
				(item) ->
				{
					var s = str(item, indent + 1);
					sb.append(s).append(s.endsWith("\n") ? "" : "\n");
				}
		);
		sb.append(indentStr(indent)).append("]").append("\n");
		return sb.toString();
	}

	public static String str(Object value)
	{
		return str(value, 0);
	}

	public static String str(Object value, int indent)
	{
		if (value instanceof Map<?, ?>)
		{
			return mapToString((Map<?, ?>) value, indent);
		}
		if (value instanceof Collection<?>)
		{
			return listToString((Collection<?>) value, indent);
		}
		return indentStr(indent) + value.toString();
	}

	private static String indentStr(int indent)
	{
		if (indent <= 0)
			return "";
		return new String(new char[indent]).replace('\0', '\t');
	}
}
