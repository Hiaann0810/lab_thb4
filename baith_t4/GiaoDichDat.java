/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baith_t4;

import java.util.Scanner;

/**
 *
 * @author vietthanh
 */
public class GiaoDichDat extends GiaoDich {
    private String loaiDat;
    Scanner scanner = new Scanner(System.in);
    
    public GiaoDichDat() {
        super();
    }
    public GiaoDichDat(String loaiDat) {
        super();
        this.loaiDat = loaiDat;        
    }

    public String getLoaiDat() {
        return loaiDat; 
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    
    public void Nhap() {
        super.Nhap();
        System.out.println("Nhập loại đất A, B, C: ");
        loaiDat = scanner.nextLine();
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Loại Đất: " + this.loaiDat;
    }
    
}
