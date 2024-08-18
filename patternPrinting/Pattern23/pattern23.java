package Pattern23;
import java.util.*;
public class pattern23 {
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        int n = Scan.nextInt();

        for(int i = 0; i <n; i++){
            for(int j = 0; j < n; j ++){
                if(i <= n/2 && i+j>=n/2 && j-i<=n/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
