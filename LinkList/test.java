package LinkList;

public class test {
    
    public int iData;
    public Link next;

    public test(int num){
        iData = num;
        next = null;
    }

    public void display(){
        System.out.println(iData);
    }
}
