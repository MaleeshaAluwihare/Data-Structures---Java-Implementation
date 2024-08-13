package LinkList;

public class testlist {
    
    private Link first;

    public testlist(){
        first = null;
    }

    public void displayLink(){
        Link current = null;

        while(current!= null){
            current.displayLink();
            current = current.next;
        }
    }

    public Link find(int key){

        Link current = first;

        while(current!= null){
            if(current.iData == key){
                return current;
            }
            else{
                current = current.next;
            }
        }
        System.out.println("Item with "+key+"not found");
        return null;
    }

    public void insertFirst(int num){

        Link newLink = new Link(num);
        Link current = first;

        newLink.next = current;
        first = newLink;
    }

    public void insetAfter(int key, int num){

        Link newLink = new Link(num);
        Link current = first;

        while(current != null){
            if(current.iData == key){
                newLink.next = current.next;
                current.next = newLink;
                System.out.println("New livk added with key"+key);
                return;
            }
            else{
                current = current.next;
            }
        }
        System.out.println("No link found with"+key);
    }

    public Link deletefirst(){

        Link current = first;
        first = first.next;
        return current;
    }

    public boolean deleteAfter(int key){

        Link current = first;
        Link previous = first;

        while(current != null){

            if (current.iData == key){

                if(current == first){
                    first = first.next;
                    return true;
                }
                else{
                    previous.next = current.next;
                    return true;
                }
            }
            else{
                previous = current;
                current = current.next;
            }
        }
        return false;
    }
}
