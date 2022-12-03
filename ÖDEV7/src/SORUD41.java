
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
public class SORUD41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("SAYINIZI GİRİNİZ");
        int F2=input.nextInt();
        int a=(int) ((1+Math.pow(5,5))/2);
        int f1=(int)(F2/a);
        int f3=(int)(F2*a);
        System.out.println("Fibonnaci (N) Triboncci:"+(f1));
        System.out.println("Fibonnaci (N) Triboncci:"+(F2));
        System.out.println("Fibonnaci (N) Triboncci:"+(f3));
    }
    
}
