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
public class SORU8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Pİ SAYISI Pİ/2=4/3*16/15*36/35*64/63 ŞEKLİNDE John Wallis ardısık çarpımıyla
        hesaplana bilmektedir. Buna göre ekrandan girilen terim sayısını kadar
        carpım yaparak pi sayısını hesaplanyan program.
        */
        Scanner input=new Scanner(System.in);
        
        System.out.println("Sayı giriniz giriniz");
        double n=input.nextDouble();
        int C=0;
        for(int i=1;i<=n;i++){
            int C1=4*i*i;
            C=C*C1/(C1-1);
        }
        System.out.println("Pİ DEGERİ: "+2*C);
    }
    
}
