/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
ln(2)= 1/2+1/12+1/30+...seklinde seriye açılarak yaklasık olarak hesaplanabilmektedir.
Ln(2) degerini hesaplanayan program
*/

/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class SORU3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
ln(2)= 1/2+1/12+1/30+...seklinde seriye açılarak yaklasık olarak hesaplanabilmektedir.
Ln(2) degerini hesaplanayan program
*/
        Scanner input=new Scanner(System.in);
        System.out.println("Açı degerini giriniz");
        double n=input.nextDouble();
        
        double T=0;
        
        for(int k=0;k<=n-1;k++){
            T=T+Math.max(2*k+1,2*k+2);
        }
        System.out.println("L(2)="+T);
       
        
    }
    
}
