/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baith_t4;

import java.util.Scanner;

/**
 *
 * @author vietthanh
 */
public class GiaoDich {
    private String magiaoDich, ngaygiaoDich;
    private double donGia;
    private float dienTich;
    Scanner sc = new Scanner(System.in);
    public GiaoDich(){
        super();
    };
    public GiaoDich(String magiaoDich, String ngaygiaoDich, double donGia, float dienTich) {
        this.magiaoDich = magiaoDich;
        this.ngaygiaoDich = ngaygiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getMagiaoDich() {
        return magiaoDich;
    }

    public void setMagiaoDich(String magiaoDich) {
        this.magiaoDich = magiaoDich;
    }

    public String getNgaygiaoDich() {
        return ngaygiaoDich;
    }

    public void setNgaygiaoDich(String ngaygiaoDich) {
        this.ngaygiaoDich = ngaygiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
     public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }
    
    void Nhap() {
        System.out.println("Nhập mã giao dịch: "); magiaoDich = sc.nextLine();
        System.out.println("Nhập ngày giao dịch (ngay/thang/nam): "); ngaygiaoDich = sc.nextLine();
        System.out.println("Nhập đơn giá: "); donGia = sc.nextDouble();
        System.out.println("Nhập diện tích: "); dienTich = sc.nextFloat();
             
    }   
     
    @Override
    public String toString() {
        return "Mã giao dịch: " + this.magiaoDich + ", Ngày giao dịch: " + this.ngaygiaoDich + ", Đơn giá: " + this.donGia + ", Diện Tích: " + this.dienTich ;
        
  }
            
        
    }
    
    
    
