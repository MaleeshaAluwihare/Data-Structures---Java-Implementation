package Queue;

public class QueueX {

    private int front;
    private int rear;
    private int maxSize;
    private int numCount;
    private char[] QueueArray;

    public QueueX(int num){
        maxSize = num;
        front = 0;
        rear = -1;
        QueueArray = new char[maxSize];
        numCount = 0;
    }

    public void input(char letter){
        if(rear == maxSize-1){
            System.out.println("Queue is full");
        }
        else{
            numCount++;
            QueueArray[++rear] = letter;
        }
    }

    public char remove(){
        if(numCount == 0){
            return 0;
        }
        else{
            numCount--;
            return QueueArray[front--];
        }
    }
    
}
