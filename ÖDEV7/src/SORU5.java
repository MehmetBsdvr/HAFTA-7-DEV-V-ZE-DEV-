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
public class SORU5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
Klawyeden girilen x degeri icin yine klawyeden girilen terim sayısı (N)kadar
seriye açarak e^x 'i hesaplayan program
*/
        Scanner input=new Scanner(System.in);
        System.out.println("Terim sayısı giriniz");
        int n=input.nextInt();
        
        System.out.println("Hesaplanancak X degerini  giriniz");
        double x=input.nextDouble();
        
        double T=1,F=1;
        for(int i=1;i<=n;i++){
            F=F*i;
            T=T+Math.pow(x,i)/F;
            System.out.printf("\nSeri açılımı ile hesaplanan deger:%.5f\n",T);
            System.out.printf("Komustla x degeri: %.5f\n",Math.exp(x));

        }
        
    }
    
}
