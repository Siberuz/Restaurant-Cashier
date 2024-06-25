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
public class ViewKonfigurasiMakanan extends javax.swing.JFrame {

    public ViewKonfigurasiMakanan() {
        initComponents();
        
        setTitle("Warteg 1.0");
        setResizable(false);    
        setLocationRelativeTo(null); // memunculkan window di tengah        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        
        // jPanelLeft
        jPanelLeft = new JPanel();
        jPanelLeft1 = new JPanel();
        jButtonKonfigurasiMakanan = new JButton("Konfigurasi Makanan");
        jButtonKonfigurasiMinuman = new JButton("Konfigurasi Minuman");
        jButtonKasir = new JButton("Kasir");
        jPanelLeft.setBackground(new Color(44, 46, 67));
        jPanelLeft.setPreferredSize(new Dimension(200, jPanelLeft.getHeight()));
//        jPanelLeft.setMaximumSize(new Dimension(200, jPanelLeft.getHeight()));
        jPanelLeft.setLayout(new GridLayout(2, 1));
        
        this.add(jPanelLeft);
        jPanelLeft.add(jLabel1);
        jPanelLeft.add(jPanelLeft1);
        
        jPanelLeft1.setBackground(Others.oldBlue);
        jPanelLeft1.setLayout(new GridLayout(4,1, 0, 10));
        jPanelLeft1.add(jButtonKonfigurasiMakanan);
        jPanelLeft1.add(jButtonKonfigurasiMinuman);
        jPanelLeft1.add(jButtonKasir);
        
        jButtonKonfigurasiMakanan.setBackground(Others.white);
        jButtonKonfigurasiMakanan.setForeground(Others.textColor);
        jButtonKonfigurasiMinuman.setBackground(Others.white);
        jButtonKonfigurasiMinuman.setForeground(Others.textColor);
        jButtonKasir.setBackground(Others.white);
        jButtonKasir.setForeground(Others.textColor);
        
        Others.jButtonSetACtive(jButtonKonfigurasiMakanan, true);
        
        jLabel1.setIcon(Others.getScaledImage(180, 64, System.getProperty("user.dir")+"\\src\\main\\java\\assets\\Logo.png"));
        jLabel1.setHorizontalAlignment(JLabel.CENTER);
        
        // addActionListener jButtonKonfigurasiMakanan
        jButtonKonfigurasiMakanan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Others.jButtonSetACtive(jButtonKonfigurasiMakanan, true);
                Others.jButtonSetACtive(jButtonKonfigurasiMinuman, false);
                Others.jButtonSetACtive(jButtonKasir, false);
//                jPanelRight.setBorder(new EmptyBorder(0,0,0,0));
                FinalProjectOOP.jPanelRightcrd.show(jPanelRight, "jPanelKonfigMakanan");
            }
        });
        // addActionListener jButtonKonfigurasiMinuman
        jButtonKonfigurasiMinuman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Others.jButtonSetACtive(jButtonKonfigurasiMakanan, false);
                Others.jButtonSetACtive(jButtonKonfigurasiMinuman, true);
                Others.jButtonSetACtive(jButtonKasir, false);
                jPanelRightcrd.show(jPanelRight, "jPanelKonfigMinuman");
            }
        });
        // addActionListener jButtonKasir
        jButtonKasir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Others.jButtonSetACtive(jButtonKonfigurasiMakanan, false);
                Others.jButtonSetACtive(jButtonKonfigurasiMinuman, false);
                Others.jButtonSetACtive(jButtonKasir, true);
                jPanelRightcrd.show(jPanelRight, "jPanelRight1");
            }
        });
        
        // jPanelRight
        jPanelRight = FinalProjectOOP.jPanelRight;
            //
        jPanelRight.setBorder(new EmptyBorder(30,30,30,30));
            //
        add(jPanelRight);
        
        // jPanelRight1
        JButton jButtonEditData = new JButton("Edit Data");
        JButton jButtonHapusData = new JButton("Hapus Data");
        JButton jButtonTambahData = new JButton("Tambah Data");
        JPanel jPanelRight1 = new JPanel();
        JLabel labelDataKosong = new JLabel();        
        
        JTable table = new JTable();
        JScrollPane sp = new JScrollPane(table);
        JPanel jRight1 = new JPanel();
        JPanel jRight2 = new JPanel();
        
        Others.jTableIsiTable(table, FinalProjectOOP.makanan);
        Others.jTableSetting(table);
            // 
        jPanelRight.add(jPanelRight1, "jPanelKonfigMakanan");
        jPanelRight1.setLayout(new BoxLayout(jPanelRight1, BoxLayout.Y_AXIS));
        jRight1.setPreferredSize(new Dimension(200, 200));
        jRight1.setLayout(new GridLayout(1,1,10,10));
        jPanelRight1.add(jRight1);
        jPanelRight1.add(jRight2);
        
