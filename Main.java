import java.util.*;
import java.lang.*;
public class Main{
    

    public static ArrayList<Integer> gameresult(ArrayList<ArrayList<Integer>> aList){
        ArrayList<Integer> player1= new ArrayList<Integer>(9);
        ArrayList<Integer> player2= new ArrayList<Integer>(9);
        ArrayList<Integer> c1=new ArrayList<Integer>(3);
        int x=0;
        int y=0;
        
        for(int i=0; i<9; i++){
        for(ArrayList<Integer> a : aList){
            x= a.get(0);
            c1.add(x);
            x=0;
        }
        y= Collections.max(c1);
        if(i%2==0)
        player1.add(y);
        else 
        player2.add(y);
        
        /*for(ArrayList<Integer> a : aList){
        Iterator<Integer> itr = a.iterator();
        while (itr.hasNext()) {
            //Integer number = itr.next();
            if (a.get(0) == y) {
                a.remove(y);
            }
        }
        }*/
        
        for(ArrayList<Integer> a : aList){
        if(a.get(0)==y)    
        a.remove(0);
        }
        y=0;
        
        }
        return player1;
    }



    public static void main(String[] args) 
    { 
        int n = 3; 
        ArrayList<ArrayList<Integer> > aList = new ArrayList<ArrayList<Integer> >(n); 
        ArrayList<Integer> a1 = new ArrayList<Integer>(); 
        a1.add(1); 
        a1.add(2); 
        a1.add(21); 
        aList.add(a1); 
  
        ArrayList<Integer> a2 = new ArrayList<Integer>(); 
        a2.add(5);
        a2.add(12); 
        a2.add(4); 
        aList.add(a2); 
  
        ArrayList<Integer> a3 = new ArrayList<Integer>(); 
        a3.add(10); 
        a3.add(20); 
        a3.add(30); 
        aList.add(a3); 
  
        for (int i = 0; i < aList.size(); i++) { 
            for (int j = 0; j < aList.get(i).size(); j++) { 
                System.out.print(aList.get(i).get(j) + " "); 
            } 
            System.out.println(); 
        } 
        System.out.println(gameresult(aList));
    } 
}
