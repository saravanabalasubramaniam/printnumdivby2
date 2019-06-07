import java.util.*;
public class print
{
	public static void main(String[] args) 
	{
	    Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        for(int i=0;i<a;i++)
        {
            if(a%2==0)
            {
                a=a/2;
            }
            else;
            {
                break;
            }
        }
        System.out.println(a);
	}
}
