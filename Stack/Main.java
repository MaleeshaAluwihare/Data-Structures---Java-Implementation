public class Main(){

    public static void main(String[] args){

        Stack newStack = new Stack(5);

        newStack.push(10);
        newStack.push(20);
        newStack.push(30);
        newStack.push(40);
        newStack.push(50);

        System.out.println("The top most number is:" + newStack.peek());
        
    }
}