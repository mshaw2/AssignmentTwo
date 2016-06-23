package com.sessiontwo;

/*
 * Generate prime numbers between 1 and 100 using for loop.
 *  A prime number (or a prime) is a natural number greater than 1 that
 *   has no positive divisors other than 1 and itself. 
 *   A natural number greater than 1 that is not a prime number is called a 
 *   composite number. Use for loop and break statement to achieve this task. 
 */
public class AssignmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=100;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if ((i%j)== 0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.print(i+" ");
			}
			
		}
	}

}
