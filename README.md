import java.util.*;
public class apple{
static int digitsum(int n)
{
int sum=0;
while(n>0 || sum>9){
if(n==0){
n=sum;
sum=0;
}
sum+=n%10;
n/=10;
}
return sum;
}
public static void main(String argc[]){
int n=1234;
System.out.println(digsum(n));
}
}



