
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
public class SORUA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
    Kök 3 degerini sonsuz kesir ile hesaplalan program*/
        Scanner input=new Scanner(System.in);
        
        System.out.println("Bölme sayısı giriniz");
        int n=input.nextInt();
        
        double T=1;
        for(int i=0;i<n-1;i++){
            T=1+1/(2+1/T);
            
        }
        System.out.printf("Karakök(3)=%f\",1+1/T);
    }
    
}
