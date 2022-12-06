/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Sin(x)fonksiyonu,Maclaurin serisini gibi açılmaktadır.
Buna göre Klavyeden girinilen X degerinin sinüs ünü belirtilen terim sayısına 
kadar seriye açarak hesaplan program
*/

/**
 *
 * @author Mehmet
 */
import java.util.Scanner;

public class SORU2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
Sin(x)fonksiyonu,Maclaurin serisini gibi açılmaktadır.
Buna göre Klavyeden girinilen X degerinin sinüs ünü belirtilen terim sayısına 
kadar seriye açarak hesaplan program
*/
        Scanner input=new Scanner(System.in);
        System.out.println("Açı degerini giriniz");
        double x=input.nextDouble();
        
        System.out.println("Terim sayısını giriniz");
        int n=input.nextInt();
        
        double T=0,F,A=1,S;
        x=Math.toRadians(A);
        S=1;
        for(int i=1;i<=n;i++){
            F=1;
            for(int j=1;j<=2*i-1;j++){
                F=F*j;
                S=S*(-1);
                T=T+S*Math.pow(x,2*i-1)/F;
            }
            System.out.printf("\nSerisi açılımı ile Hesaplanan deger:%.5f\n",T);
            System.out.printf("Komustla Hesaplanan Deger:%.5f\n ",Math.sin(x));
            }
        }
    }
    

