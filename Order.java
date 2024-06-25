/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalprojectoop;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Order<T extends Menu> 
{
    int jumlah;
    T item;
    ArrayList<Order> orderList = new ArrayList<>();

    public void tambahItem(T obj, int jumlah){
        Order<T> newItem = new Order<>();
        newItem.item = obj;
        newItem.jumlah = jumlah;
        orderList.add((Order) newItem);
    }
    
    public void lihatItem(){
        for (int i = 0; i < orderList.size(); i++) {
            System.out.println("%d. %s".formatted(i+1, this.orderList.get(i).item.nama));            
        }
    }
}
