package codecool_week10A_RentManager;

public class IdGenerator
{
	public static String generate(Product product)
	{

		double randNum = (int) (Math.random() * 1001);
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
