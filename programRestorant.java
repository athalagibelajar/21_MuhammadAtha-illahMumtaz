package Tugas;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SMK TELKOM 25
 */
public class programRestorant {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean status = true;
        int harga,bayar,full = 0;
        int total = 0;
        do{
        System.out.println("SELAMAMT DATANG DI RESTORANT\nSilahkan pilih menu dibawah ini\nMAKANAN:");
        System.out.println("1.Guarame Bakar\n2.Ayam Bakar\n3.Kepiting Asam Manis\nMINUMAN:");
        System.out.println("4.Es teh\n5.Jus Semangka\n6.Kopi Hitam");
        int barang = s.nextInt();
        switch(barang){
            case 1:
                harga = 25000;
                total +=harga;
                break;
            case 2:
                harga = 20000;
                total +=harga;
                break;
            case 3:
                harga = 35000;
                total +=harga;
                break;
            case 4:
                harga = 5000;
                total +=harga;
                break;
            case 5:
                harga = 10000;
                total +=harga;
                break;
            case 6:
                harga = 5000;
                total +=harga;
                break;
                 default:
                harga = 0;
                break;
        }
        System.out.println("Apakah beli lagi? (ya/tidak)");
        String lagi = s.next();
        
        if(lagi.equalsIgnoreCase("Tidak")){
            status=false;
        }
        
        }while(status);
        System.out.println("Total Harga:Rp."+total);
        System.out.print("Uang yang dibayarkan:");
        bayar = s.nextInt();
        
        if (bayar == total) {
            System.out.println("Uang anda pas");
        }
        else if (bayar > total) {
        System.out.println("Uang anda lebih,ini kembaliannya Rp."+(bayar-total));
    }
        else if (bayar < total){
            System.out.println("Uang anda kurang");
        
    }
        }
}
