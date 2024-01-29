import java.util.*;

class Program279
{
    public static int ToogleBit(int iNo)
    {
        int iMask = 0X00004000;   // for 15th bit
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