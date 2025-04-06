class Ex04{
	public static void main(String args[]){
		int num1[]=new int[5];
		num1 [0]= 24;
		num1 [1]= 12;
		num1 [2]= 34;
		num1 [3]= 50;
		num1 [4]= 10;
		
		for (int i=0; i<num1.length;i++){
			System.out.println(num1[i]+"\t");
		}
		System.out.println("************************************");
		
		int num2[] ={1,3,5,6,7,10,4,55,99,10};
		for (int i=0; i<num2.length; i++){
			System.out.println(num2[i]+"\t");
		}
			
			System.out.println("************************************");
			
			String days[] ={"Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday",};
			for(String day:days){
				System.out.println(day +"\t");
			}
	}
}