/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class SORUB21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
        /*Leyland sayıları x^y+y^x sayılarını yazdıran program*/
        System.out.println("Sayı1 giriniz ");
        int x=input.nextInt();
        
        System.out.println("Sayı2 giriniz ");
        int y=input.nextInt();
        
        for(int i=2;i<x;i++){
            for(int j=2;j<y;j++){
                System.out.println("Leylan sayı:"+(Math.pow(i, j)+Math.pow(j, i)));
            }
        
        
    }
        
        
        
       
        
        
        
    }
}
