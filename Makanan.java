/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalprojectoop;

/**
 *
 * @author User
 */
public class Makanan extends Menu{
    public Makanan() {
        tipe = "Makanan";
    }
    
    @Override
    public void tambahMenu(String nama, int harga){
        Makanan newItem = new Makanan();
        newItem.nama = nama;
        newItem.harga = harga;
        daftarMenu.add(newItem);
    }
}
