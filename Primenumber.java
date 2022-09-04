package week1;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=11;
int count=0;
for (int i=2;i<number;i+=1)
	{
	if(number%i==0)
		count=count+1;
	
}
if(count!=0)
{
	System.out.println("Given number is Prime Number");
}
else
{
	System.out.println("Given number is not a Prime Number");
}
	}

}
