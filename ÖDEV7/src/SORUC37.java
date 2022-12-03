
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*

*/
/**
 *
 * @author Mehmet
 */
public class SORUC37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("SAYINIZI GİRİNİZ");
        int N=input.nextInt();
        int ta=1,tb=1,s2=0;
        int tc=ta+tb;
        ta=tb;
        tb=tc;
        int s1=0;
        for(int i=1;i<=tc-1;i++){
            if(tc%i==0){
                s1=s1+1;
            }
            if(s1==0){
                s2=s2+1;
                System.out.println(""+tc);
            }
            else if(s2<N){
        }
        
        }    
        
    }
    
}
