/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mehmet
 */
import java.io.PrintStream;
import java.util.Scanner;
public class SORUA13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Gümüs oranı doru parcaya bölümü. (2*+b)/a=a/b=& */
        Scanner input=new Scanner(System.in);
        System.out.println("Gümüs oranı giriniz ");
        double U=input.nextDouble();
        double b=(double)(2+Math.pow(2, 5));
        int a=(int) (U-b);
        PrintStream printf = System.out.printf("gümüs oran &=(2*a+b)/a",a,b);
    }
    
}
