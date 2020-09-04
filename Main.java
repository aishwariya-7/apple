/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
        static int digSum(int n)
    {
        int sum=0;
        while (n>0 || sum>9){
            if(n == 0){
                n=sum;
                sum=0;
            }
            sum += n%10;
            n/=0;
        }
       return sum;
    }

	public static void main(String args[]) {
	    int n=9829;
		System.out.println(digSum(n));
	}
}
