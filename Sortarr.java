import java.util.*;
public class Sortarr {
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        
        list.add(15);
        list.add(2);
        list.add(30);
        list.add(4);
        list.add(5); 
        list.add(60);
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);

    
// For decending order
    Collections.sort(list,Collections.reverseOrder());
    System.out.println(list);
    }
}
