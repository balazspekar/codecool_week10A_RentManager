package codecool_week10A_RentManager;

import java.util.ArrayList;

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
		Book harrypotter = new Book("Harry Potter", jkrowling);
		Book therewerenone = new Book("And Then There Were None", agatha);

		// instantiating Game objects
		ArrayList galaxyshooter_staff = new ArrayList<Person>();
		galaxyshooter_staff.add(atesz);
		galaxyshooter_staff.add(szodi);
		galaxyshooter_staff.add(pakko);
		Game galaxyshooter = new Game("Galaxy Shooter", galaxyshooter_staff);
		ArrayList tetris_staff = new ArrayList<Person>();
		tetris_staff.add(atesz);
		tetris_staff.add(agatha);
		tetris_staff.add(szodi);
		Game tetris = new Game("Tetris", tetris_staff);
		// filling up fields of these Game objects
		galaxyshooter.setPreOrdered(true);
		galaxyshooter.setPrice(150);
		tetris.setPreOrdered(false);
		tetris.setPrice(80);

		// instantiating Movie objects
		// TODO there are no Movie objects yet
	}

	public int getBuyableProducts()
	{
		// TODO Write a method which gets a List of buyable objects and returns
		// with the total preferred income by
		// summarizing the prices of the products in the parameter.
		return 0;
	}

}