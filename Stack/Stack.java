package Stack;
import java.util.*;

//Implementation of Stack Using Array Only .
public class Stack<T>{
    
    private Object[]arr;
    private int index = 0;

    public Stack(int size){
        arr = new Object[size];
    }

    //now creating the methods of stack.
    public void push(T data){
        //check if the stack is full or not.
        if(index == arr.length){
            System.out.println("Stack is full!");
            return;
        }
        arr[index] = data;
        index++;
    }

    public T pop(){
        //check if the stack is empty or not.
        if(index == 0){
            System.out.println("Stack is empty!You can't pop from an empty stack.");
            return null;
        }
        index--;
        return (T)arr[index];
    }

    public T peek(){
        if(index == 0){
            System.out.println("Stack is empty!You can't peek from an empty stack.");
            return null;
        }
        return (T)arr[index-1]; //this is my 
    }

    public boolean isEmpty(){
        return index == 0;
    }

    public boolean isFull(){
        return index == arr.length;
    }

    public int size(){
        return index;
    }

    public void display(){
        System.out.print("Stack is : -> ");
        System.out.print("[");
        for(int i = 0;i<=index-1;i++){
            System.out.print(arr[i] + ","); 
        }
        System.out.println("]");
    }


    public static void main(String[] args) {
        Stack<String> s = new Stack(1000);

        int choice;
        Scanner sc = new Scanner(System.in);
        do{

            System.out.println("-----------|Stack|----------------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. isEmpty");
            System.out.println("5. isFull");
            System.out.println("6. Size");
            System.out.println("7. Display");
            System.out.println("8. Exit");
            System.out.println("-----------------------------------");


            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the data you want to push: ");
                    String data = sc.next();
                    s.push(data);
                    break;
                case 2:
                    System.out.println("Popped element is: "+ s.pop());
                    break;
                case 3:
                    System.out.println("Peek element is: "+ s.peek());
                    break;
                case 4:
                    System.out.println("Stack is empty: "+ s.isEmpty());
                    break;
                case 5:
                    System.out.println("Stack is full: "+ s.isFull());
                    break;
                case 6:
                    System.out.println("Size of the stack is: "+ s.size());
                    break;
                case 7:
                    s.display();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!Please enter a valid choice.");
            }
            }while(choice!=8);
            sc.close();
        }
        
        // s.push(21);
        // s.push(11);
        // s.push(31);
        // s.push(233);

        // s.display();
        // s.pop();
        // s.display();
    }

    

   
