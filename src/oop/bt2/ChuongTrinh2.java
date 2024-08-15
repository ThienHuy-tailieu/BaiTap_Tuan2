/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt2;
/**
 *
 * @author ADMIN
 */
public class ChuongTrinh2 {
    public static void main(String[] args) {
        Account ac1=new Account("TK01","Bui Thien Huy", 10000000);
        Account ac2=new Account("TK02","Nguyen Xuan Truong", 0);
        
        System.out.println("Thong tin tai khoan ban dau:");
        System.out.println("My Account [id:" + ac1.getId()+ ", name:" + ac1.getName()+ ", blance: " + ac1.getBalance() + "}");
        System.out.println("Myfriend Account [id:" + ac2.getId()+ ", name:" + ac2.getName()+ ", blance: " + ac2.getBalance() + "}");
        
        System.out.println("Rut 2000000 tien tu tai khoan My Account....");
        ac1.debit(2000000);
        
        System.out.println("Nap 1000000 vao tai khoan Myfriend Account....");
        ac2.credit(1000000);
        
        System.out.println("Chuyen khoan 500 tu myfriend to me....");
        ac2.tranfeTo(ac1,500);
        
        System.out.println("Thong tin tai khoan sau giao dich:");
        System.out.println("My Account [id:" + ac1.getId()+ ", name:" + ac1.getName()+ ", blance: " + ac1.getBalance() + "}");
        System.out.println("Myfriend Account [id:" + ac2.getId()+ ", name:" + ac2.getName()+ ", blance: " + ac2.getBalance() + "}");
    }
}
