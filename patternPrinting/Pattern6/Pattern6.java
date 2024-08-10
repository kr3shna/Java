package Pattern6;
import java.util.*;
public class Pattern6 {
    public static void main(){
        Scanner Scan = new Scanner(System.in);
        int n = Scan.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
