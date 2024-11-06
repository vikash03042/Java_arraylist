import java.util.ArrayList;
public class arr1{
public static void main(String[] args) {
    // java collection Framework
    ArrayList<Integer> list= new ArrayList<>();
    ArrayList<String> list2=new ArrayList<>();
    ArrayList<Boolean> list3=new ArrayList<>();

list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);

System.out.println(list);

// For Get Operation
int element= list.get(2);
System.out.println(element);
// for Remove Operation
list.remove(2);
System.out.println(list);
// Set element at index
list.set(2 ,6);
System.out.println(list);
// For contains
System.out.println(list.contains(1));
list.add(2,10);
System.out.println(list);
System.out.println(list.size());


// To print ArrayList
for(int i=0; i<list.size();i++){
    System.out.print(list.get(i)+" ");
 
}
System.out.println();
}



}