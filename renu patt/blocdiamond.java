class  blocdiamond
{
	public static void main(String[] args) 
	{
		int star=6;
		int space=-2;
		for(int i=1;i<=9;i++)
		{
			if(i<=5)
			{
				star--;
				space+=2;
			}
			else
			{
				star++;
				space-=2;
			}
			for(int x=1;x<=star;x++)
			{
				System.out.print('*');
			}
			for(int y=1;y<=space;y++)
			{
				System.out.print(' ');
			}
			for(int z=1;z<=star;z++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
