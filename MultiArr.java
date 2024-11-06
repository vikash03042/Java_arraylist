import java.util.*;

public class MultiArr {
    public static void main(String[] args) {
    //     ArrayList<ArrayList<Integer>> multilist=new ArrayList<>();
    //     ArrayList<Integer> list1=new ArrayList<>();
    //     list1.add(2);
    //     list1.add(7);
    //     list1.add(5);
    //     ArrayList<Integer> list2=new ArrayList<>();
    //     for(int i=0;i<5;i++){
    //         list2.add(i*2);
    //     }
    //     ArrayList<Integer> list3=new ArrayList<>();
    //     for(int i=0;i<5;i++){
    //         list3.add(i*3);
    //     }
    //  multilist.add(list1);
    //  multilist.add(list2);
    //  multilist.add(list3);
    //  System.out.println(multilist);
    //  for(int j=0;j<multilist.size();j++){
    //     ArrayList<Integer> currlist= multilist.get(j);
    //     for(int k=0;k<currlist.size();k++){
    //         System.out.print(currlist.get(k));
    //     }
    //      System.out.println();
    //  }
    ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
    ArrayList<Integer> list1=new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    ArrayList<Integer> list3=new ArrayList<>();
    for(int i=1;i<=5;i++){
list3.add(3*i);
    }
    for(int i=1;i<=5;i++){
     list1.add(i);   
    }
    for(int i=1;i<=5;i++){
        list2.add(2*i);
    }
    mainList.add(list1);
    mainList.add(list2);
    mainList.add(list3);
    System.out.println(mainList);
    }
    
}
