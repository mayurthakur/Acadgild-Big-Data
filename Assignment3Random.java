package FirstPrograms;

public class Assignment3Random {

	double c;
	public double random (double num){
		double result,temp;
		temp=num-1;
		result=Math.random();
		if (result > temp)
		 	result=result-temp;
		else if (result < 0)
			result=result+temp;
		return result;
			}
}
