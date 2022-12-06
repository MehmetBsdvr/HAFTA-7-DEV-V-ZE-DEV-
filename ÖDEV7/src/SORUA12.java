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
public class SORUA12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Altın üçken oranı. Uzun kenarları eşit vebu kenarlardan birinin kısa
        kenara oranı altın orana eşitse ikiz kenar altın oran denir*/
        Scanner input =new Scanner(System.in);
        
        System.out.println("Altın üçken oranı giriniz");
        double a=input.nextDouble();
        
        double b=(double)(a*(1+Math.pow(5,(1/2)))/2);
        System.out.println("Kısa kenar"+a+"Altın oran"+b);
    }
    
}
