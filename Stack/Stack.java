//Last in firt out 

public class Stack{

    private int MaxSize;
    private int[] StackArray;
    private int top;

    //constructor of the class
    public Stack(int size){
        MaxSize = size;
        top = -1;
        StackArray = new int[MaxSize];
    }

    //insert a number into the stack
    public void push(int number){

        if(top == MaxSize - 1){   //or we can use isFull() instead
            System.out.println("Stack is full");
        }
        else{
            /*top++;
             * StackArray[++top] = number;
             */
            StackArray[++top] = number;
        }
    }

    // remove a number from the stack
    public int pop(){

        if(top == -1){  //or we can use isEmpty() instead
            System.out.println("Stack is empty");
            return -99;
        }
        else{
            return StackArray[top--];
            /*
             * int topNum = StackArray[top];
             * top--;
             * return topNum;
             */
        }
    }

    //return the top most number
    public int peek(){
        if(top == -1){  //or we can use isEmpty() instead
            System.out.println("Stack is empty");
            return -99;
        }
        else{
            return StackArray[top];
        }
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == MaxSize - 1);
    }
}