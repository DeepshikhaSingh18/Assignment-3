package Assignment3;
import java.util.*;
public class SearchElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;

        System.out.println("Enter list element: ");
        ArrayList<Integer> list=new ArrayList<>();
        //System.out.println("Enter list element: ");

        for(int i=0; i<5; i++){
            list.add(in.nextInt());
        }
        System.out.println(list);
        int n = in.nextInt();

            if (list.contains(n)) {

                System.out.println("First index of: "+list.indexOf(n));
                System.out.println("Last index of: "+list.lastIndexOf(n));
            }
    }

}
