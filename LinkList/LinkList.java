package LinkList;

public class LinkList {
    
    private Link first;


    public LinkList(){
        first = null;
    }

    //display the link list 
    public void displayList(){

        Link current = first;

        while( current != null ){
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    //you can change the datatype based on your need 
    //find Link
    public Link find(int key){

        Link current = first;

        while(current != null){
            if(current.iData == key){
                return current;
            }
            else{
                current = current.next;    
            }
        }
        System.out.println("Link with"+key+"is not found");
        return null;
    }

    //insert new link to first in LinkList
    public void insertFirst(int num){

        Link newLink = new Link(num);

        newLink.next = first;
        first = newLink;
    }

    //insert into middle
    public void insetAfter(int key,int num){

        Link newLink = new Link(num);

        Link current = first;

        while (current != null) {
            if(current.iData == key){
                newLink.next = current.next;
                current.next = newLink;
                System.out.println("new link inserted after"+":"+key);
                return;
            }
            else{
                current = current.next;
            }
        }
        System.err.println("No link found match to"+":"+key);
    }

    //delete first Link of list
    public Link deleteFirst(){

        Link temp = first;
        first = first.next;

        return temp;
    }

    //delete After
   public boolean deleteAfter(int key){

    Link currrent = first;
    Link previous = first;

    while (currrent != null) {

        if(currrent.iData == key){

            if(currrent == first){  //if key is first Link

                first = first.next;
                return true;
            }
            else{
                previous.next = currrent.next;  //if key is middle Link
                return true;
            }
        }else{
            previous = currrent;
            currrent = currrent.next;
        }   
    }
    return false;
   }

    //delete After if have multiple keys
    public void deleteMultipleKey(int key){

        Link current = first;
        Link previous = first;
        int LinkDeleted = 0;

        while (current != null) {

            if(current.iData == key){

                if(current == first){
                    first = first.next;
                    LinkDeleted++;
                }
                else{
                    previous.next = current.next;
                    LinkDeleted++;
                }
            }
            
            previous = current;
            current = current.next;
        }
        if(LinkDeleted > 0){
            System.out.println("Link deleted:"+" "+key);
        }
        else{
            System.err.println("Link with"+" "+key+" "+"not found");
        }
    }
}
