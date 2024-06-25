/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalprojectoop;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Menu {
    String nama;
    int harga, jumlahPesanan;
    String tipe; 
    ArrayList<Menu> daftarMenu = new ArrayList<>(); 
    
    public void hitungTotal() {
        for (int i = 0; i < this.daftarMenu.size(); i++) {
            if (daftarMenu.get(i).jumlahPesanan > 0){// hitung total
                Pembayaran.totalHarga+=(
                        daftarMenu.get(i).jumlahPesanan*
                        daftarMenu.get(i).harga);
            }
        }
    }
    public void tambahMenu(String nama, int harga){
        Menu newItem = new Menu();
        newItem.nama = nama;
        newItem.harga = harga;
        daftarMenu.add(newItem);
    }
    public void lihatMenu(){ // tambahan
        String nama;
        int harga;
        // Tampilkan menu makanan dalam tabel
        System.out.println("Menu %s:".formatted(this.tipe));
        System.out.println("+----+-----------------+-------+");
        System.out.println("| No | Nama            | Harga |");
        System.out.println("+----+-----------------+-------+");
        for (int i = 0; i < daftarMenu.size(); i++) {
            nama = daftarMenu.get(i).nama;
            harga = daftarMenu.get(i).harga;
            System.out.printf("| %2d | %-15s | %5d |%n", i+1, nama, harga);
        }
        System.out.println("+----+-----------------+-------+");
    }
    public void hapusMenu(int index){
        daftarMenu.remove(index-1);
    }
    public void editMenu(String nama, int harga, int index){
        Menu menu = daftarMenu.get(index-1);
        
        if (nama == null){ // jika nama tidak diisi maka update harga
            menu.harga = harga;
        }
        else if (harga == 0){ // jika harga tidak diisi maka update nama
            menu.nama = nama; 
        }
        else {
            menu.harga = harga;
            menu.nama = nama; 
        }
    }
}
