import java.util.Scanner;
public class EnhancedForLoop{
	public static void main(String[] args){
		// Create a single-dimensional array of size 10
		String[] names = new String[10];
		
		//Create a single dimensional array of size 10
		int[] marks = new int[10];
		
		//Create the object of the scanner class
		Scanner scan = new Scanner(System.in);
		
		//get input from users using the traditional For-loop
		for(int i = 0; i < 10; i++) {
		System.out.print("Enter Student name: ");
		names[i] = scan.nextLine();
		
		
		System.out.print("Enter Student marks: ");
		marks[i] = scan.nextInt();
		scan.nextLine();
		
		System.out.println("===================================");
	}
		
		//Transverse through the arrays to display the elements of the arrays
		System.out.print("Elements of Names Array are: ");
		for(String name : names) {
			System.out.printf("%s%n", name);
		}
		
		System.out.print("");
		System.out.print("Elements of the Mark array are: ");
		for(int mark : marks) {
			
			System.out.printf("%d%n", mark);
		}
	}
}


		
		