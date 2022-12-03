
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Fibonacci sayısının eleme mantı gıyla ekrana yazdırma
*/
/**
 *
 * @author Mehmet
 */
public class SORUD40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("SAYINIZI GİRİNİZ");
        int N=input.nextInt();
        
        int t1=1,t2=1,t3=2;
        
        for(int i=1;i<=N-1;i++){
            int t4=t1+t2+t3;
            System.out.print("Sonuç:"+t4);
            t1=t2;
            t2=t3;
            t3=t4;
        }
        
    }
    
}
