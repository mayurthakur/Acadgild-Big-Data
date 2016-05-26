package FirstPrograms;

public class Assignment3Prime {

	public boolean checkprime (int x)
	{
		boolean ret=false;
		for (int i=2;i<x;i++)
			{if (x%i == 0)
				{ret=false;
		        break;}
			else ret = true;}
		return(ret);
		
	}
}
