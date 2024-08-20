/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02.bt02;

/**
 *
 * @author ADMIN
 */
public class Tron {
    public  double bankinh;
    public Tron(){
        bankinh=1.0;
    }
    public Tron(double bankinh){
        this.bankinh=bankinh;
    }
    public double getBanKinh(){
        return bankinh;
    }
    public void setBanKinh(double bankinh){
        this.bankinh=bankinh;
    }
    public double tinhDienTich(){
        return Math.PI*bankinh*bankinh;
    }
    public double tinhChuVi(){
        return 2*Math.PI*bankinh;
    }
}
