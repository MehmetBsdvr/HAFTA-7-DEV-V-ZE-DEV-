
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
public class SORUC31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Aritmetik sayı  6  (1+2+3+6)/4=3 tamsayı esit*/
        Scanner input=new Scanner(System.in);
        System.out.println("SAYINIZI GİRİNİZ");
        int N=input.nextInt();
        
        int t=0,s=0;
        for(int i=1;i<=N;i++){
            if(N%i==0){
                t=t+i;
                s=s+1;
            }
            
            if(t/s==(t/s)){
                System.out.println("Aritmetik sayıdır");
                break;
            }
            else{
                System.out.println("Aritmetik sayı degildir");
                break;
            }
        
        }
    }
    
}
