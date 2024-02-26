package LinkList;

public class LinkList {
    
    private Link first;


    public LinkList(){
        first = null;
    }

    public void displayList(){

        Link currunt = first;

        while(currunt != null){
            currunt.displayLink();
            currunt = currunt.next;
        }
    }

    //you can change the datatype based on your need 
    public boolean find(int key){

        Link cur = first;
        while(cur != null){
            if(cur.iData == key){
                return true;
            }
            else{
                cur = cur.next;
            }
        }
        System.out.println("Value is not found in linkList");
        return false;
    }

    public void insertFirst(int num){

        Link newLink = new Link(num);

        newLink.next = first;
        first = newLink;  

    }

    public boolean insertAfter(int key, int data){
        
        Link newLink = new Link(data);

        Link currunt = first;

        while(currunt != null){

            if(currunt.iData == key){
                newLink.next = currunt.next;
                currunt.next = newLink;
                return true;
            }
            else{
                currunt = currunt.next;
            }
        }
        return false;

    }

    public Link deleteFirst(){

        Link temp = first;

        first = first.next;

        return temp;
    }

    public boolean delete(int key){

        Link currunt = first;
        Link previous = first;

        while(currunt != null){

            if(currunt.iData == key){

                if(currunt == first){   //if first is deleting
                    first = first.next;
                    return true;
                }
                else{                   //if middle is deleting
                    previous.next = currunt.next;
                    return true;
                }  
            }
            else{
                previous = currunt;
                currunt = currunt.next;
            }
        }
        return false;
    }
}
