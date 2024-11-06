import java.util.ArrayList;

public class pairSum1 {
    public static boolean pairSum1brute(ArrayList<Integer> list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;i<list.size();j++){
                if(list.get(i)+list.get(j)== target){
                  return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=15;
        System.out.println(pairSum1brute(list,target));
    }
}
