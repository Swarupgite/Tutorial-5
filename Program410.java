class Program410
{
    public static void main(String Arg[])
    {
        SinglyLL obj = new SinglyLL();
        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();
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

    public void InsertFirst(int no)
    {
        node newn = new node(no);

        if(first == null)    // LL is empty
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first = newn;
        }
        Count++;
    }

    public void InsertLast(int no){}
    public void InsertAtPos(int no, int ipos){}
    public void DeleteFirst(int no){}
    public void DeleteLast(int no){}
    public void DeleteAtPos(int ipos){}
    public void Display(){}

    public int Count()
    {
        return Count;
    }
}
