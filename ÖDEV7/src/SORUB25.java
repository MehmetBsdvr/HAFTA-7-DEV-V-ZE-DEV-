/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Bağdas sayı (14,16)  1=1 4+6=10 esit olan sayılar
*/

/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class SORUB25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println(" Sayı1 girniz");
        int a=input.nextInt();
        
        System.out.println(" Sayı2 giriniz");
        int b=input.nextInt();
        
        double a1=(double)(a/10);
        double a0=(double)(a%10);
        double b1=(double)(b/10);
        double b0=(double)(b%10);
        
        if(a1==b1 && b0+a0==10){
            System.out.println(" Bağdas sayıdır ");
        }
        else{
            System.out.println(" Bağdas sayıdır degildir ");
            
        }
        
        
    }
    
}
