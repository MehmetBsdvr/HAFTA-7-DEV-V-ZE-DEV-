
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehmet
 */
public class SORUD43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("SAYI 1 GİRİNİZ");
        int m=input.nextInt();
        System.out.println("SAYI 2 GİRİNİZ");
        int n=input.nextInt();
        

        if(m==0 || n==0){
            double D=( double)((m+n)+((m-1)+n)+((m-1)+(n-1)));
        }
        
        
    }
    
}
