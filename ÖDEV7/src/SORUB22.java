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
public class SORUB22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Hilber sayı 4*k-1 seklinde olan sayıları yazdıran program*/
        Scanner input=new Scanner(System.in);
        System.out.println("Sayını giriniz");
        int s=input.nextInt();
        
        if((s-1)%4==0){
            System.out.print("Hilbert sayıdır ");
        }
        else{
            System.out.print("Hilber sayı degildir ");
        }
    }
    
}
