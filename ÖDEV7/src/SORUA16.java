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
public class SORUA16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Asal carpanları 1' den büyük yazdıran program*/
        
        Scanner input=new Scanner(System.in);
        System.out.println("Sayınızı giriniz");
        int n=input.nextInt();
        
        int s=2;
        while(n>1){
            if(n%s==0){
                n=n/s;
                System.out.printf("%d\t",s);
                        }
                else{
                      s=s+1;  
                        }
            }
        }
    }
    

