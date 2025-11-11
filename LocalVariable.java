public class LocalVariable {
	static int x = 20;
	public static void main (String[] args) {
		 int num = 16;
		int result =myPrintMethod();
		System.out.printf("%d", result);
	}
	
	public static void myMethod() {
		
	}
	
	public static int myPrintMethod() {
		return x;
	}
	
}
