/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kubus;

/**
 *
 * @author asus
 */
public class Kubus {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Kubus(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}
