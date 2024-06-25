/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.finalprojectoop;

import java.awt.CardLayout;
import java.util.Scanner;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class FinalProjectOOP {

    static Scanner input = new Scanner(System.in);
    public static Makanan makanan = new Makanan();
    public static Minuman minuman = new Minuman();
    public static Order<Makanan> orderMakanan = new Order<>();
    public static Order<Minuman> orderMinuman = new Order<>();
    public static ViewKasir guiKasir;
    public static ViewKonfigurasiMinuman guiKonfigMinuman;
    public static ViewKonfigurasiMakanan guiKonfigMakanan;
    public static CardLayout jPanelRightcrd;
    public static JPanel jPanelRight;
    
    public static void main(String[] args) {
        // tambah makanan
        makanan.tambahMenu("Nasi putih", 3000);
        makanan.tambahMenu("Telur", 4000);
        makanan.tambahMenu("Ayam", 8000);
        makanan.tambahMenu("Bakwan Jagung", 1500);
        makanan.tambahMenu("Cah Jamur", 3000);
        makanan.tambahMenu("Ikan Goreng", 7000);
        makanan.tambahMenu("Tempe", 1000);
        makanan.tambahMenu("Tahu", 1000);
        makanan.tambahMenu("Sayur Bening", 3000);
        makanan.tambahMenu("Cah Kangkung", 3000);
        makanan.tambahMenu("Sayur Lodeh", 3000);
        makanan.tambahMenu("Nasi putih", 3000);
        makanan.tambahMenu("Telur", 4000);
        makanan.tambahMenu("Ayam", 8000);
        makanan.tambahMenu("Bakwan Jagung", 1500);
        makanan.tambahMenu("Cah Jamur", 3000);
        makanan.tambahMenu("Ikan Goreng", 7000);
        makanan.tambahMenu("Tempe", 1000);
        makanan.tambahMenu("Tahu", 1000);
        makanan.tambahMenu("Sayur Bening", 3000);
        makanan.tambahMenu("Cah Kangkung", 3000);
        makanan.tambahMenu("Sayur Lodeh", 3000);
        
        // tambah minuman
        minuman.tambahMenu("Air Mineral", 3000);
        minuman.tambahMenu("Es Teh", 3000);
        minuman.tambahMenu("Teh Hangat", 3000);
        minuman.tambahMenu("Kopi Hitam", 4000);
        minuman.tambahMenu("Kopi Susu", 5000);
        minuman.tambahMenu("Es Jeruk", 4000);
        minuman.tambahMenu("Jeruk Hangat", 4000);
        
        // GUI
        jPanelRightcrd = new CardLayout();
        jPanelRight = new JPanel();
        jPanelRight.setLayout(jPanelRightcrd);
        
        
        guiKonfigMinuman = new ViewKonfigurasiMinuman();
        guiKasir = new ViewKasir();
        guiKonfigMakanan = new ViewKonfigurasiMakanan();
//        Others.jFrameSetFrame(guiKonfigMakanan);
        Others.jFrameSetFrame(guiKonfigMakanan);
        

//         demo ViewKonfigurasiMinuman
        
//        Others.jFrameSetFrame(guiKonfigMinuman);

        // demo ViewKonfigurasiMakanan
//        Others.jFrameSetFrame(guiKonfigMakanan);
        

//        gui.setUndecorated(true);
//        gui.setVisible(true);
    }
    
    public static void main2(String[] args) {
//        Makanan makanan = new Makanan();
//        Minuman minuman = new Minuman();
        
        // tambah makanan
//        makanan.tambahMenu("Nasi putih", 3000);
//        makanan.tambahMenu("Telur", 4000);
//        makanan.tambahMenu("Ayam", 8000);
//        makanan.tambahMenu("Bakwan Jagung", 1500);
//        makanan.tambahMenu("Cah Jamur", 3000);
//        makanan.tambahMenu("Ikan Goreng", 7000);
//        makanan.tambahMenu("Tempe", 1000);
//        makanan.tambahMenu("Tahu", 1000);
//        makanan.tambahMenu("Sayur Bening", 3000);
//        makanan.tambahMenu("Cah Kangkung", 3000);
//        makanan.tambahMenu("Sayur Lodeh", 3000);
        
//        // tambah minuman
//        minuman.tambahMenu("Air Mineral", 3000);
//        minuman.tambahMenu("Teh Es", 3000);
//        minuman.tambahMenu("Teh Hangat", 3000);
//        minuman.tambahMenu("Kopi Hitam", 4000);
//        minuman.tambahMenu("Kopi Susu", 5000);
//        minuman.tambahMenu("Es Jeruk", 4000);
//        minuman.tambahMenu("Jeruk Hangat", 4000);
        
        boolean loop = true;
        int pilihMenu;
        
        // ViewKonfigurasiMakanan GUI
//        MyFrame frame = new MyFrame();
//        frame.setVisible(true);
        
        do{
            System.out.println("======================");
            System.out.println("|Warteg|");
            System.out.println("======================\n");
            System.out.println("\nSilahkan Pilih Menu di bawah ini :\n");
            System.out.println("1. Konfigurasi Makanan\n");
            System.out.println("2. Konfigurasi Minuman\n");
            System.out.println("3. Kasir\n");
            System.out.println("4. Exit\n");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihMenu =  input.nextInt();
            
            switch(pilihMenu){
                case 1 ->{
                    int konfigmakan;
                    System.out.println("\n======================");
                    System.out.println("|Konfigurasi Makanan|");
                    System.out.println("======================");
                    System.out.println("\nSilahkan Pilih nomor di bawah ini :\n");
                    System.out.println("1. Tambah Makanan\n");
                    System.out.println("2. Edit Makanan\n");
                    System.out.println("3. Hapus Makanan\n");
                    System.out.println("4. Kembali Ke Main Menu\n");
                    System.out.print("Masukkan Pilihan Anda : ");
                    konfigmakan = input.nextInt();
                    
                    switch(konfigmakan){
                        case 1 ->{
                            String tambahmakan;
                            int hargamakan;
                            
                            System.out.println("\n======================");
                            System.out.println("|Tambah Makanan|");
                            System.out.println("======================");
                            System.out.print("Masukkan nama : ");
                            input.nextLine();
                            tambahmakan = input.nextLine();
                            System.out.print("Masukkan harga : ");
                            hargamakan = input.nextInt();
                            makanan.tambahMenu(tambahmakan, hargamakan);
                            System.out.println("Data Berhasil di tambahkan");
                        }
                        
                        case 2 ->{
                            System.out.println("\n======================");
                            System.out.println("|Edit Makanan|");
                            System.out.println("======================");
                            int index;
                            String editmakan;
                            int editharga;
                            makanan.lihatMenu();
                            System.out.print("Masukkan Angka yang ingin di edit : ");
                            index = input.nextInt();
                            System.out.println("Edit Nama Makanan : ");
                            input.nextLine();
                            editmakan = input.nextLine();
                            System.out.println("Edit Harga Makanan : ");
                            editharga = input.nextInt();
                            makanan.editMenu(editmakan, editharga, index);
                            System.out.println("Menu No "+index+" berhasil di edit");
                        }
                        
                        case 3 ->{
                            System.out.println("\n======================");
                            System.out.println("|Hapus Makanan|");
                            System.out.println("======================");
                            int index;
                            makanan.lihatMenu();
                            System.out.print("Masukkan Angka menu yang ingin di hapus : ");
                            index = input.nextInt();
                            makanan.hapusMenu(index);
                            System.out.println("Menu No "+index+" berhasil di hapus");
                        }
                    }
                }
                
                case 2 ->{
                    int konfigminum;
                    System.out.println("\n======================");
                    System.out.println("|Konfigurasi Minuman|");
                    System.out.println("======================");
                    System.out.println("\nSilahkan Pilih nomor di bawah ini :\n");
                    System.out.println("1. Tambah Minuman\n");
                    System.out.println("2. Edit Minuman\n");
                    System.out.println("3. Hapus Minuman\n");
                    System.out.println("4. Kembali Ke Main Menu\n");
                    System.out.print("Masukkan Pilihan Anda : ");
                    konfigminum = input.nextInt();
                    
                    switch(konfigminum){
                        case 1 ->{
                            String tambah;
                            int harga;
                            
                            System.out.println("\n======================");
                            System.out.println("|Tambah Minuman|");
                            System.out.println("======================");
                            System.out.print("Masukkan nama : ");
                            input.nextLine();
                            tambah = input.nextLine();
                            System.out.print("Masukkan harga : ");
                            harga = input.nextInt();
                            minuman.tambahMenu(tambah, harga);
                            System.out.println("Data Berhasil di tambahkan");
                        }
                        
                        case 2 ->{
                            int index;
                            String editminum;
                            int hargaminum;
                            System.out.println("\n======================");
                            System.out.println("|Edit Minuman|");
                            System.out.println("======================");
                            minuman.lihatMenu();
                            System.out.print("Masukkan Angka yang ingin di edit : ");
                            index = input.nextInt();
                            System.out.println("Edit Nama Minuman : ");
                            input.nextLine();
                            editminum = input.nextLine();
                            System.out.println("Edit Harga Minuman : ");
                            hargaminum = input.nextInt();
                            minuman.editMenu(editminum, hargaminum, index);
                            System.out.println("Menu No "+index+" berhasil di edit");
                        }
                        
                        case 3 ->{
                            int index;
                            System.out.println("\n======================");
                            System.out.println("|Hapus Minuman|");
                            System.out.println("======================");
                            minuman.lihatMenu();
                            System.out.print("Masukkan Angka menu yang ingin di hapus : ");
                            index = input.nextInt();
                            minuman.hapusMenu(index);
                            System.out.println("Menu No "+index+" berhasil di hapus");
                        }
                    }
                }
                
                case 3 ->{
                    System.out.println("\n======================");
                    System.out.println("|Order Menu|");
                    System.out.println("======================");
                    
                   int pilihanmakan = 0;
                    
                    makanan.lihatMenu();
                    do{
                        System.out.print("Masukkan Pilihan : ");
                        pilihanmakan = input.nextInt();
                        if(pilihanmakan != -1){
                            System.out.print("Jumlah Pesanan : ");
                            int jumpesan = input.nextInt();
                            orderMakanan.tambahItem((Makanan)makanan.daftarMenu.get(pilihanmakan-1),jumpesan);
                        }
                    }while(pilihanmakan != -1);
                   
                   int pilihanminum = 0;
                    
                    minuman.lihatMenu();
                    do{
                        System.out.print("Masukkan Pilihan : ");
                        pilihanminum = input.nextInt();
                        if(pilihanminum != -1){
                            System.out.print("Jumlah Pesanan : ");
                            int jumpesan = input.nextInt();
                            orderMinuman.tambahItem((Minuman)minuman.daftarMenu.get(pilihanminum-1),jumpesan);
                        }
                    }while(pilihanminum != -1);
                    
                    Pembayaran.hitungHarga(orderMakanan, orderMinuman);
                    System.out.print("Masukkan Uang Pembayaran : ");
                    int uangpem = input.nextInt();
                    Pembayaran.bayar(uangpem);
                }
                case 4 -> System.exit(0);
            }
        }while(loop = true);
        
       // window gui = new window();
       // gui.setVisible(true);
    }
}

