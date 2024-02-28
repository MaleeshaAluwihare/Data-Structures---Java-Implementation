package LinkList;

public class Link{

    public int iData;
    public Link next;

    public Link(int num){
        iData = num;
        next = null;
    }

    public void displayLink(){
        System.out.println(iData);
    }
}
