package LinkedList;

public class LinkedList {
    Node head;
    public void insert(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            return;
        }

        Node curr = head;
        while(curr.link!=null){
            curr = curr.link;

        }
        curr.link = newnode;

    }

    public void print(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr = curr.link;

        }
        System.out.println();
    }

    public void insert(int data, int target){
        Node newnode = new Node(data);

        if(target ==1){
            newnode.link = head;
            head = newnode;
            return ;

        }

        Node temp = head;

        for(int i=1; i<target -1; i++){
            if(temp==null){
                System.out.println("Position out of Range ");
                
                return ;

            }
            temp = temp.link;

        }

        newnode.link = temp.link;
        temp.link = newnode;
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        // list.insert(10);
        // list.insert(20);
        // list.insert(30);

        list.print();

        list.insert(25, 3);

        list.print();

    }
    
}
