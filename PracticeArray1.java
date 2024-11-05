/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld;
import java.util.Scanner;
import java.util.stream.*;
/**
 *
 * @author Choirul Adji
 */
public class PracticeArray1 {
    public static void main(String[] args) {
        String belanja[] = new String[5];
        Scanner sc = new Scanner(System.in);
        int jumlah[]=new int[5];
        int harga[] = new int[5];
        int total[] = new int[5];
        int sum = IntStream.of(total).sum();
        int pilih=0;
        int item=0, jum=0, grandTotal=0;
        
        do{
            System.out.println(" Kasir Toko Cing Wei ");
            System.out.println("1. Tas     [ 80.000]");
            System.out.println("2. Sepatu  [100.000]");
            System.out.println("3. Sandal  [ 20.000]");
            System.out.println("4. Baju    [ 50.000]");
            System.out.println("5. Jaket   [150.000]");
            System.out.println("6. Selesai ");
            System.out.print(" Pilih : ");
            pilih=sc.nextInt();
            switch(pilih){
                case 1:
                    if(item<belanja.length){
                        belanja[item]="Tas";
                        harga[item]=80000;
                        System.out.print("Jumlah : ");
                        jum=sc.nextInt();
                        jumlah[item]=jum;
                        total[item] = harga[item]*jumlah[item];
                    } else { 
                        System.out.println("PENUH HAYYAA");
                    }
                    break;
                case 2:
                    if(item<belanja.length){
                        belanja[item]="Sepatu";
                        harga[item]=100000;
                        System.out.print("Jumlah : ");
                        jum=sc.nextInt();
                        jumlah[item]=jum;
                        total[item] = harga[item]*jumlah[item];
                    } else {
                        System.out.println(" PENUH HAYYAA ");
                    }
                    break;
                case 3:
                    if(item<belanja.length){
                       belanja[item]="Sandal";
                       harga[item]=20000;
                       System.out.print("Jumlah : ");
                       jum=sc.nextInt();
                       jumlah[item]=jum;
                       total[item] = harga[item]*jumlah[item];
                    } else {
                        System.out.println(" PENUH HAYYA ");
                    }
                    break;
                case 4:
                    if(item<belanja.length){
                        belanja[item]="Baju";
                        harga[item]=50000;
                        System.out.print("Jumlah : ");
                        jum=sc.nextInt();
                        jumlah[item]=jum;
                        total[item] = harga[item]*jumlah[item];
                    } else {
                        System.out.println(" PENUH HAYYA ");
                    }
                    break;
                case 5:
                    if (item<belanja.length){
                        belanja[item]="Jaket";
                        harga[item]=150000;
                        System.out.print("Jumlah : ");
                        jum=sc.nextInt();
                        jumlah[item]=jum;
                        total[item] = harga[item]*jumlah[item];
                    } else {
                        System.out.print(" PENUH HAYYAA ");
                    }
                    break;
                case 6:
                    System.out.println("Daftar Belanja");
                    for (int i = 0; i < item; i++) {
                        sum += total[i];
                        System.out.println(+ (i+1) + "\t" +belanja[i] + "\t [Rp" + harga[i] + "]\t[" + jumlah[i] + "]\t[Rp" + total[i] + "]");  
                    }
                    System.out.println("Grand Total : Rp" + sum);
                    break;        
            }
            item++;
            if(item>5){
                System.out.println("Keranjang Penuh");
                break;
            }
        }while(pilih!=6);
    }
}


   