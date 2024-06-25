/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalprojectoop;

/**
 *
 * @author User
 */
public class Minuman extends Menu{
    public Minuman() {
        tipe = "Minuman";
    }
    
    @Override
    public void tambahMenu(String nama, int harga){
        Minuman newItem = new Minuman();
        newItem.nama = nama;
        newItem.harga = harga;
        daftarMenu.add(newItem);
    }
}