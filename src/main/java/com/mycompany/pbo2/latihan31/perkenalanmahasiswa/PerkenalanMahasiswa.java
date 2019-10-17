/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan31.perkenalanmahasiswa;

/**
 *
 * @author Tendy
 * Nama     : Tendy Hermansyah
 * Kelas    : PBO2
 * Nim      : 10118083
 * Deskripsi Tugas : Perkenalan Mahasiswa
 */
public class PerkenalanMahasiswa {
    public static void main(String[] args) {
        
        Mahasiswa mahasiswa = new Mahasiswa();
        
        mahasiswa.nim = "10110269";
        mahasiswa.nama = "Rizki Adam Kurniawan";
        mahasiswa.perkenalanDiri();
        mahasiswa.nim = "10110270";
        mahasiswa.nama = "Indra Tiola";
        mahasiswa.perkenalanDiri();
        mahasiswa.nim = "10110271";
        mahasiswa.nama = "Robi Tanzil Ganefi";
        mahasiswa.perkenalanDiri();
        mahasiswa.nim = "10110269";
        mahasiswa.nama = "Muhammad Nur Awaludin";
        mahasiswa.perkenalanDiri();
        
    }
    
}
