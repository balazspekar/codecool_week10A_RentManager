package codecool_week10A_RentManager;

import java.util.ArrayList;
import java.util.List;

public class Game extends Product implements Buyable
{

	private boolean preOrdered;
	private List<Person> staff = new ArrayList<Person>();
	private int price;

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

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public static long getInvestment()
	{
		return 999999;
	}

}
