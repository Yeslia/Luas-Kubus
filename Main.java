/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kubus;

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) {
    double panjang = 5; // contoh nilai panjang kubus
    double lebar = 5; // contoh nilai lebar kubus
    double tinggi = 5; // contoh nilai tinggi kubus

    Kubus kubus = new Kubus(panjang, lebar, tinggi);
    double luas = kubus.hitungLuas();

    System.out.println("Luas Kubus: " + luas);
}
}
