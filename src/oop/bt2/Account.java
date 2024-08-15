/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt2;

/**
 *
 * @author ADMIN
 */
public class Account {

    
    private String id,name;
    private int balance;
    public Account(){
        id="";
        name="";
        balance=(int) 1.0;
    }
    public Account(String id,String name,int blance){
        this.id=id;
        this.name=name;
        this.balance=blance;
    }
    public String getId(){
        return id;
    }
    public void getId(String id){
        this.id=id;
    }
     public String getName(){
        return name;
    }
    public void getName(String name){
        this.name=name;
    }
    public int getBalance(){
        return balance;
    }
    public void credit(int amount){
        if(amount>0)
           balance +=amount;
    }
    public void debit(int amount){
        if(balance>=amount){
            balance -=amount;
            System.out.println("Giao dich thanh toan thanh cong!");
        }else{
            System.out.println("So tien thanh toan vuot so du. Giao dich thanh toan that bai!");
        }
    }
    public void tranfeTo(Account other,int amount){
        if(balance>=amount){
            balance -=amount;
            other.balance +=amount;
            System.out.println("Giao dich thanh toan thanh cong!");
        }else{
            System.out.println("So tien thanh toan vuot so du. Giao dich thanh toan that bai!");
        }
    }
}
