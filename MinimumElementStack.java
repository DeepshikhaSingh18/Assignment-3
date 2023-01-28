package Assignment3;
import java.util.*;
public class MinimumElementStack {
    Stack s = new Stack();
    int min;
    MinimumElementStack(){
        s = new Stack();
    }
    void min(){
        if(s.isEmpty()){
            System.out.println("Stack is Empty!!");
        }
        else{
            System.out.println("Minimum element: " +min);
        }
    }
    public void pop(){
        if(s.isEmpty()){
            System.out.println("Stack is empty!!");
            return;
        }
        int ele = (int)s.pop();
        if(ele < min){
            System.out.println(min);
            min = 2*min - ele;
        }
        else{
            System.out.println(min);
        }
    }
    public void push(int x) {
        if (s.isEmpty()) {
            min = x;
            s.push(x);
            return;
        }
        if (min > x){
            s.push(2*x - min);
            min = x;
        }
        else{
            s.push(x);
        }
    }
    public static void main(String[] args) {
        MinimumElementStack s1 = new MinimumElementStack();
        s1.push(100);
        s1.push(90);
        s1.push(80);
        s1.push(70);
        s1.push(60);
        s1.min();
        s1.pop();
        s1.min();


    }
}
