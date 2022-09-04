package week1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
	    int b=1;
	    int c;
	    int i;
	   int count=11;
	   System.out.println(a);
	   System.out.println(b);
	   for (i=2;i<count;++i)
	   {
		   c=a+b;
	   System.out.println(c);
	   a=b;
	   b=c;
		   
	}

}
}