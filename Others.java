/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalprojectoop;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author User
 */
public class Others {
    // custom variables
    // colors
    public static Color textColor = new Color(105, 105, 105);
    public static Color white = new Color(217, 217, 217);
    public static Color oldBlue = new Color(44, 46, 67);
    public static Color yellow = new Color(237, 192, 0);
    // jFrame
    public static void jFrameSetFrame(JFrame jFrame){
        jFrame.pack();
//        jFrameSetFullScreen(jFrame);
        jFrame.setSize(600, 400);
        jFrameSetWindowCenter(jFrame);
        jFrameSetDefaultCloseOperation(jFrame);
        jFrame.setVisible(true);
    }
    public static void jFrameSetFullScreen(JFrame jFrame){
        jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }
    public static void jFrameSetWindowCenter(JFrame jFrame){
        jFrame.setLocationRelativeTo(null);
    }
    public static void jFrameSetDefaultCloseOperation(JFrame jFrame){
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // jButton
    public static void jButtonSetIconAndTextAlignment(JButton jButton, int textAlignment){
        if (textAlignment == JButton.BOTTOM){
            jButton.setVerticalTextPosition(JButton.BOTTOM);
            jButton.setHorizontalTextPosition(JButton.CENTER);            
        }
    }
    public static void jButtonSetACtive(JButton jButton, boolean active){
        if (active) jButton.setBackground(yellow);
        else jButton.setBackground(white);
    }
    
    //
    public static ImageIcon getScaledImage(int width, int height, String path)
    {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image newing = img.getScaledInstance(width, height, SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newing);
        
        return newIcon;
    }
    
    public static void jTableSetCellAlignment(JTable table, int alignment, int columnIndex)
    {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(alignment);

        TableModel tableModel = table.getModel();

        table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
    }
    public static void jTableSetCellsAlignment(JTable table, int alignment)
    {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(alignment);

        TableModel tableModel = table.getModel();

        for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++)
        {
            table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
        }
    }
    // jtable
    public static void jTableSetting(javax.swing.JTable jTable){
        // cells tidak bisa diedit
        jTable.setEnabled(false); 
        // setting lebar kolom 
        try {
            jTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable.getColumnModel().getColumn(2).setPreferredWidth(60);
        } catch (Exception e) {}
        // center all columns
        jTableSetCellAlignment(jTable, JLabel.CENTER, 0);
        jTableSetCellAlignment(jTable, JLabel.CENTER, 2);
    }
    
    public static  void jTableClearData(javax.swing.JTable JTable) {
        JTable.setModel(new DefaultTableModel(
        null,
        new String [] {
            "No", "Nama", "Harga (Rp)"
        }));
    }
    
    public static void jTableAddData(javax.swing.JTable JTable, Menu menu, String nama, String harga){
        DefaultTableModel model = (DefaultTableModel) JTable.getModel();
        model.addRow(new String[]{String.valueOf(menu.daftarMenu.size()), nama, harga});
    }
    
    public static void jTableIsiTable(javax.swing.JTable JTable, Menu menu){
        jTableClearData(JTable);
        DefaultTableModel model = (DefaultTableModel) JTable.getModel();
	model.addRow(new String[]{"1", "coba", "hehe"});

        String cols[] = {"No", "Nama", "Harga (Rp)"};
        String data[][] = new String[menu.daftarMenu.size()][3];
        
        if (!menu.daftarMenu.isEmpty()){
            for (int i = 0; i < menu.daftarMenu.size(); i++) {
                data[i][0] = String.valueOf(i+1);
                data[i][1] = menu.daftarMenu.get(i).nama;
                data[i][2] = String.valueOf(menu.daftarMenu.get(i).harga);
            }
            
            model.setDataVector(data, cols);
        }
        Others.jTableSetting(JTable);
    }
    
    public static boolean daftarMenuIsEmpty(Menu menu){
        return menu.daftarMenu.isEmpty();
    }
    
    public static void cekData(javax.swing.JScrollPane jScrollPane, javax.swing.JLabel label){
        if (daftarMenuIsEmpty(FinalProjectOOP.minuman)){ // jika tidak ada data minuman tampilkan kosong
            jScrollPane.setVisible(false);
            label.setVisible(true);    
        }
        else {
            label.setVisible(false);
            jScrollPane.setVisible(true);
        }
    }
}
