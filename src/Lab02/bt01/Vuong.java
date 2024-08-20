/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02.bt01;

/**
 *
 * @author ADMIN
 */
public class Vuong extends ChuNhat{
    public Vuong(double canh){
        super(canh,canh);
    }
    
    @Override
    public void xuat(){
        System.out.println("HV{canh:"+super.dai +", chuvi:"+super.getDienTich()+ ", chuvi:"+super.getChuVi());
    }
}
