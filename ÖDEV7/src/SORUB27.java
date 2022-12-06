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
public class SORUB27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herecnn
        /*Tau sayı  18 bölen leri sayısına  bölünen  1,2,3,6,9,18 = 6 (18/6=3)*/
        Scanner input=new Scanner(System.in);
        System.out.println("Sayını giriniz");
        int n=input.nextInt();
        
        int s=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                s=s+1;
            }
            if(n%s==0){
                System.out.println("Tau sayısı dır");
                        
            }
            else{
                System.out.println("Tau sayısı degil");
            }
        }
    }
    
}
