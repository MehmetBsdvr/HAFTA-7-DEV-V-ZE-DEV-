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
public class SORUA18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*İKİ ASAL SAYI  19-17=2 5-3=2*/
          Scanner input =new Scanner(System.in);
          
          System.out.println("Sayını giriniz");
          int n=input.nextInt();
          
          int S=0;
          for(int i=3;i<=n;i++){
              int k=0;
              for(int j=2;i<=i-1;j++){
                  if(i%j==0){
                      k=k+1;
                  }
                  if(k==0){
                      S=S+1;
                      S=i;
                }  
              }
            }   
            for(int i=1;i<=S-1;i++){
                if((i+1)-i==2){
                    System.out.printf("İKİ ASAL SAYI: %d/%d",i,(i+1));
                    
            }    
               
         }     
          
    }
}

    
    
    

