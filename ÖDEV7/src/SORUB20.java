/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Ferman sayı listeliyen program
*/
/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class SORUB20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Ferman sayıları ");
        int n=input.nextInt();
        
        for(int i=1;i<=n-1;i++){
            System.out.println("Ferman sayı listesi:  "+Math.pow(2,(Math.pow(2, i))));
        }             
    
    }
 } 
