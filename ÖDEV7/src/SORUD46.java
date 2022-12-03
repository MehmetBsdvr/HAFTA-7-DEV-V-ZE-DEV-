
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Dobinski formülü 
*/
/**
 *
 * @author Mehmet
 */
public class SORUD46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("SAYINIZI GİRİNİZ");
        int N=input.nextInt();
        for(int i=1;i<=N;i++){
            int t=0,f=1;
            for(int j=1;j<=100;j++){
                f=f*j;
                t=(int) (t+Math.pow(j,i/f));
                System.out.printf("%d\t",t);
            }
        }
    }
    
}
