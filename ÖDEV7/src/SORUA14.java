/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
ASAL SAYILAR
*/

/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class SORUA14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        ASAL SAYI BULMA  PROGRAM
        */
        Scanner input=new Scanner(System.in);
        
        System.out.println("ASAL SAYI BULMA İSLEMİ");
        
        System.out.println("Sayı Dizisini giriniz");
        int N=input.nextInt();
        input.nextLine();
        int[] sayı=new int[N];
        for(int i=0;i<sayı.length;i++){
            System.out.println("Dizi"+(i)+" . Sayı degerlerini giriniz :");
            sayı[i]=input.nextInt();
            input.nextLine();
        }
        for(int sayılar:sayı){
            for(int j=2;j<sayılar;j++){
                if(sayılar%j==0){
                    System.out.println("Asal Degildir");
                    break;
                }
                else{
                    System.out.println("Asal sayı");
                    break;
                }
            }
        }
    }    
}               
  
