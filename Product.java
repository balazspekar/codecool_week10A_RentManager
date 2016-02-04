package codecool_week10A_RentManager;

public abstract class Product
{

	private String id;
	private String title;
	private Person person; // the person who rented the product

	public Product(String title, Person person)
	{
		this.title = title;
		this.person = person;
		this.id = IdGenerator.generate(this);
	}

	public String getTitle()
	{
		return title;
	}

	public Person getPerson()
	{
		return person;
	}

	public abstract long getInvestment();

}
