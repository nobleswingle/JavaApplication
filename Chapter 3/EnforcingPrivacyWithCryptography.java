import java.util.Scanner;

public class EnforcingPrivacyWithCryptography{
	static void encrypt(){
		int valid=0;
		
		Scanner input = new Scanner(System.in);
		
		while (valid==0){
			System.out.print("Input a four digit integer: ");
			int num = input.nextInt();
			
			int length = String.valueOf(num).length();
			
			if (length!=4){
				System.out.println("Invalid Input");
			}
			else{
				int d4=num%10;
				int d3=(num/10)%10;
				int d2=(num/100)%10;
				int d1=(num/1000)%10;
				
				d1=(d1+7)%10;
				d2=(d2+7)%10;
				d3=(d3+7)%10;
				d4=(d4+7)%10;
				
				d1+=d3;
				d3=d1-d3;
				d1-=d3;
				
				d2+=d4;
				d4=d2-d4;
				d2-=d4;
				
				System.out.printf("%d%d%d%d%n",d1,d2,d3,d4);
				break;
			}
		}
	}
	static void decrypt(){
		int valid=0;
		
		Scanner input = new Scanner(System.in);
		
		while (valid==0){
			System.out.print("Input Encrypted number: ");
			int eNum = input.nextInt();
			
			int length = String.valueOf(eNum).length();
			
			if (length!=4){
				System.out.println("Invalid Input");
			}
			else{
				int d4=eNum%10;
				int d3=(eNum/10)%10;
				int d2=(eNum/100)%10;
				int d1=(eNum/1000)%10;
				
				d1+=d3;
				d3=d1-d3;
				d1-=d3;
				
				d2+=d4;
				d4=d2-d4;
				d2-=d4;
				
				d1=(d1+3)%10;
				d2=(d2+3)%10;
				d3=(d3+3)%10;
				d4=(d4+3)%10;
				
				
				System.out.printf("%d%d%d%d%n",d1,d2,d3,d4);
				break;

			}
		}
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		encrypt();
		decrypt();
		input.close();
	}
}