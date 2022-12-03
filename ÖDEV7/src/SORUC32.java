
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Polindrom sayılar  303 1001 2002 gibi sayılar  100-9999 programı
*/
/**
 *
 * @author Mehmet
 */
public class SORUC32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input=new Scanner(System.in);
       
       for(int i=1;i<=9;i++){
           for(int j=0;j<=9;j++){
               System.out.println("Palandirom sayıları: "+100*i+10*j+i);
               break;
           }
           
        }   
       for(int i=1;i<=9;i++){
               for(int j=0;j<=9;j++){
                   System.out.println("Palandirom sayıları: "+1000*i+100*j+10*j+i);
                   break;
               }
       }
    }
}
