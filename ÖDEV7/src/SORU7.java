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
public class SORU7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
Pİ DEGERİNİ 12^(1/2)*(1-1/3.3+1/5.3^3 ) YAKLASIK HESEPLAYAN PROGRAM
*/
        Scanner input=new Scanner(System.in);
        
        System.out.println("Sayı giriniz giriniz");
        double n=input.nextDouble();
        
        int T=1;
        for(int i=1;i<=n-1;i++){
            T=(int) (T+Math.pow(-1, i)/(Math.pow((6*i+3),i)));
        
    }
        System.out.println("Pİ DEGERİ: "+Math.pow(12,1/2*T));
    }
    
}
