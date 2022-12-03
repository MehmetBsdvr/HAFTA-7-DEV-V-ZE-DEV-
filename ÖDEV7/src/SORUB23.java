/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Dost sayı yazdıran program
*/

/**
 *
 * @author Mehmet
 */import java.util.Scanner;
public class SORUB23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        
        System.out.println("Sayı1 giriniz ");
        int a=input.nextInt();
        
        System.out.println("Sayı2 giriniz ");
        int b=input.nextInt();
        
        int ta=0;int tb = 0;
        
        for(int i=1;i<=a;i++){
            if(a%i==0){
                ta=ta+i;
            }
            for(int j=1;j<=b;j++){
                if(b%j==0){
                    tb=tb+j;
                }
             }   
                if(ta==b &&  tb==a){
                    System.out.println(" Dost sayıdır ");
                }
                else{
                    System.out.println(" Dost sayı degildir ");
                }
            System.out.println( );
        }
        
    }
    
}
