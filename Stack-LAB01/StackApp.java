import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size :");
		int arrSize = sc.nextInt();
		
		StackX theStack = new StackX(arrSize);
		
		for(int i=0; i<arrSize; i++) {
			
			System.out.println("Enter number :");
			double d = sc.nextDouble();
			
			if(theStack.isEmpty()) {
				
				theStack.push(d);
				
			}
			else {
				
				double previous = theStack.peek();
				
				double sum = d + previous;
				
				theStack.push(sum);
				
			}
			
		}
		
		
		System.out.println("");
		
		
		for(int j=0; j<arrSize; j++) {
			
			System.out.println(theStack.pop());
			
		}
		
		
		
		
		sc.close();
		

	}

}

