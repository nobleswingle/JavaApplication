import java.util.Random;

public class RandomNumberGenerator {
	public static void main(String[] args) {
		Random random = new Random();
		
		int number = random.nextInt();
		System.out.printf("The number generated is %d%n",Math.abs(number));
		

		int myNumber = random.nextInt(10+1);
		System.out.printf("My Generated number is %d%n",myNumber);
	
		double myDoubleNumber = random.nextDouble();
		System.out.printf("My generated number is %f%n", myDoubleNumber);
		
		boolean isFun = random.nextBoolean();
		System.out.printf("Is java FUn", isFun);
	}
	
}

