package Assignment3;

import java.util.*;

public class ReverseStack {
    public static void insertAtLast(Stack s, int element){
        if(s.empty()){
            s.push(element);
            return;
        }
        int top = (int)s.pop();
        insertAtLast(s,element);
        s.push(top);
    }
    public static void reverseStack(Stack s){
        if(s.empty()){
            return;
        }
        int element = (int)s.pop();
        reverseStack(s);
        insertAtLast(s,element);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack s = new Stack<>();
        for(int i=0; i<n; i++){
            s.push(i);
        }
        System.out.println("Original stack : "+ s);
        reverseStack(s);
        System.out.println("Reverses stack: "+s);

    }
}
