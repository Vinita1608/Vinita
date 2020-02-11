package JavaExam;

public class Pyramid {
	public static void main()
	{
		int row =10 , k=0;
		for (int i=0; i<=row ; i++ , k=0)
		{
			for (int j= 1; j<= row -i; j++)
			{
				System.out.println("");
				
				while(k !=2 * i -1)
				{
					System.out.println(" * ");
					k++;
					
				}
				System.out.println();
			}
		}
	}

}
