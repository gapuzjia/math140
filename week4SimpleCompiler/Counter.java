package week4SimpleCompiler;

public class Counter
{

    private final String name;
    private int count;

    public Counter(String id)
    {
        name = id;
    }

    public void increment()
    {
        count++;
    }

    

    public int tally()
    {
        return count;
    }

    public String toString()
    {
        return count + "              " + name;
    }

    public static Counter max(Counter x, Counter y)
    {
        if (x.tally() > y.tally())
            return x;
        else
            return y;
    }
    public String getID()
    {
        return name;
    }

}

