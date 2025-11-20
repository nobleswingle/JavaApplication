public class SingleDimensionalArray{
	public static void main(String[] args) {
		String[] names = {"Daniel", "Ben", "Tonye", "Noble", "Stephen"};
		int ages[] = {12, 15, 19, 30, 4};
		
		for (int i = 0;  i < 5; i++) {
		System.out.printf("%s you are %d years old%n",names[i],ages[i]);
		}
	}
}
