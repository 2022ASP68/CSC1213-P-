import java.util.Scanner;
class Ex01{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the Number");
	int Num1 = scan.nextInt();
	int i=0;
	int sum =0;
	while(i<=Num1){
		
		sum=sum+i;
		i++;
	}
	
	System.out.println("Summation is "+sum);
	}
}