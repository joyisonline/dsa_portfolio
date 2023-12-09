import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        
        while (true) {
            System.out.println("=====================");
            System.out.println("STACK OPERATIONS");
            System.out.println("[1] - Push");
            System.out.println("[2] - Pop");
            System.out.println("[3] - Print");
            System.out.println("[4] - Top");
           System.out.println("==========================");
            System.out.print("ENTER YOUR CHOICE: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("ENTER THE ELEMENT TO PUSH: ");
                    
                    int element = scanner.nextInt();
                    stack.push(element);
                    System.out.println(element + " got pushed onto the stack.");
                    break;
                
                case 2:
                    if (!stack.isEmpty()) {
                        int poppedElement = stack.pop();
                        System.out.println("Popped element: " + poppedElement);
                    } else {
                        System.out.println("Stack is empty. Cannot pop.");
                    }
                    break;
                
                case 3:
                    if (!stack.isEmpty()) {
                        System.out.print("Stack: ");
                        for (Integer item : stack) {
                            System.out.print(item + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                
                case 4:
                    System.out.println("Top: " + stack.peek());
                    break;
              
            }
        }
    }
}