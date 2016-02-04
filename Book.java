package codecool_week10A_RentManager;

public class Book extends Product
{

	private Person author;

	public Book(String title, Person person)
	{
		super(title, person);
		this.author = person; // ???
	}

	public Person getAuthor()
	{
		return author;
	}

	public void setAuthor(Person author)
	{
		this.author = author;
	}

	@Override
	public long getInvestment()
	{
		return author.getSalary();
	}

}
