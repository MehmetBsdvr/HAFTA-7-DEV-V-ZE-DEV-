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
public class SORUA15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        İki basamağı asal sayı yazdıra program*/
        Scanner input=new Scanner(System.in);
        for(int i=2;i<=7;i++){
            for(int j=2;j<=7;j++){
                if(i==2 || i==3 || i==5 || i==7 && j==2 || j==3 || j==5 || j==7){
                    System.out.println("iki basamagı asal sayı:"+10*i+j);
                }
            }
        }
    }
    
}
