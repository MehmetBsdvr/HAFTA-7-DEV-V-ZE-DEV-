
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Pisagor üçlemesi hesaplayan program
ÖRN:(a<b<c, a^2+b^2=c^2,a+b+c=N)

*/
/**
 *
 * @author Mehmet
 */
public class SORUD45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("SAYINIZI GİRİNİZ");
        int N=input.nextInt();
        for(int a=1;a<=N;a++){
            for(int b=a+1;b<=N-a;b++){
                int c=N-(a+b);
                if((Math.pow(a, 2)+Math.pow(b, 2))==(Math.pow(c, 2))){
                    System.out.printf("%d\t",a,b,c,a*b*c);
                }
            }
        }
    }
    
}
