package Problem1;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// create a list of integer and number of occurrences
		HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();

		while (true) {
			try {
				System.out.println("Add an integer (press f to finish):");
				int number = input.nextInt();
				if (number >= 0 && number <= 50) {
					// check if the number input exists in the list
					if (list.get(number) == null) {
						// if not, add it and assign its number of occurrence to 1
						list.put(number, 1);
					} else
						// otherwise increase number of occurrence by 1
						list.put(number, list.get(number) + 1);

				} else
					System.out.println("Boundary: from 0 to 50");
			} catch (Exception e) {
				System.out.println("List of integers and its number of occurrences:");
				System.out.println(list);
				input.close();
				return;
			}
		}

	}

}
