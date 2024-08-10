package Pattern3;
import java.util.*;
public class pattern3 {
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        int n = Scan.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 5 - i + 1; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
