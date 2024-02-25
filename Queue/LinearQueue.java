public class Queue{

    private int front;
    private int rear;
    private int NumCount;
    private int[] QueueArray;
    private int maxSize;

    //Constructor
    public Queue(int size){

        front = 0;
        rear = -1;
        NumCount = 0;
        maxSize = size;
        QueueArray = new int[maxSize];
    }

    //insert method
    pubic void insert(int number){

        if(rear == maxSize - 1){
            System.out.println("Queue is full");
        }
        else{
            NumCount++;
            QueueArray[++rear];

            // rear++;
            // QueueArray[rear] = number;
        }
    }

    //remove method
    public int remove(){

        if(NumCount == 0){
            return -99     //Check if Queue is empty
        }
        else{
            NumCount--;
            return QueueArray[front++];

            // int x = QueueArray[front];
            // front++;
            // return x;
        }
    }

    //peekfront method
    public int peekFront(){

        if(NumCount == 0){
            return -99;
        }
        else{
            return QueueArray[front];
        }
    }

    public boolean isEmpty(){
        return (NumCount == 0);
    }

    public boolean isFull(){
        return (NumCount == maxSize);
    }
}