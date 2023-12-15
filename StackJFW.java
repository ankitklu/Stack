import java.util.*;
public class StackJFW{
    public static void pushBottom(Stack<Integer>s,int item){
        if(s.isEmpty()){
            s.push(item);
            return;
        }
        int top=s.pop();
        pushBottom(s,item);
        s.push(top);
    }
    public static String reverseStr(String str){
        Stack<Character>s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result= new StringBuilder("");
        while(!s.isEmpty()){
            char curr= s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static boolean balString(String str){
        Stack<Character>s1=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                s1.push(ch);
            }
            else{
                if(s1.isEmpty()){
                    return false;
                }
                if((s1.peek()=='(' && ch==')') || (s1.peek()=='{' && ch=='}')||(s1.peek()=='[' && ch==']')){
                    s1.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s1.isEmpty()){
            return true;
        }
        return false;
    }
    public static boolean dupParantheses(String str)
    {
        Stack<Character>s2=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch=='('){
                s2.push(ch);
            }
            else{
                int count=0;
                while(ch!=')'){
                    s2.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                else{
                    s2.pop();
                }
            }
            s2.push(ch);
        }
        return false;
    }
    public static void nextGreaterRight(int arr[]){
        int nxtGreater[]=new int[arr.length];
        Stack<Integer>s3=new Stack<>();
        nxtGreater[0]=1;
        s3.push(1);

        for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            while(!s3.isEmpty() && arr[s3.peek()]<=curr){
                s3.pop();
            }
            if(s3.isEmpty()){
                nxtGreater[i]=-1;
            }
            else{
                nxtGreater[i]=arr[s3.peek()];
            }
        }
        for(int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
    }

    public static void reverseNum(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseNum(s);
        pushBottom(s, top);
    }

    
    // public static void spanning();


    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String args[]){

        Stack<Integer>s=new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pushBottom(s,4);
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        // String result=reverseStr("abc");
        // System.out.println(result);
        
        s.push(1);
        s.push(2);
        s.push(3);
        // printStack(s);
        reverseNum(s);
        System.out.println();
        printStack(s);
    }
}