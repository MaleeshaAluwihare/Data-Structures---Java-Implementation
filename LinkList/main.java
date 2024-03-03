package LinkList;

public class main {

    public static void main(String[] args){

        LinkList newList = new LinkList();

        for(int i =1; i<=5; i++){

            newList.insertFirst(i);
        }

        newList.displayList();

        System.out.println("......................................................");

        newList.insetAfter(5, 10);

        System.out.println("......................................................");

        newList.displayList();

        System.out.println("......................................................");

        Link temp = newList.deleteFirst();
        System.out.print("First link deleted:");
        temp.displayLink();

        System.out.println("......................................................");

        newList.insetAfter(2, 10);

        System.out.println("......................................................");

        newList.displayList();

        System.out.println("......................................................");

        newList.deleteMultipleKey(10);

        System.out.println("......................................................");

        newList.displayList();

    }
    
}
