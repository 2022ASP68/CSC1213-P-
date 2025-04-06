import java.util.Scanner;
class Ex02{
	public static void main (String args[]){
		Scanner scan = new Scanner(System.in);
		
		int sum =0;
		char control=' ';
		
		do{
			System.out.println("Enter the Integer");
			int num=scan.nextInt();
			sum= sum+num;
			System.out.println("Do you want to continue(Y/N)");
			control = scan.next().charAt(0);
			
		}
		while(control=='Y');
		System.out.println("Summation is "+sum);
		
	}
}