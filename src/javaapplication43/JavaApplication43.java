/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

/**
 *
 * @author 1-DAM
 */
public class JavaApplication43 {

    public static void main(String[] args) {
        
        int base = 7;
        int asterisco =1;
        int espacio = base/2;
        
        while (espacio>0){
            for (int a = 0; a < espacio; a++)
                System.out.print(" ");
                for (int b = 0; b < asterisco; b++){
                    System.out.print("*");}
                System.out.println("");
                asterisco+=2;
                espacio-=1;
        }
        while (asterisco >= 1){
            for (int a = 0; a < espacio; a++)
                System.out.print(" ");
                for(int b = 0; b < asterisco; b++){
                    System.out.print("*");}
                System.out.println("");
                asterisco-=2;
                espacio+=1;
        }
    }
}
