package arms;
public class arms
{
public static void main(String args[])
{
int n,temp=n,i;
int r,sum=0;
{
for(i=0;i<=500;i++)
{
	r=n%10;
	n=n/10;
	sum=sum + r*r*r;
}
if(temp==sum){
System.out.println("it is armstrong");}
{
else
System.out.println("it is not armstrong");}

}
}
}