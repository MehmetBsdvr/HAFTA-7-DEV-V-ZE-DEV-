
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
public class SORUA11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Kök 5 degerini sonsuz kesir ile hesaplalan program*/
        Scanner input=new Scanner(System.in);
        
        System.out.println("Bölme sayısı giriniz");
        int n=input.nextInt();
        
        int T=1;
        for(int i=1;i<n;i++){
            T=4+1/(T);  
        }
        System.out.printf("Karakök(5)=%d/",2+1/T);
       
    }
    
}    
    

