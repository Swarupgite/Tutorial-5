class Program408
{
    public static void main(String Arg[])
    {
        SinglyLL obj = new SinglyLL();
        
    }
}

class node
{
    public int data;
    public node next;

    public node(int no)
    {
        data = no;
        next = null;
    }
}

class SinglyLL
{
    private node first;
    private int Count;

    public SinglyLL()
    {
        first = null;
        Count = 0;
    }
}
