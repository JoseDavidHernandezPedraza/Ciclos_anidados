
package ciclos;
import java.util.Scanner;
public class Ciclos {
   
    public static void main(String[] args) {
           Scanner sc= new Scanner (System.in);    
           
        int v1 [][] = new int [3][3];
        System.out.println("digite elementos de una matriz");
        for (int i = 0 ; i<3 ; i++){
            for (int j = 0 ; j<3 ; j++){
                System.out.println("rellene la matriz");
                v1[i][j]= sc.nextInt();
                           
        }
        }
        for (int i = 0 ; i<3 ; i++){
            System.out.println("");
            for (int j = 0 ; j<3 ; j++){
            System.out.print(v1[i][j]);
                    }

    }
        System.out.println("");
        
        int k=0;
        for (int i = 0 ; i<3 ; i++){
            k += v1[i][i];
                        
                    }
        System.out.println("suma" +"="+ k);
        
                    }
                        
        
    }
    

