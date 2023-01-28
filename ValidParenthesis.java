package Assignment3;

import java.util.*;

public class ValidParenthesis {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        if(checkParenthesis(str)){
            System.out.println("Parenthesis are balanced");
        }
        else{
            System.out.println("Parenthesis are not balanced");
        }
    }
    public static boolean checkParenthesis(String str){
        Stack s = new Stack();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                s.push(c);
                continue;
            }
            if(s.isEmpty()){
                return false;
            }
            char check;
            switch (c){
                case ')':
                    check = (char) s.pop();
                    if(check == '}' || check == '}') return false;
                    break;
                case '}':
                    check = (char) s.pop();
                    if(check == ')' || check == ']') return false;
                    break;
                case ']':
                    check = (char) s.pop();
                    if(check == ')' || check =='}') return false;
                    break;
            }
        }
        return s.isEmpty();
    }
}