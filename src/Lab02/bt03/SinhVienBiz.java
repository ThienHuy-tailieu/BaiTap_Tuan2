/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02.bt03;

/**
 *
 * @author ADMIN
 */
public class SinhVienBiz extends SinhVien {

    public double diemMarketing;
    public double diemSales;

    public SinhVienBiz(String hoten, double diemMarketing, double diemSales) {
        super(hoten, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (diemMarketing * 2 + diemSales) / 3;
    }
}
