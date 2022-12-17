package core.common.ch;

import java.util.ArrayList;

public class LineBuffer
{
	private ArrayList<String> buffer = new ArrayList<>();

	private Position ptrNext = new Position(0, 0);

	private Position ptr = new Position(0, 0);

	public ArrayList<String> getBuffer()
	{
		return buffer;
	}

	public Position nextPosition()
	{
		if (ptr.line >= buffer.size())
		{
			throw new BufferError("Exceeding file size, reaching EOF.");
		}
		if (ptr.offset == buffer.get(ptr.line).length() - 1)
		{
			return new Position(ptr.line + 1, 0);
		}
		return new Position(ptr.line, ptr.offset + 1);
	}

	public Position currentPosition()
	{
		return new Position(ptr);
	}

	public Position previousPosition()
	{
		if (ptr.line == 0 && ptr.offset == 0)
		{
			throw new BufferError("Exceeding file size, reaching SOF.");
		}
		if (ptr.offset == 0)
		{
			return new Position(ptr.line - 1, buffer.get(ptr.line - 1).length() - 1);
		}
		return new Position(ptr.line, ptr.offset - 1);
	}

	public void moveNext()
	{
		ptr = ptrNext;
	}

	public char getNextChar()
	{
		if (isEOF())
		{
			return 0;
		}
		char ch = buffer.get(ptrNext.line).charAt(ptrNext.offset);
		ptrNext = nextPosition();
		return ch;
	}

	public boolean isEOF()
	{
		return ptr.line >= buffer.size();
	}

	public void reset()
	{
		ptr = ptrNext = new Position(0, 0);
	}

	public void append(String line)
	{
		buffer.add(line);
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		int lineIndex = 0;
		for (var line : buffer)
		{
			sb.append(String.format("%-3d", lineIndex++)).append(": ").append(line);
		}
		return sb.toString();
	}

	private class BufferError extends Error
	{
		public BufferError()
		{}

		public BufferError(String msg)
		{
			super(msg);
		}
	}
}
