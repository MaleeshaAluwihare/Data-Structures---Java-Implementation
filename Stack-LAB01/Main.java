import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter max size:");
        int max = sc.nextInt();

        System.out.println();

        StackX s1 = new StackX(max);

        // for(int i=0; i<max; i++) {
        //     System.out.print("Enter letter:");
        //     s1.push(sc.next().charAt(0));
        //     System.out.println();
        // }

        while(!s1.isFull()){
             System.out.print("Enter letter:");
             s1.push(sc.next().charAt(0));
             System.out.println();
        }

        while (!s1.isEmpty()) {
            System.out.println(s1.pop());
        }

        System.out.println();

        System.out.print("Enter expression:");
        String expression = sc.next();

        StackX s2 = new StackX(expression.length());

        for(int i=0;i<expression.length();i++){

            if(expression.charAt(i) == '('){
                s2.push('(');
            }
            else if(expression.charAt(i) == ')'){
                if(s2.isEmpty()){
                    System.out.println("Expression is not correctly parenthesized");
                    return;
                }
                else{
                    s2.pop();
                }
            }
        }

        if(s2.isEmpty()){
            System.out.println("Expression is correct");
        }

        sc.close();
    }
    
}
