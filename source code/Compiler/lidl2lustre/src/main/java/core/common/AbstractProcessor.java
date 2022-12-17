package core.common;

import core.common.log.BetterLogger;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public abstract class AbstractProcessor<T>
{
	protected final String pTag;
	protected final String pName;
	protected final String pNameSimple;
	protected String workDir = ".";
	private final List<BiFunction<T, String, Boolean>> callbacks;

	private AbstractProcessor()
	{
		this.pTag = "NoTag";
		this.pName = "NoName";
		this.pNameSimple = getClass().getSimpleName();
		this.callbacks = new ArrayList<>();
	}

	public AbstractProcessor(String pTag, String pName)
	{
		this.pTag = pTag;
		this.pName = pName;
		this.pNameSimple = getClass().getSimpleName();
		this.callbacks = new ArrayList<>();
	}

	public final AbstractProcessor<T> setWorkDirectory(String dir)
	{
		workDir = dir;
		return this;
	}

	protected abstract boolean process(T item);

	public final AbstractProcessor<T> addCallback(BiFunction<T, String, Boolean> callback)
	{
		callbacks.add(callback);
		return this;
	}

	public boolean run(T item)
	{
		BetterLogger.notice(pTag, String.format("%s ...", pName));
		BetterLogger.debug(pTag, String.format("%s started.", pName));
		boolean ret = process(item);
		for (var callback : callbacks)
		{
			BetterLogger.debug(pTag, String.format("%s callback <%s> ...", pName, callback));
			String res = callback.apply(item, workDir) ? "done" : "failed";
			BetterLogger.debug(pTag, String.format("%s callback <%s> %s.", pName, callback, res));
		}
		BetterLogger.debug(pTag, String.format("%s finished.", pName));
		return ret;
	}

	protected void reportError(String msg)
	{
		BetterLogger.error(pTag, String.format("%s\n%s", pName, msg));
	}

	protected void reportError(String fmt, String msg)
	{
		BetterLogger.error(pTag, String.format("%s\n%s", pName, String.format(fmt, msg)));
	}
}
