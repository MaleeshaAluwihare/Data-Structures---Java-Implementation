package Queue_PaperQ1;

public class QueueX {

    private int maxSize;
    private int front;
    private int rear;
    public char[] QueueArray;
    private int numCount;

    public QueueX(int size){
        this.maxSize = size;
        this.front = 0;
        this.rear = -1;
        this.QueueArray = new char[maxSize];
        this.numCount = 0;
    }

    public boolean isEmpty(){
        return (numCount == 0);
    }

    public boolean isFull(){
        return (numCount == maxSize-1);
    }

    public void insert(char letter){

        if(rear == maxSize-1){
            System.out.println("Queue is full");
        }
        else{
            QueueArray[++rear] = letter;
            numCount++;
        }
    }

    public char remove(){
        if(numCount == 0){
            return 0;
        }
        else{
            numCount--;
            return QueueArray[front++];
        }
    }

    public void display(){
        for(int i = 0 ; i < maxSize; i++){
            System.out.print(QueueArray[i]+" ");
        }
    }

    // public void reverse(){
    //     int left = front;
    //     int right = rear;
    //     while (left < right) {
    //         char temp = QueueArray[left];
    //         QueueArray[left] = QueueArray[right];
    //         QueueArray[right] = temp;
    //         left++;
    //         right--;
    //     }
    // }   
}