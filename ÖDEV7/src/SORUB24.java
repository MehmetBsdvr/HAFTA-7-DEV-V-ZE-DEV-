/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Armstrog sayıları 153=1^3+5^3+3^3 seklin de  yazılan sayılar programı java kodu
*/

/**
 *
 * @author Mehmet
 */
import java.util.Scanner;

public class SORUB24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        for(int i=1;i<=9;i++){
            for(int j=0;j<=9;j++){
                for(int k=0;k<=9;k++){
                    int S= (int) 100*i+10*j+k;
                    if(S==(Math.pow(i,3)+Math.pow(j, 3)+Math.pow(k, 3))){
                        System.out.println("Armstrong sayıları: "+S);
                    }
                }
            }
        }
    }
    
}
