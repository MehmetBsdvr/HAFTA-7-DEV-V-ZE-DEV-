
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
public class SORUC35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
       
        System.out.println("Sayını giriniz");
        int N=input.nextInt();
        
        for(int i=1;i<=N;i++){
           int fibonacci=i;
            System.out.printf("%d\t",fibonacci);
        }
        
    }

    
    
}
