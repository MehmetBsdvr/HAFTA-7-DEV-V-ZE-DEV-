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
import java.util.Random;
public class SORU4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  1-100 Arasındaki sayıları tamin oyunu.*/
        Random rnd = new Random();
        Scanner input=new Scanner(System.in);
        
        System.out.println("TAMİN SAYINIZI GİRİNİZ");
        int T=input.nextInt();
        
        int BS = rnd.nextInt();
        
        while(T!=BS){
            if(T<0 || T>100){
                System.out.println("1-100 Arasında sayı giriniz");
                T = input.nextInt();
            }
            else if(T<BS){
                System.out.println("Daha büyük sayı giriniz");
                T = input.nextInt();
            }
            else{
                System.out.println("Daha kücük sayı giriniz");
                T = input.nextInt();
            }
        
        System.out.println("TEBRİKLER DOGRU TAMİN ETİNİZ");
        break;}
    }
    
    }
    

