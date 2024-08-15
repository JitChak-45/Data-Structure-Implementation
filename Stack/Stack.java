package Stack;
import java.util.*;

//Implementation of Stack Using Array Only .
class Stack<T>{
    
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

}

    

   
