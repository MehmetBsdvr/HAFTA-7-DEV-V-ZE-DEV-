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
public class SORUA17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Mükemmel sayı bulan program  örn 1+2+3=6*/
        Scanner input =new Scanner(System.in);
        
        System.out.println("Sayınızı giriniz");
        int a=input.nextInt();
        
        int S=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                S=S+i;
            }
            if(a==S){
                System.out.println("Mükemmel sayıdır: ");
            }
            else{
                System.out.println("Mükemmel sayı degildir: ");
            }
        }
    }
    
}
