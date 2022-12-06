
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
€[1,50] seklinde yazılan x^2+y^2+z^2=3*x*y*z Markova sayı programı
*/
/**
 *
 * @author Mehmet
 */
public class SORUC30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Markov sayı");
        for(int a=1;a<=9;a++){
            for(int b=1;b<=9;b++){
                for(int c=1;c<=9;c++){
                    if((Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2))==(3*a*b*c)){
                        System.out.printf(" /Markov sayı= %d ve %d ise %d",a,b,c);
                    }
                }
            }
        }
    }
    
}
