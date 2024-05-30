/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

/**
 *
 * @author fadel
 */
public class Calculator {

    // Method untuk operasi biner
    private int operate(int a, int b, String operator) {
        switch(operator) {
            case "tambah":
                return a + b;
            case "kurang":
                return a - b;
            case "kali":
                return a * b;
            case "bagi":
                if (b == 0) {
                    throw new IllegalArgumentException("Pembagi tidak boleh nol");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Operator tidak valid");
        }
    }

    public int tambah(int a, int b) {
        return operate(a, b, "tambah");
    }

    public int kurang(int a, int b) {
        return operate(a, b, "kurang");
    }

    public int kali(int a, int b) {
        return operate(a, b, "kali");
    }

    public int bagi(int a, int b) {
        return operate(a, b, "bagi");
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Tambah: " + calc.operate(10, 5, "tambah"));
        System.out.println("Kurang: " + calc.operate(10, 5, "kurang"));
        System.out.println("Kali: " + calc.operate(10, 5, "kali"));
        System.out.println("Bagi: " + calc.operate(10, 5, "bagi"));
    }
}