//        sp.setPreferredSize(new Dimension(300, 215));
        jRight1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        jRight1.setLayout(new GridLayout());
        jRight1.add(sp);
        
//        jRight2.setLayout(new GridLayout(1, 3, 10, 10));
//        jRight2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        jRight2.setBorder(new EmptyBorder(10, 0,0,0));
//        jButtonTambahData.setAlignmentY(JButton.CENTER_ALIGNMENT);
        jRight2.add(jButtonTambahData);
        jRight2.add(jButtonHapusData);
        jRight2.add(jButtonEditData);  
        
        // =================== Menu Tambah Data =======================
        JDialog jDialogTambah = new JDialog();
        JPanel jPanelTambah = new JPanel();
        JPanel jPanelTambah_DataNama = new JPanel();
        JPanel jPanelTambah_DataHarga = new JPanel();
        JPanel jPanelTambah_DataSelesai = new JPanel();
        JLabel jLabelTambah_Data = new JLabel("Tambah Makanan");
        JLabel jLabelTambah_DataNama = new JLabel("Nama");
        JLabel jLabelTambah_DataHarga = new JLabel("Harga");
        JTextField jTextFieldTambah_DataNama = new JTextField();
        JTextField jTextFieldTambah_DataHarga = new JTextField();
        JButton jButtonTambah_DataSelesai = new JButton("Selesai");
        
        // jButtonTambahData
        ImageIcon imageTambah = Others.getScaledImage(15, 15, System.getProperty("user.dir")+"\\src\\main\\java\\assets\\tambah.png");
        jButtonTambahData.setIcon(imageTambah);
        Others.jButtonSetIconAndTextAlignment(jButtonTambahData, JButton.BOTTOM);
        // jButtonHapusData
        ImageIcon imageHapus = Others.getScaledImage(15, 15, System.getProperty("user.dir")+"\\src\\main\\java\\assets\\hapus.png");
        jButtonHapusData.setIcon(imageHapus);
        Others.jButtonSetIconAndTextAlignment(jButtonHapusData, JButton.BOTTOM);
        // jButtonEditData
        ImageIcon imageEdit = Others.getScaledImage(15, 15, System.getProperty("user.dir")+"\\src\\main\\java\\assets\\edit.png");
        jButtonEditData.setIcon(imageEdit);
        Others.jButtonSetIconAndTextAlignment(jButtonEditData, JButton.BOTTOM);
        // setting jDIalogTambah
        jDialogTambah.add(jPanelTambah);
        jDialogTambah.setSize(250, 200);
        jDialogTambah.setLocationRelativeTo(null);
        // jLabelTambah_Data
        jLabelTambah_Data.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        // jTextFieldTambah_DataNama
        jTextFieldTambah_DataNama.setMinimumSize(new Dimension(100,20));
        jTextFieldTambah_DataNama.setPreferredSize(new Dimension(100,20));
        // jTextFieldTambah_DataHarga
        jTextFieldTambah_DataHarga.setMinimumSize(new Dimension(100,20));
        jTextFieldTambah_DataHarga.setPreferredSize(new Dimension(100,20));
        // addActionListener jButtonTambahData
        jButtonTambahData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jDialogTambah.setVisible(true);
            }
        });
        // addActionListener jButtonTambah_DataSelesai
        jButtonTambah_DataSelesai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FinalProjectOOP.makanan.tambahMenu(
                        jTextFieldTambah_DataNama.getText(), 
                        Integer.parseInt(jTextFieldTambah_DataHarga.getText()));
                    Others.jTableIsiTable(table, FinalProjectOOP.makanan);
                    JOptionPane.showMessageDialog(jDialogTambah, "Tambah data berhasil!");
                } catch (Exception f) {
                    JOptionPane.showMessageDialog(jDialogTambah, "Input salah!");
                }
            }
        });
        
        jPanelTambah.setLayout(new GridLayout(4, 1, 2, 0));
        jPanelTambah.add(jLabelTambah_Data);
        jPanelTambah.add(jPanelTambah_DataNama);
        jPanelTambah.add(jPanelTambah_DataHarga);
        jPanelTambah.add(jPanelTambah_DataSelesai);

        jPanelTambah_DataNama.setLayout(new FlowLayout(FlowLayout.CENTER, 10,0));
        jPanelTambah_DataNama.add(jLabelTambah_DataNama);
        jPanelTambah_DataNama.add(jTextFieldTambah_DataNama);

        jPanelTambah_DataHarga.setLayout(new FlowLayout(FlowLayout.CENTER, 10,0));
        jPanelTambah_DataHarga.add(jLabelTambah_DataHarga);
        jPanelTambah_DataHarga.add(jTextFieldTambah_DataHarga);

        jPanelTambah_DataSelesai.setLayout(new FlowLayout(FlowLayout.CENTER, 0,2));
        jPanelTambah_DataSelesai.add(jButtonTambah_DataSelesai);
        
        // =================== Menu Hapus Data =======================
        JDialog jDialogHapus = new JDialog();
        JPanel jPanelHapus = new JPanel();

        // setting jDIalogHapus
        jDialogHapus.add(jPanelHapus);
        jDialogHapus.setSize(250, 90);
        jDialogHapus.setLocationRelativeTo(null);

        JButton jButtonHapus = new JButton("Hapus");
        JLabel jLabelHapusNomor = new JLabel("Nomor");
        JTextField jTextFieldHapusNomor = new JTextField();
        
        // jButtonHapus
        jButtonHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FinalProjectOOP.makanan.hapusMenu(Integer.parseInt(jTextFieldHapusNomor.getText()));
                    Others.jTableIsiTable(table, FinalProjectOOP.makanan);
                    JOptionPane.showMessageDialog(jDialogHapus, "Data berhasil dihapus!");
                } catch (Exception f) {
                    JOptionPane.showMessageDialog(jDialogHapus, "Input tidak sesuai!");
                }
            }
        });
        // jTextFieldHapusNomor
        jTextFieldHapusNomor.setMinimumSize(new Dimension(80,20));
        jTextFieldHapusNomor.setPreferredSize(new Dimension(80,20));
        
