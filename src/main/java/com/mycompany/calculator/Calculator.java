/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

/**
 *
 * @author fadel
 */
public class Calculator {

    // Method untuk penjumlahan
    public int tambah(int a, int b) {
        return a + b;
    }

    // Method untuk pengurangan
    public int kurang(int a, int b) {
        return a - b;
    }

    // Method untuk perkalian
    public int kali(int a, int b) {
        return a * b;
    }

    // Method untuk pembagian
    public int bagi(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Pembagi tidak boleh nol");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Tambah: " + calc.tambah(10, 5));
        System.out.println("Kurang: " + calc.kurang(10, 5));
        System.out.println("Kali: " + calc.kali(10, 5));
        System.out.println("Bagi: " + calc.bagi(10, 5));
    }
}
