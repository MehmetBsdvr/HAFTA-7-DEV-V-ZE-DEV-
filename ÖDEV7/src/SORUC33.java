
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Üçkensel sayı  1+2+3+4=(4*(4+1))/2 seklinde yazılan sayılar
*/
/**
 *
 * @author Mehmet
 */
public class SORUC33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("SAYINIZI GİRİNİZ");
        int N=input.nextInt();
        
        for(int i=1;i<=N;i++){
            int u=(int) (i*Math.pow(i,i+1)/2);
            System.out.println(" Üçkensel sayı "+u);
        }
    }
    
}
