/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finalprojectoop;

import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author User
 */
public class ViewKasir extends javax.swing.JFrame {

    public ViewKasir() {
        initComponents();
        
        // jPanelRight
        jPanelRight = FinalProjectOOP.jPanelRight;
            //
        jPanelRight.setBorder(new EmptyBorder(30,30,30,30));
            //
        add(jPanelRight);
        
        // jPanelRight1
        JPanel jPanelRight1 = new JPanel();
        JButton jButtonPilihMakanan = new JButton("Pilih Makanan");
        JButton jButtonPilihMinuman = new JButton("Pilih Minuman");
        JButton jButtonPembayaran = new JButton("Pembayaran");
            // 
        jPanelRight1.setLayout(new GridLayout(3, 1, 10, 20));
        jButtonPilihMakanan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // jPanelRightMakanan
                JPanel jPanelRightMakanan = new JPanel();
                JCheckBox ch;
                Menu item = null;
                JPanel jp = new JPanel();
                JPanel jPanelItem;
                JPanel jPanelButtonSelesai = new JPanel();
                JScrollPane js = new JScrollPane(jp);
                JButton jButtonSelesai = new JButton("Selesai");
                    // jDialogJumlah
                gbc = new GridBagConstraints();
                jDialogJumlah = new JDialog();
                JPanel jPanelJumlah = new JPanel();
                jButtonOke = new JButton("Oke");
                JLabel jLabelJumlah = new JLabel("Jumlah");
                jTextFieldJumlah = new JTextField();
                    //
                jPanelRight.add(jPanelRightMakanan, "jPanelRightMakanan");
                jPanelRightMakanan.setLayout(new BoxLayout(jPanelRightMakanan, BoxLayout.Y_AXIS));
                jPanelRightMakanan.add(js);
                jPanelRightMakanan.add(jPanelButtonSelesai);        
                jPanelButtonSelesai.setLayout(new BoxLayout(jPanelButtonSelesai, BoxLayout.X_AXIS));
                jPanelButtonSelesai.setBorder(new EmptyBorder(5, 0, 0, 0));
                jPanelButtonSelesai.add(jButtonSelesai);
                jButtonSelesai.addActionListener(new ActionListener() { // addActionListener 
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jPanelRightcrd.show(jPanelRight, "jPanelRight1");
                    }
                });
                jp.setLayout(new GridLayout(0, 2));
                jDialogJumlah.setSize(250, 90);
                jDialogJumlah.setLocationRelativeTo(null);
                jTextFieldJumlah.setMinimumSize(new Dimension(80,20));
                jTextFieldJumlah.setPreferredSize(new Dimension(80,20));
                jPanelJumlah.setLayout(new GridBagLayout());
                    //
                arrMenu = new Integer[FinalProjectOOP.makanan.daftarMenu.size()];
                for (int i = 0; i < arrMenu.length; i++) {
                    arrMenu[i] = 2;            
                }
                    //   
                jDialogJumlah.add(jPanelJumlah);
                gbc.gridx = 0;
                gbc.gridy = 0;
                jPanelJumlah.add(jLabelJumlah, gbc);
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.insets = new Insets(0, 10, 0, 10);
                jPanelJumlah.add(jTextFieldJumlah, gbc);
                gbc.insets = new Insets(0, 0, 0, 0);
                gbc.gridx = 2;
                gbc.gridy = 0;
                jPanelJumlah.add(jButtonOke, gbc);
                    // buat checkbox item
                for (int i = 0; i < FinalProjectOOP.makanan.daftarMenu.size(); i++) {
                    ch = new JCheckBox();
                    jPanelItem = new JPanel();
                    item = FinalProjectOOP.makanan.daftarMenu.get(i);
                    JLabel jLabelItem = new JLabel("       Rp. "+String.valueOf(item.harga));
                    ch.setText(item.nama);
                    ch.addItemListener(new ItemAction(ch, i, FinalProjectOOP.makanan));

                    jPanelItem.setLayout(new GridLayout(2, 1));
                    jPanelItem.add(ch);
                    jPanelItem.add(jLabelItem);

                    jp.add(jPanelItem);
                }
                
