package codecool_week10A_RentManager;

import java.util.ArrayList;
import java.util.List;

public class RentManager
{
	public static void main(String[] args)
	{
		System.out.println("Codecool Week 10A Task\n");

		// instantiating Person objects
		Person atesz = new Person();
		Person szodi = new Person();
		Person pakko = new Person();
		Person jkrowling = new Person();
		Person agatha = new Person();

		// filling up fields of these Person objects
		atesz.setFirstName("Attila");
		atesz.setLastName("Molnar");
		atesz.setGender(Gender.MALE);
		atesz.setSalary(1000);
		szodi.setFirstName("Sandor");
		szodi.setLastName("Szodoray");
		szodi.setGender(Gender.MALE);
		szodi.setSalary(2000);
		pakko.setFirstName("Pal");
		pakko.setLastName("Monoczki");
		pakko.setGender(Gender.MALE);
		pakko.setSalary(3000);
		jkrowling.setFirstName("JK");
		jkrowling.setLastName("Rowling");
		jkrowling.setGender(Gender.FEMALE);
		jkrowling.setSalary(9500);
		agatha.setFirstName("Agatha");
		agatha.setLastName("Christie");
		agatha.setGender(Gender.FEMALE);
		agatha.setSalary(5500);

		// instantiating Book objects
		Book harrypotter = new Book("Harry Potter", atesz);
		Book therewerenone = new Book("And Then There Were None", pakko);

		// filling up fields of these Book objects
		harrypotter.setAuthor(jkrowling);
		therewerenone.setAuthor(agatha);

		// instantiating Game objects
		Game galaxyshooter = new Game("Galaxy Shooter", agatha);
		Game tetris = new Game("Tetris", jkrowling);

		// filling up fields of these Game objects
		List galaxyshooter_staff = new ArrayList<Person>();
		galaxyshooter_staff.add(atesz);
		galaxyshooter_staff.add(szodi);
		galaxyshooter_staff.add(pakko);
		galaxyshooter.setStaff(galaxyshooter_staff);
		galaxyshooter.setPreOrdered(true);
		galaxyshooter.setPrice(150);
		List tetris_staff = new ArrayList<Person>();
		tetris_staff.add(atesz);
		tetris_staff.add(agatha);
		tetris_staff.add(szodi);
		tetris.setStaff(tetris_staff);
		tetris.setPreOrdered(false);
		tetris.setPrice(80);

		// instantiating Movie objects
		Movie terminator = new Movie("Terminator", atesz);
		Movie godfather = new Movie("The Godfather", pakko);

		// filling up fields of these Movie objects
		List terminator_cast = new ArrayList<Person>();
		terminator_cast.add(szodi);
		terminator_cast.add(agatha);
		terminator.setCast(terminator_cast);
		terminator.setDuration(144);
		terminator.setGenre(Genre.ACTION);
		terminator.setPrice(45);
		terminator.setRate(8.7);
		List godfather_cast = new ArrayList<Person>();
		godfather_cast.add(jkrowling);
		godfather_cast.add(pakko);
		godfather.setCast(godfather_cast);
		godfather.setDuration(120);
		godfather.setGenre(Genre.DRAMA);
		godfather.setPrice(85);
		godfather.setRate(9.5);

		// creating an arraylist of buyable products
		List buyables = new ArrayList<Product>();
		buyables.add(galaxyshooter);
		buyables.add(tetris);
		buyables.add(terminator);
		buyables.add(godfather);

		// calling the getBuyableProducts method
		System.out.println("The total income of buyable products in the buyables ArrayList:");
		System.out.println(getBuyableProducts(buyables));

	}

	public static int getBuyableProducts(List<Buyable> buyables)
	{
		int total = 0;
		for (Buyable buyable : buyables)
		{
			total += buyable.getPrice();
		}
		return total;
	}

}