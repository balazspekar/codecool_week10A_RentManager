package codecool_week10A_RentManager;

public abstract class Product
{

	private String id;
	private String title;
	private Person person;

	public String getTitle()
	{
		return title;
	}

	public Person getPerson()
	{
		return person;
	}

	public static long getInvestment()
	{
		return 9999999;
	}

}
