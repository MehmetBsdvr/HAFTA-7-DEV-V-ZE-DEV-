/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Hetormanik sayı a(a+1) seklinde yazılan sayılar
*/
/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class SORUB28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("SAYINIZI GİRİNİZ");
        int n=input.nextInt();
        
        for(int a=1;a<=n;a++){
                System.out.printf("Heterometrik sayı 2=1.2,6",a,a+1,a*(a+1));
                
    }
        System.out.println();
    
}}
