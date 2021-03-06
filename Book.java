package codecool_week10A_RentManager;

public class Book extends Product
{

	private Person author;

	public Book(String title, Person person)
	{
		this.title = title;
		this.person = person; // the person who rented the book!
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

	@Override
	public void setId()
	{
		this.id = IdGenerator.generate(this);
	}

}
