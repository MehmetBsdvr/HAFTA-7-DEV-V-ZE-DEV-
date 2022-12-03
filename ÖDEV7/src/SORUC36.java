
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
0-99 arasındaki sayıların fibonacci  1,2,3,5,8,13
*/
/**
 *
 * @author Mehmet
 */
public class SORUC36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        int s = 0;
        for(int i=0;i<=9;i++){
            for(int j=0;j<=9;j++){
                s=(i+j);
            
            if( (s==1) || (s==2) || (s==3) || (s==5) || (s==8) || (s==13) ){
             }   
                else{
                
                      System.out.println("0-99 arasındaki sayıların fibonacci"+(10*i+j));
                        }
            }
        }
    }
    
}