//        jPanelHapus.setLayout(new GridLayout(2,2, 10,10)); // set jPnaelHapus layout
//        jPanelHapus.setLayout(new BoxLayout(jPanelHapus, BoxLayout.X_AXIS)); // set jPnaelHapus layout
        jPanelHapus.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10)); // set jPnaelHapus layout
        jPanelHapus.add(jLabelHapusNomor);
        jPanelHapus.add(jTextFieldHapusNomor);
        jPanelHapus.add(jButtonHapus);
        
        // addActionListener jButtonHapusData
        jButtonHapusData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jDialogHapus.setVisible(true);
            }
        });
        
        // =================== Menu Edit Data =======================
        JDialog jDialogEdit = new JDialog();
        JPanel jPanelEdit = new JPanel();
        JButton jButtonEditOke = new JButton("Oke");
        JLabel jLabelEditNomor = new JLabel("Nomor");
        JTextField jTextFieldEditNomor = new JTextField();
        JPanel jPanelEdit_Data = new JPanel();
        JPanel jPanelEdit_DataNama = new JPanel();
        JPanel jPanelEdit_DataHarga = new JPanel();
        JPanel jPanelEdit_DataSelesai = new JPanel();
        JLabel jLabelEdit_DataNama = new JLabel("Nama");
        JLabel jLabelEdit_DataHarga = new JLabel("Harga");
        JLabel jLabelEdit_Data = new JLabel("");
        JTextField jTextFieldEdit_DataNama = new JTextField();
        JTextField jTextFieldEdit_DataHarga = new JTextField();
        JButton jButtonEdit_DataSelesai = new JButton("Selesai");
        
        // setting jDIalogEdit
        jDialogEdit.setLayout(new BoxLayout(jDialogEdit.getContentPane(), BoxLayout.Y_AXIS));
        jDialogEdit.add(jPanelEdit);
        jDialogEdit.add(jPanelEdit_Data);
        jDialogEdit.setSize(250, 200);
        jDialogEdit.setLocationRelativeTo(null);
        
        // jTextFieldEdit_DataNama
        jTextFieldEdit_DataNama.setMinimumSize(new Dimension(100,20));
        jTextFieldEdit_DataNama.setPreferredSize(new Dimension(100,20));
        jTextFieldEdit_DataNama.setEnabled(false);
                    
        // jTextFieldEdit_DataHarga
        jTextFieldEdit_DataHarga.setMinimumSize(new Dimension(100,20));
        jTextFieldEdit_DataHarga.setPreferredSize(new Dimension(100,20));
        jTextFieldEdit_DataHarga.setEnabled(false);
        
        // jButtonEdit_DataSelesai
        jButtonEdit_DataSelesai.setEnabled(false);
        
        // add actionlistener jButtonEditOke
        jButtonEditOke.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jTextFieldEdit_DataNama.setText(FinalProjectOOP.makanan.daftarMenu.get(Integer.parseInt(jTextFieldEditNomor.getText())-1).nama);
                    jTextFieldEdit_DataHarga.setText(String.valueOf(FinalProjectOOP.makanan.daftarMenu.get(Integer.parseInt(jTextFieldEditNomor.getText())-1).harga));
                    jLabelEdit_Data.setText("Edit data nomor "+jTextFieldEditNomor.getText());
                    jTextFieldEdit_DataNama.setEnabled(true);
                    jTextFieldEdit_DataHarga.setEnabled(true);
                    jButtonEdit_DataSelesai.setEnabled(true);
                } catch (Exception f) {
                    jTextFieldEdit_DataNama.setEnabled(false);
                    jTextFieldEdit_DataHarga.setEnabled(false);
                    jButtonEdit_DataSelesai.setEnabled(false);
                    jLabelEdit_Data.setText("");
                    JOptionPane.showMessageDialog(jDialogEdit, "Input tidak sesuai!");
                }
            }
        });
        // addActionListener jButtonEdit_DataSelesai
        jButtonEdit_DataSelesai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FinalProjectOOP.makanan.editMenu(
                        jTextFieldEdit_DataNama.getText(), 
                        Integer.parseInt(jTextFieldEdit_DataHarga.getText()), 
                        Integer.parseInt(jTextFieldEditNomor.getText()));
                Others.jTableIsiTable(table, FinalProjectOOP.makanan);
                JOptionPane.showMessageDialog(jDialogEdit, "Berhasil edit data!");
                };
        });
        // addActionListener jButtonEditData
        jButtonEditData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jDialogEdit.setVisible(true);
            }
        });
        // jTextFieldEditNomor
        jTextFieldEditNomor.setMinimumSize(new Dimension(80,20));
        jTextFieldEditNomor.setPreferredSize(new Dimension(80,20));
        // jLabelEdit_Data
        jLabelEdit_Data.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        
        jPanelEdit.setLayout(new FlowLayout(FlowLayout.CENTER, 8,4)); // set jPnaelEdit layout
        jPanelEdit.add(jLabelEditNomor);
        jPanelEdit.add(jTextFieldEditNomor);
        jPanelEdit.add(jButtonEditOke);
        
        jPanelEdit_Data.setLayout(new GridLayout(4, 1, 2, 0));
        jPanelEdit_Data.add(jLabelEdit_Data);
        jPanelEdit_Data.add(jPanelEdit_DataNama);
        jPanelEdit_Data.add(jPanelEdit_DataHarga);
        jPanelEdit_Data.add(jPanelEdit_DataSelesai);
        
        jPanelEdit_DataNama.setLayout(new FlowLayout(FlowLayout.CENTER, 10,0));
        jPanelEdit_DataNama.add(jLabelEdit_DataNama);
        jPanelEdit_DataNama.add(jTextFieldEdit_DataNama);
        
        jPanelEdit_DataHarga.setLayout(new FlowLayout(FlowLayout.CENTER, 10,0));
        jPanelEdit_DataHarga.add(jLabelEdit_DataHarga);
        jPanelEdit_DataHarga.add(jTextFieldEdit_DataHarga);
        
        jPanelEdit_DataSelesai.setLayout(new FlowLayout(FlowLayout.CENTER, 0,2));
        jPanelEdit_DataSelesai.add(jButtonEdit_DataSelesai);
        
        FinalProjectOOP.jPanelRightcrd.show(jPanelRight, "jPanelKonfigMakanan");
    }
    
    // custom code
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
                ViewKonfigurasiMakanan.jDialogJumlah.setVisible(true);
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
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane1.setMinimumSize(new java.awt.Dimension(100, 100));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

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
        jPanel3.setBounds(0, 329, 297, 53);

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
            java.util.logging.Logger.getLogger(ViewKonfigurasiMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewKonfigurasiMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewKonfigurasiMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewKonfigurasiMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ViewKonfigurasiMakanan().setVisible(true);
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
    CardLayout jPanelRightcrd = FinalProjectOOP.jPanelRightcrd;
    GridBagConstraints gbc;
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
    private JPanel jPanelRight;
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