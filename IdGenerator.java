package codecool_week10A_RentManager;

public class IdGenerator
{
	public static String generate(Product product)
	{

		double randNum = System.nanoTime();
		String result = "";
		if (product instanceof Movie)
		{
			result = "MOV" + randNum;
		} else if (product instanceof Book)
		{
			result = "BOO" + randNum;
		} else if (product instanceof Game)
		{
			result = "GAM" + randNum;
		}
		return result;
	}
}