                jPanelRightcrd.show(jPanelRight, "jPanelRightMakanan");
            }
        });
        jButtonPilihMinuman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // jPanelRightMinuman
                JPanel jPanelRightMinuman = new JPanel();
                JCheckBox ch;
                Menu item = null;
                JPanel jp = new JPanel();
                JPanel jPanelItem;
                JPanel jPanelButtonSelesai = new JPanel();
                JScrollPane js = new JScrollPane(jp);
                JButton jButtonSelesai = new JButton("Selesai");
                    // jDialogJumlah
                gbc = new GridBagConstraints();
                jDialogJumlah = new JDialog();
                JPanel jPanelJumlah = new JPanel();
                jButtonOke = new JButton("Oke");
                JLabel jLabelJumlah = new JLabel("Jumlah");
                jTextFieldJumlah = new JTextField();
                    //
                jPanelRight.add(jPanelRightMinuman, "jPanelRightMinuman");
                jPanelRightMinuman.setLayout(new BoxLayout(jPanelRightMinuman, BoxLayout.Y_AXIS));
                jPanelRightMinuman.add(js);
                jPanelRightMinuman.add(jPanelButtonSelesai);        
                jPanelButtonSelesai.setLayout(new BoxLayout(jPanelButtonSelesai, BoxLayout.X_AXIS));
                jPanelButtonSelesai.setBorder(new EmptyBorder(5, 0, 0, 0));
                jPanelButtonSelesai.add(jButtonSelesai);
                jButtonSelesai.addActionListener(new ActionListener() { // addActionListener 
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jPanelRightcrd.show(jPanelRight, "jPanelRight1");
                    }
                });
                jp.setLayout(new GridLayout(0, 2));
                jDialogJumlah.setSize(250, 90);
                jDialogJumlah.setLocationRelativeTo(null);
                jTextFieldJumlah.setMinimumSize(new Dimension(80,20));
                jTextFieldJumlah.setPreferredSize(new Dimension(80,20));
                jPanelJumlah.setLayout(new GridBagLayout());
                    //
                arrMenu = new Integer[FinalProjectOOP.minuman.daftarMenu.size()];
                for (int i = 0; i < arrMenu.length; i++) {
                    arrMenu[i] = 2;            
                }
                    //   
                jDialogJumlah.add(jPanelJumlah);
                gbc.gridx = 0;
                gbc.gridy = 0;
                jPanelJumlah.add(jLabelJumlah, gbc);
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.insets = new Insets(0, 10, 0, 10);
                jPanelJumlah.add(jTextFieldJumlah, gbc);
                gbc.insets = new Insets(0, 0, 0, 0);
                gbc.gridx = 2;
                gbc.gridy = 0;
                jPanelJumlah.add(jButtonOke, gbc);
                    // buat checkbox item
                for (int i = 0; i < FinalProjectOOP.minuman.daftarMenu.size(); i++) {
                    ch = new JCheckBox();
                    jPanelItem = new JPanel();
                    item = FinalProjectOOP.minuman.daftarMenu.get(i);
                    JLabel jLabelItem = new JLabel("       Rp. "+String.valueOf(item.harga));
                    ch.setText(item.nama);
                    ch.addItemListener(new ItemAction(ch, i, FinalProjectOOP.minuman));

                    jPanelItem.setLayout(new GridLayout(2, 1));
                    jPanelItem.add(ch);
                    jPanelItem.add(jLabelItem);

                    jp.add(jPanelItem);
                }
                
                jPanelRightcrd.show(jPanelRight, "jPanelRightMinuman");
            }
        });
        jButtonPembayaran.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanelRightcrd.show(jPanelRight, "jPanelRightPembayaran");
                Pembayaran.totalHarga =0;
                
                // tampilkan order list
                jPanelRightPembayaran_2.removeAll();
                jPanelRightPembayaran_2.setLayout(new BoxLayout(jPanelRightPembayaran_2, BoxLayout.Y_AXIS));
                for (int i = 0; i < FinalProjectOOP.makanan.daftarMenu.size(); i++) {
                    if (FinalProjectOOP.makanan.daftarMenu.get(i).jumlahPesanan > 0){
                        JPanel jPanelRightPembayaran_item = new JPanel();
                        JLabel jLabelPembayaran_nama = new JLabel(FinalProjectOOP.makanan.daftarMenu.get(i).nama);
                        JLabel jLabelPembayaran_jumlah = new JLabel("Rp. %d x %d".formatted(
                                                                            FinalProjectOOP.makanan.daftarMenu.get(i).harga,
                                                                            FinalProjectOOP.makanan.daftarMenu.get(i).jumlahPesanan));
                        JLabel jLabelPembayaran_harga = new JLabel("Rp. %d".formatted(
                                                                            FinalProjectOOP.makanan.daftarMenu.get(i).jumlahPesanan*
                                                                            FinalProjectOOP.makanan.daftarMenu.get(i).harga));

                        jPanelRightPembayaran_item.setLayout(new GridLayout(1, 3, 5, 5));
                        jLabelPembayaran_jumlah.setHorizontalAlignment(JLabel.CENTER);
                        jLabelPembayaran_harga.setHorizontalAlignment(JLabel.CENTER);
                        jLabelPembayaran_nama.setHorizontalTextPosition(JLabel.CENTER);
                        jLabelPembayaran_jumlah.setHorizontalTextPosition(JLabel.CENTER);
                        jLabelPembayaran_harga.setHorizontalTextPosition(JLabel.CENTER);
                        jLabelPembayaran_nama.setBorder(new EmptyBorder(8, 8, 8, 8));
                        jLabelPembayaran_jumlah.setBorder(new EmptyBorder(8, 10, 8, 10));
                        jLabelPembayaran_harga.setBorder(new EmptyBorder(8, 8, 8, 8));
                        jPanelRightPembayaran_item.add(jLabelPembayaran_nama);
                        jPanelRightPembayaran_item.add(jLabelPembayaran_jumlah);
                        jPanelRightPembayaran_item.add(jLabelPembayaran_harga);
                        jPanelRightPembayaran_2.add(jPanelRightPembayaran_item);                 
                        
                        // hitung total
                        Pembayaran.totalHarga+=(
                                FinalProjectOOP.makanan.daftarMenu.get(i).jumlahPesanan*
                                FinalProjectOOP.makanan.daftarMenu.get(i).harga);
                    }
                }
                for (int i = 0; i < FinalProjectOOP.minuman.daftarMenu.size(); i++) {
                    if (FinalProjectOOP.minuman.daftarMenu.get(i).jumlahPesanan > 0){
                        JPanel jPanelRightPembayaran_item = new JPanel();
                        JLabel jLabelPembayaran_nama = new JLabel(FinalProjectOOP.minuman.daftarMenu.get(i).nama);
                        JLabel jLabelPembayaran_jumlah = new JLabel("Rp. %d x %d".formatted(
                                                                            FinalProjectOOP.minuman.daftarMenu.get(i).harga,
                                                                            FinalProjectOOP.minuman.daftarMenu.get(i).jumlahPesanan));
                        JLabel jLabelPembayaran_harga = new JLabel("Rp. %d".formatted(
                                                                            FinalProjectOOP.minuman.daftarMenu.get(i).jumlahPesanan*
                                                                            FinalProjectOOP.minuman.daftarMenu.get(i).harga));

                        jPanelRightPembayaran_item.setLayout(new GridLayout(1, 3, 5, 5));
                        jLabelPembayaran_jumlah.setHorizontalAlignment(JLabel.CENTER);
                        jLabelPembayaran_harga.setHorizontalAlignment(JLabel.CENTER);
                        jLabelPembayaran_nama.setHorizontalTextPosition(JLabel.CENTER);
                        jLabelPembayaran_jumlah.setHorizontalTextPosition(JLabel.CENTER);
                        jLabelPembayaran_harga.setHorizontalTextPosition(JLabel.CENTER);
                        jLabelPembayaran_nama.setBorder(new EmptyBorder(8, 8, 8, 8));
                        jLabelPembayaran_jumlah.setBorder(new EmptyBorder(8, 10, 8, 10));
                        jLabelPembayaran_harga.setBorder(new EmptyBorder(8, 8, 8, 8));
                        jPanelRightPembayaran_item.add(jLabelPembayaran_nama);
                        jPanelRightPembayaran_item.add(jLabelPembayaran_jumlah);
                        jPanelRightPembayaran_item.add(jLabelPembayaran_harga);
                        jPanelRightPembayaran_2.add(jPanelRightPembayaran_item);                 
                        
                        // hitung total
                        Pembayaran.totalHarga+=(
                                FinalProjectOOP.minuman.daftarMenu.get(i).jumlahPesanan*
                                FinalProjectOOP.minuman.daftarMenu.get(i).harga);
                    }
                }
                jLabelPembayaran_total.setText("Total harga : Rp. "+(Pembayaran.totalHarga));
            }
        });
            // munculkan tombol pilihan
        jPanelRight1.add(jButtonPilihMakanan);
        jPanelRight1.add(jButtonPilihMinuman);
        jPanelRight1.add(jButtonPembayaran);
            //
        jPanelRight.add(jPanelRight1, "jPanelRight1");
        
        // tombol pembayaran
        jPanelRightPembayaran = new JPanel();
        jPanelRightPembayaran_order = new JPanel();
        jLabelPembayaran_order = new JLabel("Order List");
        jLabelPembayaran_total = new JLabel("total");
        jLabelJumlahPembayaran = new JLabel("Jumlah Bayar");
        jTextFieldJumlahPembayaran = new JTextField();
        jButtonBayar = new JButton("Bayar");
