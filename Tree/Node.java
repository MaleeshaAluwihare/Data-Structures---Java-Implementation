package Tree;

public class Node {

    public int ITnumber;
    public double GPA;
    public Node leftChild;
    public Node rightChild;
    
    public Node(int num1,double num2){
        ITnumber = num1;
        GPA = num2;
        leftChild = null;
        rightChild = null;
    }

    public void displayNode(){
        System.out.println(ITnumber+","+GPA);
    }
}
