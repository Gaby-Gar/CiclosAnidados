/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class BucleAnidados2 {
    
    public void Abecedario(){
        for (char x = 'Z'; x >= 'A'; x--) {
            for (char y = x; y >= 'A'; y--) {                                                                          
                System.out.print(y);
            }
            System.out.println();
        }
    }    
     
    public static void main(String[] args) {
        BucleAnidados2 ABC = new BucleAnidados2();
        ABC.Abecedario();
    }
}
