import java.util.Scanner;
public class CreateList {  
    //Represents the node of list.  
    public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }      
    }  
  
    //Declaring head and tail pointer as null.  
    public Node head = null;  
    public Node tail = null;  
  
    //This function will add the new node at the end of the list.  
    public void add(int data){  
        //Create new node  
        Node newNode = new Node(data);  
        //Checks if the list is empty.  
        if(head == null) {  
             //If list is empty, both head and tail would point to new node.  
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            //tail will point to new node.  
            tail.next = newNode;  
            //New node will become new tail.  
            tail = newNode;  
            //Since, it is circular linked list tail will point to head.  
            tail.next = head;  
        }  
    }  
  
    //Displays all the nodes in the list  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            System.out.println("Nodes of the circular linked list: ");  
             do{  
                //Prints each node by incrementing pointer.  
                System.out.print(" "+ current.data);  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
  
    public static void main(String[] args) {  
		//Ask data drom users using Scanner method
		Scanner input = new Scanner(System.in);
        System.out.print("Enter data for 1st node: ");
        int data1 = input.nextInt();
        
		System.out.print("Enter data for 2nd node: ");
        int data2 = input.nextInt();
        
     	System.out.print("Enter data for 3rd node: ");
        int data3 = input.nextInt();
        
        System.out.print("Enter data for 4th node.");
        int data4 = input.nextInt();
        
        System.out.print("Enter data for 5th node.");
        int data5 = input.nextInt();
        
        System.out.print("Enter data for 6th node.");
        int data6 = input.nextInt();
        
        System.out.print("Enter data for 7th node.");
        int data7 = input.nextInt();
        
        System.out.print("Enter data for 8th node.");
        int data8 = input.nextInt();
        
        System.out.print("Enter data for 9th node.");
        int data9 = input.nextInt();

       CreateList cl = new CreateList();  
        
        //Adds data to the circular link list  
        cl.add(data1);  
        cl.add(data2);  
        cl.add(data3);  
        cl.add(data4);
        cl.add(data5);
        cl.add(data6);
        cl.add(data7);
        cl.add(data8);
        cl.add(data9);
        
        //Displays all the nodes present in the list  
        cl.display();
        
       int sum;
        sum = data1+data2+data3+data4+data5+data6+data7+data8+data9;
        System.out.print("The sum of all data is " + sum);
    }  
}