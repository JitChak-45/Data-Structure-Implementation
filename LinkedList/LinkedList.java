import java.util.*;

public class LinkedList {

    //Creating a Node Class.
    public static class Node{
        //define the Node properties.
        int data; //a node contain data.
        Node next; // next is pointer which will pointing the next node.

        //creating Constructor.
        Node(int data){
            this.data = data; //here this ref the curr object.
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    //Creating the methords of LinkedList.

    //1st:  Methord Create..
    public void create(){
        Scanner sc = new Scanner(System.in); //creating the Scanner object for taking the input from user.
        System.out.print("Enter the number of nodes you want to create: ");
        int n = sc.nextInt(); //taking the input from user how many nodes he want to create.
        for(int i=1; i<=n; i++){
            System.out.print("Enter the " + i + " Node data: ");
            int data = sc.nextInt(); //take data as input from user.

            //Here creating the new Node.
            Node newNode = new Node(data);

            //if only one node is created then head and tail both are pointing the same node.
            //so, that node is be my head as well as tail.
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{ //if more than one node create then i move my tail. DON'T DO ANYTHING WITH HEAD.!!!!
                tail.next = newNode;
                tail = newNode; //tail will be pointing the last create node.
            }
        }
    }

    //2nd : Methord Display..
    public void display(){
        System.out.println();
        Node curr = head; //take a pointer on head node
        while(curr != null){ //if curr is not null. 
            System.out.print(curr.data + " -> "); //then print the data of curr node.
            curr = curr.next; //move the curr to the next node.
        }
        System.out.println("NULL"); //when curr is null then print NULL.
    }

    // 3rd : Methord InsertAtBegining .
    public void insertAtBeg(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data you want to insert at the beginning: ");
        int data = sc.nextInt();
        Node newNode = new Node(data); //crating the new node with the data.
        newNode.next = head;//as i want to insert the new node at the beginning so, 
        //newnode next will be pointing the head.
        head = newNode;  // now update my head to the new node.
    }

    // 4th : Methord InsertAtEnd.
    public void insertAtEnd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data you want to insert at the end: ");
        int data = sc.nextInt();
        Node newNode = new Node(data); //creating the new node with the data.
        tail.next = newNode; // tail alway be in the last node so, 
        // i just pointing the tail next to my new craeted node.
        tail = newNode; // update my tail pointer.
        //tail always pointing the last node of the LinkedList.
    }

    //5th Size of the LinkedList.
    
    public int sizeOfLL(){
        int size = 0; //why initilze with the scope of 0 because if there is no node then size is 0.
        Node curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        return size;
    }

    // 6th : Methord inset at position.
    public void insertAtPos(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position where you want to insert the node: ");
        int pos = sc.nextInt();
        System.out.print("Enter the data you want to insert: ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        Node curr = head;
        for(int i=1; i<pos-1; i++){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }




    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList(); //creating the object of LinkedList.
        
        int choice;
        do{
            System.out.println();

            
            
            System.out.println();

            System.out.println("--------------------------------");
            System.out.println();
            System.out.print("1. Create the LinkedList.\n");
            System.out.print("2. Display the LinkedList.\n");
            System.out.print("3. Insert at the beginning.\n");
            System.out.print("4. Insert at the end.\n");
            System.out.print("5. Insert at the position.\n");
            System.out.print("6. Size of the LinkedList.\n");
            System.out.print("7. Exit.\n");
            System.out.println();
            System.out.println("---------------------------------");



            
            System.out.print("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    ll.create();
                    break;
                case 2:
                    ll.display();
                    break;
                case 3:
                    ll.insertAtBeg();
                    break;
                case 4: 
                    ll.insertAtEnd();
                    break;
                case 5:
                    ll.insertAtPos();
                    break;
                case 6:
                    System.out.println();
                    System.out.println("LinkedList Size: " + ll.sizeOfLL());  
                case 7:
                    System.out.println();
                    System.out.println("Exit from the Code");
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid choice.");
            }
        }while(choice != 7); //if ay one enter the choice  7 then exit from the code.
       
        
    }
}
