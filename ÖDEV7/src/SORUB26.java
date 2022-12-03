/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Eksik sayı 15  1+3+5+15=24   30>24 seklin de sayılarra denir 
*/

/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class SORUB26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println(" Sayını giriniz ");
        int s=input.nextInt();
        
        int T=0;
        for(int i=1;i<=s;i++){
            if(s%i==0){
                T=T+i;
            }
            if(T<2*s){
                System.out.println("Eksik sayıdır ve eksik miktarı"+(2*s-T));
            }
            else{
                System.out.println("Eksik sayı degildir");
            }
        }
    }
    
}
