
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Fibonnaci Negatifi
*/
/**
 *
 * @author Mehmet
 */
public class SORUC38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("SAYINIZI GİRİNİZ");
        int N=input.nextInt();
        
        int a=1,b=-1,c;
        for(int i=0;i<=N-2;i++){
            c=a;
            a=b;
            b=b+c;
            System.out.println(" C "+c+" A "+a+" B "+b);
        }
    }
    
}
