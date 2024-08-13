package Queue;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of transactions:");
        int num = sc.nextInt();

        QueueX printerQueue = new QueueX(num);
        QueueX evenQueue = new QueueX(num);
        QueueX oddQueue = new QueueX(num);

        for(int i = 0; i < num; i++){
            System.out.print("Enter transaction ID"+" "+i+1+":");
            printerQueue.insert(sc.nextInt());
            System.out.println();
        }

        for(int i = 0; i < num; i++){
            int id = printerQueue.remove();

            if(id % 2 == 0){
                evenQueue.insert(id);
            }
            else{
                oddQueue.insert(id);
            }
        }

        System.out.println("PC1");

        while(!evenQueue.isEmpty()){
            System.out.println("Transaction"+" "+evenQueue.remove());
        }
        5
        System.out.println();

        System.out.println("PC2");

        while(!oddQueue.isEmpty()){
            System.out.println("Transaction"+" "+oddQueue.remove());
        }
    }
}