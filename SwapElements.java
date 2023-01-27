package Assignment3;
import java.util.*;

public class SwapElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0; i<5; i++){
            list.add(in.nextInt());
        }
        System.out.println("Before swapping: "+list);
        System.out.println("Enter element of index you want to swap" );
        int i=in.nextInt();
        int j=in.nextInt();
        Collections.swap(list,i,j);
        System.out.println("After swapping: "+list);
    }
}
