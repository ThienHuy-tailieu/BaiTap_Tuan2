/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02.bt02;

/**
 *
 * @author ADMIN
 */
public class Program2 {
    public static void main(String[] args) {
        Tron c1=new Tron(5.0);
        System.out.println("Hinh tron{bankinh:"+c1.getBanKinh()+", Dien tich:"+c1.tinhDienTich()+", Chu vi:"+c1.tinhChuVi());
        
        Tru c2=new Tru(5.0,4.0);
        System.out.println("Hinh tru{bankinh:"+c2.getBanKinh()+", Chieu cao:"+c2.getChieuCao()+", Dien tich:"+c2.tinhDienTich()+", Chu vi:"+c2.tinhChuVi());
    }
}