//
        jPanelRightPembayaran.setLayout(new BoxLayout(jPanelRightPembayaran, BoxLayout.Y_AXIS));
        
        jPanelRightPembayaran_1 = new JPanel();
        jPanelRightPembayaran_2 = new JPanel();
        jPanelRightPembayaran_3 = new JPanel();
        JPanel jPanelRightPembayaran_4 = new JPanel();
        jScrollPanePembayaran = new JScrollPane(jPanelRightPembayaran_2);
        
        jPanelRightPembayaran.add(jPanelRightPembayaran_1);
        jPanelRightPembayaran.add(jScrollPanePembayaran);
        jPanelRightPembayaran.add(jPanelRightPembayaran_3);
        
        jLabelPembayaran_order.setFont(new Font("", 0, 18));
        jTextFieldJumlahPembayaran.setPreferredSize(new Dimension(80, 30));
        jScrollPanePembayaran.setPreferredSize(new Dimension(80, 2000));
        jPanelRightPembayaran_3.setLayout(new GridLayout(2, 1));
        jPanelRightPembayaran_4.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        jButtonBayar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // kembalian
                try {
                    Pembayaran.jumlahBayar = Integer.parseInt(jTextFieldJumlahPembayaran.getText());
                    Pembayaran.kembalian = Pembayaran.jumlahBayar - Pembayaran.totalHarga;
                    
                    if (Pembayaran.jumlahBayar >= Pembayaran.totalHarga) {
                       JOptionPane.showMessageDialog(rootPane, "Kembalian : Rp. "+Pembayaran.kembalian);
                       jPanelRightcrd.show(jPanelRight, "jPanelRight1");
                   }
                   else JOptionPane.showMessageDialog(rootPane, "Uang yang dimasukkan kurang!");   
                } catch (Exception f) {
                    JOptionPane.showMessageDialog(rootPane, "Harap masukkan jumlah pembayaran!");   
                }
            }
        });
        jLabelPembayaran_total.setVerticalTextPosition(JLabel.CENTER);
                        
        jPanelRightPembayaran_1.add(jLabelPembayaran_order);
        jPanelRightPembayaran_3.add(jPanelRightPembayaran_4);
        jPanelRightPembayaran_3.add(jLabelPembayaran_total);
        jPanelRightPembayaran_4.add(jLabelJumlahPembayaran);
        jPanelRightPembayaran_4.add(jTextFieldJumlahPembayaran);
        jPanelRightPembayaran_4.add(jButtonBayar);
        
        jPanelRight.add(jPanelRightPembayaran, "jPanelRightPembayaran");
    }
    
    // custom code
    public static void test(Menu menu) {
        // jPanelRightMakanan
        JPanel jPanelRightMakanan = new JPanel();
        JCheckBox ch;
        Menu item = null;
        JPanel jp = new JPanel();
        JPanel jPanelItem;
        JPanel jPanelButtonSelesai = new JPanel();
        JScrollPane js = new JScrollPane(jp);
        JButton jButtonSelesai = new JButton("Selesai");
            // jDialogJumlah
        gbc = new GridBagConstraints();
        jDialogJumlah = new JDialog();
        JPanel jPanelJumlah = new JPanel();
        jButtonOke = new JButton("Oke");
        JLabel jLabelJumlah = new JLabel("Jumlah");
        jTextFieldJumlah = new JTextField();
            //
        jPanelRight.add(jPanelRightMakanan, "jPanelRightMakanan");
        jPanelRightMakanan.setLayout(new BoxLayout(jPanelRightMakanan, BoxLayout.Y_AXIS));
        jPanelRightMakanan.add(js);
        jPanelRightMakanan.add(jPanelButtonSelesai);        
        jPanelButtonSelesai.setLayout(new BoxLayout(jPanelButtonSelesai, BoxLayout.X_AXIS));
        jPanelButtonSelesai.setBorder(new EmptyBorder(5, 0, 0, 0));
        jPanelButtonSelesai.add(jButtonSelesai);
        jButtonSelesai.addActionListener(new ActionListener() { // addActionListener 
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanelRightcrd.show(jPanelRight, "jPanelRight1");
            }
        });
        jp.setLayout(new GridLayout(0, 2));
        jDialogJumlah.setSize(250, 90);
        jDialogJumlah.setLocationRelativeTo(null);
        jTextFieldJumlah.setMinimumSize(new Dimension(80,20));
        jTextFieldJumlah.setPreferredSize(new Dimension(80,20));
        jPanelJumlah.setLayout(new GridBagLayout());
            //
        arrMenu = new Integer[menu.daftarMenu.size()];
        for (int i = 0; i < arrMenu.length; i++) {
            arrMenu[i] = 2;            
        }
            //   
        jDialogJumlah.add(jPanelJumlah);
        gbc.gridx = 0;
        gbc.gridy = 0;
        jPanelJumlah.add(jLabelJumlah, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 10, 0, 10);
        jPanelJumlah.add(jTextFieldJumlah, gbc);
        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.gridx = 2;
        gbc.gridy = 0;
        jPanelJumlah.add(jButtonOke, gbc);
            // buat checkbox item
        for (int i = 0; i < menu.daftarMenu.size(); i++) {
            ch = new JCheckBox();
            jPanelItem = new JPanel();
            item = menu.daftarMenu.get(i);
            JLabel jLabelItem = new JLabel("       Rp. "+String.valueOf(item.harga));
            ch.setText(item.nama);
            ch.addItemListener(new ItemAction(ch, i, menu));

            jPanelItem.setLayout(new GridLayout(2, 1));
            jPanelItem.add(ch);
            jPanelItem.add(jLabelItem);

            jp.add(jPanelItem);
        }
    }
    static class ItemAction implements ItemListener{
        int index;
        JCheckBox ch;
        Menu menu = null;
        public ItemAction(JCheckBox ch, int index, Menu menu) {
            this.ch = ch;
            this.index = index;
            this.menu = menu;
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == 1) { 
                ViewKasir.jDialogJumlah.setVisible(true);
                jTextFieldJumlah.setText(String.valueOf(menu.daftarMenu.get(index).jumlahPesanan));

                // jButtonOke
                for (ActionListener z : jButtonOke.getActionListeners()) {
                    jButtonOke.removeActionListener(z);
                }
                jButtonOke.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent f) {
                        int jumlahLama = menu.daftarMenu.get(index).jumlahPesanan;
                        menu.daftarMenu.get(index).jumlahPesanan = Integer.parseInt(jTextFieldJumlah.getText());
                        if (menu.daftarMenu.get(index).jumlahPesanan <= 0){
                            ch.setSelected(false);
                        }
                        jDialogJumlah.dispose();
                    }
                });
            }
            else {
                menu.daftarMenu.get(index).jumlahPesanan = 0;
            }
        }
    }
    
    static class actionTest implements ActionListener{
        JFrame jFrame;
        public actionTest(JFrame jFrame) {
            this.jFrame = jFrame;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            this.jFrame.dispose();
        }
    }
    // end of custom code
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jPanel5.setMaximumSize(new java.awt.Dimension(297, 382));
        jPanel5.setPreferredSize(new java.awt.Dimension(297, 382));
        jPanel5.setLayout(null);

        jPanel2.setMinimumSize(new java.awt.Dimension(100, 53));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 53));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 17);
        jPanel2.add(jButton1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order List");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 20;
        jPanel2.add(jLabel1, gridBagConstraints);

        jPanel5.add(jPanel2);
        jPanel2.setBounds(0, 0, 297, 40);

        jPanel4.setMinimumSize(new java.awt.Dimension(297, 273));
        jPanel4.setLayout(new java.awt.GridLayout());

        jScrollPane1.setMinimumSize(new java.awt.Dimension(100, 100));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.GridLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nasi Goreng");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel6.add(jLabel4);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Rp. 2000 x 2");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel6.add(jLabel5);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Rp. 4000");
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel6.add(jLabel6);

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        jScrollPane1.setViewportView(jPanel1);

        jPanel4.add(jScrollPane1);

        jPanel5.add(jPanel4);
        jPanel4.setBounds(0, -2, 297, 210);

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 13, 15, 13));
        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 0, 0};
        jPanel3Layout.rowHeights = new int[] {0};
        jPanel3.setLayout(jPanel3Layout);

        jLabel2.setText("Jumlah Bayar");
        jPanel3.add(jLabel2, new java.awt.GridBagConstraints());

        jTextField1.setMinimumSize(new java.awt.Dimension(80, 22));
        jTextField1.setPreferredSize(new java.awt.Dimension(80, 22));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 16, 0, 16);
        jPanel3.add(jTextField1, gridBagConstraints);

        jButton2.setText("Bayar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 17, 0, 0);
        jPanel3.add(jButton2, gridBagConstraints);

        jPanel5.add(jPanel3);
        jPanel3.setBounds(0, 329, 297, 60);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(477, 260));
        getContentPane().setLayout(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewKasir().setVisible(true);
            }
        });
    }

    // custom variables
    //
    private JLabel jLabelPembayaran_total;
    private JPanel jPanelRightPembayaran;
    private JPanel jPanelRightPembayaran_order;
    private JLabel jLabelPembayaran_order;
    private JLabel jLabelJumlahPembayaran;
    private JTextField jTextFieldJumlahPembayaran;
    private JButton jButtonBayar;
    
    JPanel jPanelRightPembayaran_1;
    JPanel jPanelRightPembayaran_2;
    JPanel jPanelRightPembayaran_3;
    JScrollPane jScrollPanePembayaran;
    //
    public static CardLayout jPanelRightcrd = FinalProjectOOP.jPanelRightcrd;
    public static GridBagConstraints gbc;
    public static int count = 1;
    public static Integer[] arrMenu;
    public static int checkboxIndex;
    public static JTextField jTextFieldJumlah;
    public static JDialog jDialogJumlah;
    public static JButton jButtonOke;
    public JButton jButtonKonfigurasiMakanan;
    public JButton jButtonKonfigurasiMinuman;
    public JButton jButtonKasir;
    private JPanel jPanelLeft;
    private JPanel jPanelLeft1;
    public static JPanel jPanelRight;
    // end of custom variables    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}