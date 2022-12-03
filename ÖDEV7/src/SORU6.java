/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mehmet
 */

import java.util.Scanner;
public class SORU6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
e^x degeri e^x?lim(1+x/n)^n binom açılımı kullanılarak hesaplanabilmektedir
Buna görre klavyeden girilen x,n degerlerine göre e^x i hesaplayan program
*/
        Scanner input=new Scanner(System.in);
        double x=1,n=1,s;
        System.out.printf("exp(x)=lim(1+x/n)^n\n\n");
        System.out.print("x: ");
        x=input.nextDouble();
        System.out.print("n: ");
        n=input.nextDouble();
        s=Math.pow((1+x/n),n);
        System.out.printf("\nexp(%f)=%f\n",x,s);
                
    }
    
}
