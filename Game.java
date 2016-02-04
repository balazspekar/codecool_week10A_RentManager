package codecool_week10A_RentManager;

import java.util.ArrayList;
import java.util.List;

public class Game extends Product implements Buyable
{

	private boolean preOrdered;
	private List<Person> staff = new ArrayList<Person>();
	private int price;

	public Game(String title, ArrayList<Person> staff)
	{
		this.title = title;
		this.staff = staff;
	}

	public boolean isPreOrdered()
	{
		return preOrdered;
	}

	public void setPreOrdered(boolean preOrdered)
	{
		this.preOrdered = preOrdered;
	}

	public List<Person> getStaff()
	{
		return staff;
	}

	public void setStaff(List<Person> staff)
	{
		this.staff = staff;
	}

	@Override
	public int getPrice()
	{
		if (isPreOrdered())
		{
			price = price - ((price / 100) * 20);
			return price;
		}
		return getPrice();
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public long getInvestment()
	{
		long total = 0;
		for (Person person : staff)
		{
			total += person.getSalary();
		}
		return total;
	}

}
