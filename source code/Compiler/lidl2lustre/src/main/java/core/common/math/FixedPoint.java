package core.common.math;

public class FixedPoint extends Number
{
	private int decimal;
	private String fraction;

	public FixedPoint()
	{
		decimal = 0;
		fraction = "";
	}

	public FixedPoint(int dec)
	{
		decimal = dec;
		fraction = "";
	}

	public FixedPoint(String raw)
	{
		String[] raws = raw.split("\\.");
		if (raws.length > 2)
		{
			throw new NumberFormatException("Unrecognized FixPoint: " + raw);
		}
		else if (raws.length == 0)
		{
			decimal = 0;
			fraction = "";
		}

		if (raws.length == 2)
		{
			fraction = raws[1];
		}
		decimal = Integer.parseInt(raws[0]);
	}

	public String fixValue()
	{
		return toString();
	}

	@Override
	public int intValue()
	{
		return decimal;
	}

	@Override
	public long longValue()
	{
		return decimal;
	}

	@Override
	public float floatValue()
	{
		return Float.parseFloat(decimal + "." + fraction);
	}

	@Override
	public double doubleValue()
	{
		return Double.parseDouble(decimal + "." + fraction);
	}

	@Override
	public String toString()
	{
		return decimal + ((fraction == null || fraction.equals("")) ? ".0" : "." + fraction);
	}
}
