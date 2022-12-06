
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
ORE SAYI HARMONİK ORATALA BENZER İSLEM
*/

/**
 *
 * @author Mehmet
 */
public class SORUB29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Sayınızı giriniz");
        int N=input.nextInt();
        int S=0,T=0;
        for(int i=1;i<=N;i++){
            if(N%i==0){
                S=S+1;
                T=T+1/i;
            }
            double H=S/T;
            if(H==Math.ceil(H)){
                System.out.println("Ore sayı");
                break;
            }
            else{
                System.out.println("Ora sayı degildir");
                break;
            }
        }
    }

    
    }
    

