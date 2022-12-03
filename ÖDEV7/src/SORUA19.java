/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Cullen sayıları n*2^n+1 seklinde yazılabilen dogalsayılar listeliyen programı
*/
/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class SORUA19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Cullen sayıları ");
        int n=input.nextInt();
        
        for(int i=1;i<=n;i++){
            System.out.println("Cullen sayı  "+i*Math.pow(2, i));
                    
        }
    }
    
}
