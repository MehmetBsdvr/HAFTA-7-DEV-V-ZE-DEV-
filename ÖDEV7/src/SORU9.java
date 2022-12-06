/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mehmet
 */
import java.io.PrintStream;
import java.util.Scanner;
public class SORU9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
    Kök 2 degerini sonsuz kesir ile hesaplalan program
    */
        Scanner input=new Scanner(System.in);
        
        System.out.println("Sayı giriniz giriniz");
        double n=input.nextDouble();
        
        double T=1;
        for(int i=0;i<=n;i++){
            T=2+1/T;
            
        }
        System.out.printf("Karakök(2)=%f\n",1+1/T);
    
    }
}
