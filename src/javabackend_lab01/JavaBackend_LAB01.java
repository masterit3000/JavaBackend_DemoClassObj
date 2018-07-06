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
public class JavaBackend_LAB01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //bat dau chay chuong trinh
        //cacsh tao obj tu class
        KhachHang kh01;//khai bao obj co ten la kh01
        kh01 = new KhachHang();//khoi tao ra 1 obj
        //1 obj phai khai bao va khoi tao moi dung dc
        kh01.ma = 1;
        kh01.ten = "Ngueyn Van A";
        kh01.diaChi = " Ha Noi";
        kh01.inThongTin();
        
        //build javac
        //run: java -jar
        
    }

}
