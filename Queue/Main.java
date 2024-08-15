package Queue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MyQueue<String> q = new MyQueue<String>(12);
        //MyQueue<Integer> q = new MyQueue<Integer>(12);

        Scanner sc = new Scanner(System.in);
        int choice;
        String data;
        do {
            System.out.println("-----------|Queue Menu|----------------");
            System.out.println("1. Add an element to the queue");
            System.out.println("2. Remove an element from the queue");
            System.out.println("3. Peek at the front element of the queue");
            System.out.println("4. Display the queue");
            System.out.println("5. Exit");
            System.out.println("-----------------------------------");


            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element you want to add: ");
                    data = sc.nextLine();
                    q.add(data);
                    break;
                case 2:
                    System.out.println("Removed element: " + q.remove());
                    break;
                case 3:
                    System.out.println("Peek element: " + q.peek());
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid choice.");
            }
        } while (choice != 5);


        // q.add("Debu");
        // q.add("Akash");
        // q.add("Jit");
        // q.add("Sourav");
        // q.add("Arijit");
        // q.add("Tuhin");

       

        // q.display();
        // System.out.println(q.peek());
        // q.remove();
        // q.display();
        
    }
}