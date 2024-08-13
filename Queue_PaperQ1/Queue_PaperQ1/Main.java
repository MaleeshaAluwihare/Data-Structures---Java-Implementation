package Queue_PaperQ1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Queue size:");
        int size = sc.nextInt();

        QueueX Q1 = new QueueX(size); 
        StackX S1 = new StackX(size);

        for(int i = 0; i < size ; i++){
            System.out.println("Input Character:");
            Q1.insert(sc.next().charAt(0));
        }
        System.out.println("Original Queue");
        while(!Q1.isEmpty()){
            char c = Q1.remove();
            S1.push(c);
            System.out.print(c+" ");
        }

        System.out.println();

        for(int i = 0; i< size; i++){
            Q1.QueueArray[i] = S1.pop();
        }

        System.out.println("Queue in reverse order");
        while(!Q1.isEmpty()){
            System.out.print(Q1.remove()+" ");
        }

        sc.close();
    }
    
}
