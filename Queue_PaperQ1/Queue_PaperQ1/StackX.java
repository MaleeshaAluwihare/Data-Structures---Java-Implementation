package Queue_PaperQ1;


public class StackX {

    private int maxSize;
    private int top;
    public char StackArray[];

    public StackX(int size){
        this.maxSize = size;
        this.top = -1;
        StackArray = new char[maxSize];
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public void push(char letter){
        if(isFull()){
            System.out.println("Stack is full");
        }
        else{
            StackArray[++top] = letter;
        }
    }

    public char pop(){
        if(isEmpty()){
            return 0;
        }
        else{
            return StackArray[top--];
        }
    }

    public char peekFront(){
        if(isEmpty()){
            return 0;
        }
        else{
            return StackArray[top];
        }
    }

    public void display(){
        for(int i = 0 ; i < maxSize; i++){
            System.out.println(StackArray[i]+" ");
        }
    }
    
}
