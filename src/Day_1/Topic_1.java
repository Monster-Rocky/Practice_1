package Day_1;

public class Topic_1 {
		public static void main(String[] args) {
//Program To Input Two Number From User Then Addition It and Print It.
		{       int B =25;
				int C =35;
				int D;
				D = B+C ;
				System.out.println("Addition :" +D);
	    }
		
//Java Program to Check Whether a Number is Even or Odd. 
		{ int i =25;
				if (i%2==0) 
					System.out.println(i+ " Is Even");
				else 
					System.out.println(i+ " Is Odd");
		}
		
//Program to Print "Hello, World!" to the console.
	    {
			  System.out.println("Hello World");
		}
		  
//Program to take input Number (Example 10), from The User and Print to the console.
		{
			  int A= 10;
				System.out.println("Input Number :" +A);	
	    }
		
//Java Program to Multiply Two Floating Point Numbers.
		{
			  float X = 24.28f;
			  float Y = 56.55f;
			  float Z ;
				    Z= X*Y;
			  System.out.println("Multiplication :" +Z);
		 }
		
//Java Program to Swap two numbers without using Third Variable.
		 {
			    int m = 11;
				int n = 16;
				System.out.println("Number Before Swaping :" + m + " "+n);
				m = m+n;
				n = m-n;
				m = m-n;
				System.out.println("Number After Swaping :" + m + " "+n);
		  }
		 
 //Java Program to Swap Two Numbers Using Third Variables.
		  {
			  int p =5;
				int q =8;
				System.out.println("Number before swaping :" + p +" "+q);
				
				int r;
				r = p;
				p = q;
				q = r;
				 System.out.println("Number after swaping :"+ p+ " " +q);
		  }
	}
}


