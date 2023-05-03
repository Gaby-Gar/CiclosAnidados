/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclosanidados;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class BucleAnidados1 {
    int N;
    double factorial;
    Scanner sc = new Scanner(System.in);
    
    public void Factorial(){
        System.out.print("Introduce un número > 0: ");
        N = sc.nextInt();
       
        for(int i = 0; i <= N ; i++){ //para cada número desde 1 hasta N                                               
           
            //se calcula su factorial
            factorial = 1;
            for(int j = 1; j <= i; j++){
                factorial = factorial * j;
            }
            
            //se muestra el factorial
            System.out.printf("%2d! = %.0f %n", i, factorial);        
        }
    }
    
    public static void main(String[] args) {    
        BucleAnidados1 Fact = new BucleAnidados1();
        Fact.Factorial(); 
    }
}
   
    
