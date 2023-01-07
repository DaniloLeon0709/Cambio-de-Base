

package com.mycompany.cambiodebase;
public class CambiodeBase {

    public static void main(String[] args) {
        int x = 10; //numero decimal a convertir
        int k = 8;  //base a la cual convertir
        
        Conversion(x,k);
        
    }
    
    public static void Conversion (int x, int k){
        int n[] = new int[20];  // array de residuos
        int c = x/k;  // cosiente
        int i = 0;  // auxiliar para la posición para guardar el residuo
        n[0]=x % k;
        for(int j = 0; c>= 1; j++){
            n[j+1] = c % k;
            c /= k;
            i = j;
        }
        System.out.println(x + " base 10 = ");
        for(int j = i+1; i>= 0; i--){       //recorrer el ciclo hacia atras
            System.out.println(n[j]);
        }
        System.out.println(" base " + k);
        
    }
    
}
