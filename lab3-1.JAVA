import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] array = new int[12];
		int i;
		int j;
		int sumfor = 0;
		int sumwhile = 0;
		int sumdo = 0;
		int swap;
		int factoperand;
		int factorial;
		
		//4.
		for (i = 0; i < 12; i++)
		{
			array[i] = (int)(Math.random() * 100);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (j = 0; j < 11; j++)
		{
			for (i = 0; i < 11; i++)
			{
				if(array[i] > array[i + 1])
				{
					swap = array[i];
					array[i] = array[i + 1];
					array[i + 1] = swap;
				}
			}
		}
		for (i = 0; i < 12; i++)
		{
			System.out.print(array[i] + " ");
		}
		
		//1.
		for (i = 0; i < 12; i++)
		{
			sumfor += array[i];
		}
		i = 0;
		while (i < 12)
		{
			sumwhile += array[i];
			i++;
		}
		i = 0;
		do
		{
			sumdo += array[i];
			i++;
		} while (i < 12);
		System.out.println();
		System.out.println("for: " + sumfor);
		System.out.println("while: " + sumwhile);
		System.out.println("do while: " + sumdo);
		
		//2.
		for (i = 0; i < args.length; i++)
		{
			System.out.print(args[i] + " ");
		}
		System.out.println();
		
		//3.
		double harmonic = 0.0;
		for (i = 1; i <= 10; i++)
		{
			harmonic += 1.0 / i;
			System.out.format("%.3f ", harmonic);
		}
		System.out.println();
		
		//5.
		factoperand = (int)(5 + Math.random() * 6);
		factorial = 1;
		for (i = 2; i <= factoperand; i++)
		{
			factorial *= i;
		}
		System.out.format("%d! = %d", factoperand, factorial);
	}
}
