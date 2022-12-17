package core.err;

public class MethodNotSupportedException extends RuntimeException
{
    public MethodNotSupportedException()
    {

    }

    public MethodNotSupportedException(String msg)
    {
        super(msg);
    }
}
