import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int[] sequence = new int[n];
            int no1 = 0 ;
            int no0 = 0 ;
            for(int sequence_i=0; sequence_i < n; sequence_i++){
                sequence[sequence_i] = in.nextInt();
                
            }
            int count = 0 ;
            ArrayList<Integer> list = new ArrayList<>();
            list.add(sequence[0]);
            for(int i=1;i<sequence.length-1;i++){
                if(sequence[i]==1 && sequence[i+1]==0 && sequence[i-1]==0){
                    no1++;
                    
                }
                else{
                   list.add(sequence[i]);
                }
                
            }
            //System.out.println(no1);
            list.add(sequence[sequence.length-1]);
            //System.out.println(list);
            for(int i=1;i<list.size()-1;i++){
                 if(list.get(i)==0 &&  list.get(i+1) ==0 && list.get(i-1) ==0){
                    no1++;
                }
            }
          //  System.out.println(no1);
            count = no0 + no1;
            if(count%2==0){
                System.out.println("Bob");
            }
            else{
                System.out.println("Alice");
            }
        }
    }
   
}
