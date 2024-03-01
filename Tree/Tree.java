package Tree;

public class Tree {
    
    private Node root;

    public Tree(){
        root = null;
    }

    //insert 
    public void insert(int id, double gpa){

        Node newNode = new Node(id,gpa);

        if(root == null){   //no node in root
            root = newNode;
        }
        else{
            Node current = root;
            Node parent;

            while(true){
                parent = current;

                if(id < current.ITnumber){ //go left

                    current = current.leftChild;
                    if(current == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else{  //go right

                    current = current.rightChild;
                    if(current == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    //find
    public Node find(int ID){

        Node current = root;

        while (current.ITnumber != ID) {
            
            if(ID > current.ITnumber){
                current = current.rightChild;
            }
            else{
                current = current.leftChild;
            }
            if(current == null){
                return null;
            }
        }
        return current;
    }
}
