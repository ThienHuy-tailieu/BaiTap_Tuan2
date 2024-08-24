/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02.bt03;

/**
 *
 * @author ADMIN
 */
public class SinhVienIT extends SinhVien {

    public double diemJava;
    public double diemCss;
    public double diemHtml;

    public SinhVienIT(String hoten, double diemJava, double diemCss, double diemHtml) {
        super(hoten, "IT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem() {
        return (diemJava * 2 + diemHtml + diemCss) / 4;
    }
}
