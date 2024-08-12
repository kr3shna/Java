package Pattern14;
import java.util.*;
public class pattern14 {
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        int n = Scan.nextInt();
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <=5-i+1; k++){
                System.out.print("-");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
