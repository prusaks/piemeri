
package test;

import java.util.Arrays;


public class Test {
    public static final int IZMERS = 7;
    
    public static void main(String[] args) {
        
        int [][] mas = new int[IZMERS][IZMERS];
        
        for(int i = 0; i < IZMERS; i++){
            int k = 0;
            for(int j = 0; j <= i; j++, k++){
                mas[i-k][j] = i + 1;
                mas[IZMERS-1-i+k][IZMERS-1-j] = IZMERS*2 - 1 - i;
            }
        }

        for(int i = 0; i < IZMERS; i++){
            for(int j = 0; j < IZMERS; j++){
                if(mas[i][j] < 10){
                    System.out.print(mas[i][j]+"  ");
                } else {
                    System.out.print(mas[i][j]+" ");
                }            
            }
            System.out.println("");
        }
    }
    
}
