
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
        
        for(int a=1;a<=50;a++){
            for(int b=a;b<=50;b++){
                for(int c=b;c<=50;c++){
                    if((a*a+b*b+c*c==3*a*b*c)){
                        System.out.printf(" €[1,50] a,b,c Markova sayı",a,b,c);
                        break;
                    }
                }
            }
        }
    }
    
}
