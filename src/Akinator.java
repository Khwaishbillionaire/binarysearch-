//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Akinator {
    public static void main(String[] args){
       int a=BinarySearch();
       System.out.println(a);
       System.out.println("your number is: "+a);
    }public static int BinarySearch(){
        int str=1;int end=100;
        int mid=str+(end-str)/2;
        while(str<=end){
            mid=str+(end-str)/2;
            System.out.println("Is your number "+mid+" ?");
            Scanner sc=new Scanner(System.in);
            int target=sc.nextInt();
            if(target==0){
               return mid;
            }if(target==1){
                end=mid-1;
            }else {
                str=mid+1;
            }

        }return -1;
    }
}