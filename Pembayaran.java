/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalprojectoop;

/**
 *
 * @author User
 */
public class Pembayaran {
    static int totalHarga, jumlahBayar, kembalian = 0;  
    
    public static int hitungHarga(Order<Makanan> makanan, Order<Minuman> minuman){
        int harga, jumlah, total, count = 1;
        String nama;
        Order itemOrder;
        
        // hitung harga makanan
        for (int i = 0; i < makanan.orderList.size(); i++, count++) {
            itemOrder = makanan.orderList.get(i);
            harga = itemOrder.item.harga;
            nama = itemOrder.item.nama;
            jumlah = itemOrder.jumlah;
            total = jumlah * harga;
            System.out.println("%d. %s x %d = %d".formatted(count, nama, jumlah, total));            
            totalHarga += total;
        }
        
        // Hitung harga minuman
        for (int i = 0; i < minuman.orderList.size(); i++) {
            itemOrder = minuman.orderList.get(i);
            harga = itemOrder.item.harga;
            nama = itemOrder.item.nama;
            jumlah = itemOrder.jumlah;
            total = jumlah * harga;
            System.out.println("%d. %s x %d = %d".formatted(count, nama, jumlah, total));            
            totalHarga += total;
        }
        
        System.out.println("Total harga = %d".formatted(totalHarga));
        
        return totalHarga;
    }    
    public static int bayar(int jumlahBayar){
        do {            
            if (kembalian < 0) {
                System.out.println("Jumlah uang yang dimasukkan kurang!");
                System.out.print("Masukkan Uang Pembayaran : ");
                jumlahBayar = FinalProjectOOP.input.nextInt();
                Pembayaran.jumlahBayar = jumlahBayar; 
            }
            else{
                Pembayaran.jumlahBayar = jumlahBayar; 
            }    
            kembalian = jumlahBayar-totalHarga; 
        } while (kembalian < 0);
        
        System.out.println("Kembalian = %d".formatted(kembalian));
        
        return kembalian;
    }    
    
    // untuk GUI
//    public void updateJumlah(){}    
//     public void reset(){}    
}