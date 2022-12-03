
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
        System.out.println("SAYINIZI GİRİNİZ");
        int a=input.nextInt();
        int s=0,t=0;
        for(int i=1;1<=a;i++){
            if(a%i==0){
                s=s+1;
                t=t+1/i;
            }
            double ho =s/t;
            if(ho==(s/t)){
                System.out.println("Ore sayı ");
                break;
            }
            else{
                System.out.println(" Ore sayı degildir ");
                break;
            }
        }
    }

    
    }
    

