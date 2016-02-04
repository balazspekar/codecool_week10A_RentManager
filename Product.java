package codecool_week10A_RentManager;

public abstract class Product
{
	protected String id;
	protected String title;
	protected Person person; // the person who rented the product

	public String getTitle()
	{
		return title;
	}

	public Person getPerson()
	{
		return person;
	}

	public abstract long getInvestment();

	protected abstract void setId();
}
