import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter max size:");
        int max = sc.nextInt();

        StackX stack = new StackX(max);

        System.out.println();

        while(!stack.isFull()){
            	
			System.out.println("Enter number :");
			double d = sc.nextDouble();
            stack.push(d);
        }
        

        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
