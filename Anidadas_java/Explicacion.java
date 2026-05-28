
package explicacion;
import java.util.Scanner;
public class Explicacion {
    static Scanner sc= new Scanner(System.in);
  
    public static void main(String[] args) {
        int v1 [][] = new int [3][3]; 
        for(int i = 0 ; i<3; i++ ){
            for(int j= 0 ; j<3 ; j++){
                System.out.println("Rellene la matriz");
                v1[i][j] = sc.nextInt();
                
            }
            }
         for(int i = 0 ; i<3; i++ ){
             System.out.println();
            for(int j= 0 ; j<3 ; j++){
                System.out.print(v1[i][j]);
            }
            }
    }
    
    
}
