
package perfectnumberlist;

import java.util.Scanner;


public class PerfectNumberList {

    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("digite el numero");
        int posInt = ac.nextInt();
        
        
        public boolean isPerfect (int posInt){
            int suma=0;
            boolean numeroperfec = false;
            for(int i=1; i<posInt; i++ ){
                if(posInt%i==0){
                    suma=suma+i;
                }
            }
            if(suma==posInt){
                numeroperfec = true;
            }
            return numeroperfec; 
     }

        
     
    public PerfectNumberList() {
    }
    
    public int isDeficient (int posInt){
        int suma=0;
        for(int i=1; i<posInt; i++ ){
                if(posInt%i==1)
                    suma=suma+i;
                }
            if(posInt<suma)
                System.out.println("el numero es deficiente");
           
          return posInt;  
        
    }
}

