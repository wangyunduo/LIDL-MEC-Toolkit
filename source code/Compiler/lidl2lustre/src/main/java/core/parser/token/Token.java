package core.parser.token;

import core.common.ch.Position;

public class Token
{
	private TokenType type;
	private Object value;
	private Position start;
	private Position end;

	public Token(TokenType type, Object value, Position start, Position end)
	{
		this.type = type;
		this.value = value;
		this.start = start;
		this.end = end;
	}

	public TokenType getType()
	{
		return type;
	}

	public Token setType(TokenType type)
	{
		this.type = type;
		return this;
	}

	public Object getValue()
	{
		return value;
	}

	public Token setValue(Object value)
	{
		this.value = value;
		return this;
	}

	public Position getStart()
	{
		return start;
	}

	public Token setStart(Position start)
	{
		this.start = start;
		return this;
	}

	public Position getEnd()
	{
		return end;
	}

	public Token setEnd(Position end)
	{
		this.end = end;
		return this;
	}

	public boolean equalsType(TokenType tt)
	{
		return type == tt;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Token token = (Token) o;

		return type == token.type;
	}

	@Override
	public int hashCode()
	{
		return type.hashCode();
	}

	@Override
	public String toString()
	{
		return String.format("%s, %s, from %s to %s", type, value, start, end);
	}
}
