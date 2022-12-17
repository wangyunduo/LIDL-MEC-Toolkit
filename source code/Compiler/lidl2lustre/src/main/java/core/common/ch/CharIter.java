package core.common.ch;

import core.common.log.BetterLogger;

import java.util.Optional;
import java.util.Scanner;

public class CharIter
{
    private final LineBuffer buffer;

    boolean initialized = false;

    private Optional<Character> peeked = Optional.empty();

    private static final String LINE_SEPARATOR = "\n";

    public CharIter(Scanner s)
    {
        buffer = new LineBuffer();
        while (s.hasNextLine())
        {
            buffer.append(s.nextLine() + LINE_SEPARATOR);
        }
        BetterLogger.debug("Source", '\n' + buffer.toString());
    }

    public CharIter(String source)
    {
        buffer = new LineBuffer();
        buffer.append(source);
    }

    public char nextChar()
    {
        char ch;
        if (this.peeked.isPresent())
        {
            ch = this.peeked.get();
            this.peeked = Optional.empty();
        }
        else
        {
            ch = buffer.getNextChar();
        }
        buffer.moveNext();
        return ch;
    }

    public char peekChar()
    {
        if (peeked.isPresent())
        {
            return peeked.get();
        }
        else
        {
            char ch = buffer.getNextChar();
            this.peeked = Optional.of(ch);
            return ch;
        }
    }

    public void reset()
    {
        buffer.reset();
    }

    public boolean hasNext()
    {
        return !buffer.isEOF();
    }

    public Position currentPos()
    {
        return buffer.currentPosition();
    }

    public Position previousPos()
    {
        return buffer.previousPosition();
    }

    public Position nextPos()
    {
        return buffer.nextPosition();
    }
}
