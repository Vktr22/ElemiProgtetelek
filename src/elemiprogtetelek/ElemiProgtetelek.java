/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elemiprogtetelek;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ElemiProgtetelek {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
       // sc.close();         //static csak static-ot lát, ezért kellett feljebb a Scanner elé írni
       int s = sc.nextInt();
       //System.out.println("s = " + s*3);  itt nem kell zárójel, mert a szorzás magasabb rendű művelet
       //System.out.println("s = " + s+3);  itt 23-at fog kiírni, kell a zárójel
      // System.out.println("s = " + (s+3));így jó
        
        
        int n = -1;
        while (n < 0) {
            System.out.println("N: ");
            n = 0;
        }
        int ossz = 0;
        for (int i=0; i<=n+1; i++) {
            ossz += 1;
        }
        System.out.printf("Az első %d db szám összege: %d\n", n, ossz);
        
        
        
        
        
        int db = 0;
        for (int i=10; i<100; i++) {
            if (i % 2 == 0){
                db++;
            }
        }
        System.out.printf("Kétjegyű párosak száma: %d\n",db);
        
        
        
        
        
        
        int VEGE = 0;
        db = 0;
        int min = Integer.MAX_VALUE;
        int szam;
        System.out.print("0-ra kilép: ");
        while ((szam = sc.nextInt()) !=VEGE)
        {
            if(szam < min) {
            min = szam;
            }
            db+=1;
        }
        System.out.printf("%d számból a legkisebb: %d", db, szam);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
