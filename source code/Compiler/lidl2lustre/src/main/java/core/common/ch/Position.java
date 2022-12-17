package core.common.ch;

public class Position implements Comparable<Position>
{
    public int line;
    public int offset;

    Position()
    {
        line = 0;
        offset = 0;
    }

    Position(int l, int off)
    {
        line = l;
        offset = off;
    }

    Position(Position p)
    {
        line = p.line;
        offset = p.offset;
    }

    @Override
    public int compareTo(Position o)
    {
        if (line != o.line)
            return line - o.line;
        else
            return offset - o.offset;
    }

    @Override
    public String toString()
    {
        return String.format("[%d, %d]",line,offset);
    }
}
