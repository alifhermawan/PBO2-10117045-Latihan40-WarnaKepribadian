/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117045.latihan40.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Alif Hermawan
 * KELAS    : PBO2
 * NIM      : 10117045
 * Deskripsi Program :  Program ini berisi perintah untuk menampilkan hasil tes
 * kepribadian berdasarkan warna yang dimasukan user
 */
public class Pengguna {
    
 public String namaUser;
    Scanner scn = new Scanner(System.in);

    public void memasukkanNama() {
        System.out.print("NAMA KAMU : ");
        namaUser = scn.next();
    }
}
