import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {

	static final Random random = new Random();
	static final String[] procrastinationPack = new String[]{"Rivals", "Rivals", "Rivals","Facebook", "Reddit"};
	static final String[] reading = new String[]{ "HN", "HN", "Reading", "Reading", "Pocket"};
	static final String[] fitness = new String[]{"Stretch"};
	static final String[] cats = new String[]{"Cat Petting", "Cat Petting"};
	static ArrayList<String> nameList = new ArrayList<>();
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		nameList.addAll(Arrays.asList(procrastinationPack));
		nameList.addAll(Arrays.asList(reading));
		nameList.addAll(Arrays.asList(fitness));
		nameList.addAll(Arrays.asList(cats));


		boolean pickingNames = true;

		while(pickingNames)
		{
			if(!addName())
			{
				pickingNames = false;
			}
		}
		while(nameList.size() > 0)
		{
			System.out.println("Here's what's left:");
			for(String toPrint : nameList)
			{
				System.out.print(toPrint + ", ");
			}
			System.out.println("\nHmu when you're ready to get an item.");
			if(input.nextLine().equalsIgnoreCase("Done"))
			{
				break;
			}
			System.out.println(pickName());

		}
	}


	public static String pickName()
	{
		int index = random.nextInt(nameList.size());
		String temp = nameList.get(index);
		nameList.remove(index);
		System.out.println("You got:");
		return temp;
	}

	public static Boolean addName()
	{
		System.out.println("Add an item");
		String temp = input.nextLine();
		if(temp.equalsIgnoreCase(""))
		{
			return false;
		}
		nameList.add(temp);
		return true;
	}


}