
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Fibonaci sayı sı  1 1 2 3 5 8 13 21 seklinde yazdıran program
*/
/**
 *
 * @author Mehmet
 */
public class SORUC34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("SAYINIZI GİRİNİZ");
        int N=input.nextInt();
        
        int a=1,b=1,c;
        for(int i=1;i<=N;i++){
            c=a;
            a=b;
            b=b+c;
            System.out.println(" C "+c+" A "+a+" B "+b);
        }
        
    }
    
}
