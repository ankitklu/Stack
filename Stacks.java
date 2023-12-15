import java.util.*;
public class Stacks{
    static class Stack{
        static ArrayList<Integer>s=new ArrayList<>();
        public static void push(int item){
            s.add(item);
        }
        public static boolean isEmpty(){
            return (s.size())==0;
        }
        public static int peek1(){
            return (s.size()-1);
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top=s.get(s.size()-1);
            s.remove(s.size()-1);
            return top;
        }
        public static void display(){
            while(!isEmpty()){
                System.out.println(pop());

            }
        }
    }
    public static void main(String args[]){
        Stack s1=new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.display();
        // System.out.println(s1.peek1());
    }
}