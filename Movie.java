package codecool_week10A_RentManager;

import java.util.ArrayList;
import java.util.List;

public class Movie extends Product implements Buyable
{

	private Genre genre;
	private long duration;
	private double rate;
	private List<Person> cast = new ArrayList<Person>();
	private int price;

	public Genre getGenre()
	{
		return genre;
	}

	public void setGenre(Genre genre)
	{
		this.genre = genre;
	}

	public long getDuration()
	{
		return duration;
	}

	public void setDuration(long duration)
	{
		this.duration = duration;
	}

	public double getRate()
	{
		return rate;
	}

	public void setRate(double rate)
	{
		this.rate = rate;
	}

	public List<Person> getCast()
	{
		return cast;
	}

	public void setCast(List<Person> cast)
	{
		this.cast = cast;
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
