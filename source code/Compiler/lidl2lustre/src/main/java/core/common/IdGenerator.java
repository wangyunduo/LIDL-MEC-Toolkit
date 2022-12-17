package core.common;

public final class IdGenerator
{
	private static class IdGeneratorSingleton
	{
		public static IdGenerator instance = new IdGenerator();
	}

	private int idCounter = 0;

	private IdGenerator() {}

	private static IdGenerator getInstance()
	{
		return IdGeneratorSingleton.instance;
	}

	public static String uniqueId()
	{
		return String.valueOf(getInstance().idCounter++);
	}

	public static String uniqueId(String prefix)
	{
		return prefix + uniqueId();
	}
}
