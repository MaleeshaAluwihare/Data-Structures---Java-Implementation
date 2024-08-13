public class StackX{

    private int top;
    private int maxSize;
    private double[] StackArray;

    public StackX(int size){
        this.maxSize = size;
        this.top = -1;
        this.StackArray = new double[maxSize];
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public void push(double letter){
        if(isFull()){
            System.out.println("Stack is full");
        }
        else{
            StackArray[++top] = letter;
        }
    }

    public double pop(){
        if(isEmpty()){
            return 0;
        }
        else{
            return StackArray[top--];
        }
    }

    public double peek(){
        if(isEmpty()){
            return 0;
        }
        else{
            return StackArray[top];
        }
    }
}