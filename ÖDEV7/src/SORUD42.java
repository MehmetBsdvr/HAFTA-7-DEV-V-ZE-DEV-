
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Pell sayı: Terim sayısı kadar yazdıram program
*/
/**
 *
 * @author Mehmet
 */
public class SORUD42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("SAYINIZI GİRİNİZ");
        int N=input.nextInt();
        int p1=0,p2=1;
        for(int k=1;k<=N;k++){
            int p3=2*p2+p1;
            System.out.println("Pell sayı:"+p3);
            p1=p2;
            p2=p3;
            
            
        }
    }
    
}
