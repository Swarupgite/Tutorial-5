import java.util.*;

class Program278
{
    public static int ToogleBit(int iNo)
    {
        int iMask = 0X00000040;
        int iResult = 0;
        iResult = iNo ^ iMask;

        return iResult;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int iRet = 0;

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        iRet = ToogleBit(iNo);

        System.out.println("Updated number is : "+iRet);
        
    }
}