package Assignment3;

import java.util.*;

public class CopyElements {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        System.out.println("Enter elements of list1: " );
        for(int i=0; i<5; i++){
            list1.add(in.next());
        }
        System.out.println("Enter elements of list2: " );
        ArrayList<String> list2 = new ArrayList<>();
        for(int i=0; i<5; i++){
            list2.add(in.next());
        }
        list1.addAll(list2);
        System.out.println(list1);
    }
}
