/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackend_lab01;

/**
 *
 * @author Admin
 */
public class KhachHang {

    public int ma;
    public String ten;
    public String diaChi;

    //viet ham trong Java giong C. kieu du lieu tra ve   ten ham ( tham so truyen vao){ noi dung}
    public void inThongTin() {
        int ma = 10;
        //in thong tin khach hang ra man hinh
        System.out.println("Ma =" + this.ma);//this: dai dien cho obj hien tai se goi ham nay chay
        System.out.println("ten =" + this.ten);
        System.out.println("diaChi =" + this.diaChi);
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

}
