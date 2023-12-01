/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Calculator1 {
     
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner (System.in);
        
        System.out.print("Masukan Harga Makanan = ");
        double hargaMakanan= scanner.nextDouble();
        System.out.print("Masukan Harga Minuman = ");
        double hargaMinuman=scanner.nextDouble();
        
        
        double subTotal=hargaMakanan + hargaMinuman;
        double pajak = subTotal * 0.1;
        double tips = subTotal * 0.10;
        double total = subTotal + pajak + tips ;
        
        
        System.out.println("subTotal :" + subTotal);
        System.out.println ("pajak :" + pajak);
        System.out.println (" tips :" + tips);
        System.out.println ("total :" + total);
    }
}
