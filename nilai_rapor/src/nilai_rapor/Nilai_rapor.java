/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai_rapor;

import java.util.Scanner;

/**
 *
 * @author GeeksFarm
 */
class nilairapor{
    int Nomor_siswa;
    int Kelas;
    double Nilai_mtk;
    double Nilai_bahasainggris;
    double Nilai_bahasaindonesia;
    double Nilai_ipa;
    double Nilai_ips;
    double Nilai_agama;
    double Nilai_olahraga;
    double jumlah;
    double rata_rata;
    Scanner inputan = new Scanner(System.in);

public nilairapor(){
    Nomor_siswa=0;
    Kelas=0;
    Nilai_mtk=0.0;
    Nilai_bahasainggris=0.0;
    Nilai_bahasaindonesia=0.0;
    Nilai_ipa=0.0;
    Nilai_ips=0.0;
    Nilai_agama=0.0;
    Nilai_olahraga=0.0;
    rata_rata=0.0;
    jumlah=0.0;
}

public void input(){
        
    System.out.println("Selamat datang di Program Nilai Rapor Siswa");
    System.out.println("===========================================");
    System.out.println("Masukkan Data Anda");
    
    System.out.print("Masukkan Nomor Induk Siswa      : ");
    if (!inputan.hasNextInt())
        {
            System.out.println ("Harus angka! Tidak bisa di proses");
        } 
    else
        {
            Nomor_siswa=inputan.nextInt();
        }
        
    System.out.print("Masukkan Kelas                  : ");
    if (!inputan.hasNextInt())
        {
            System.out.println ("Harus angka! Tidak bisa di proses");
        } 
    else
        {
            Kelas=inputan.nextInt();
        }
        
    System.out.print("Masukkan Nilai Matematika       : ");
    if (!inputan.hasNextDouble())
        {
            System.out.println ("Harus angka! Tidak bisa di proses");
        } 
    else
        {  
            Nilai_mtk=inputan.nextDouble();
        }
    
    System.out.print("Masukkan Nilai Bahasa Indonesia : ");
    if (!inputan.hasNextDouble())
        {
            System.out.println ("Harus angka! Tidak bisa di proses");
        } 
    else
        {  
            Nilai_bahasaindonesia=inputan.nextDouble();
        
    System.out.print("Masukkan Nilai Bahasa Inggris   : ");
    if (!inputan.hasNextDouble())
        {
            System.out.println ("Harus angka! Tidak bisa di proses");
        } 
    else
        {  
            Nilai_bahasainggris=inputan.nextDouble();
        }
        
    System.out.print("Masukkan Nilai IPA              : ");
    if (!inputan.hasNextDouble())
        {
            System.out.println ("Harus angka! Tidak bisa di proses");
        } 
    else
        {  
            Nilai_ipa=inputan.nextDouble();
        }
        
    System.out.print("Masukkan Nilai IPS              : ");
    if (!inputan.hasNextDouble())
        {
            System.out.println ("Harus angka! Tidak bisa di proses");
        } 
    else
        {  
            Nilai_ips=inputan.nextDouble();
        }
        
    System.out.print("Masukkan Nilai Agama            : ");
    if (!inputan.hasNextDouble())
        {
            System.out.println ("Harus angka! Tidak bisa di proses");
        } 
    else
        {  
            Nilai_agama=inputan.nextDouble();
        }
    
    System.out.print("Masukkan Nilai Olahraga         : ");
    if (!inputan.hasNextDouble())
        {
            System.out.println ("Harus angka! Tidak bisa di proses");
        } 
    else
        { 
            Nilai_olahraga=inputan.nextDouble();
        }

        System.out.println("============================================");
    }
}

public double jumlah(){
        return Nilai_mtk+Nilai_bahasaindonesia+Nilai_bahasainggris+Nilai_ipa+Nilai_ips+Nilai_agama+Nilai_olahraga;
    }
    
public double rata_rata(){
        return jumlah()/7;
    }

public void ifelse(){   
if (rata_rata()>7)
 {
    System.out.print ("Naik Kelas");
 }
else if (rata_rata()<=7)
 {   
    System.out.print ("Tidak Naik Kelas");
 }
else 
 {   
    System.out.print ("Tidak Tersedia");
 }
 }

public void output(){
        System.out.println("Hasil Data Siswa");
        System.out.println("===========================================");
        System.out.println("Nomor Induk Siswa      : "+Nomor_siswa);
        System.out.println("Kelas                  : "+Kelas);
        System.out.println("Jumlah Nilai           : "+jumlah());
        System.out.println("Rata-rata Nilai        : "+rata_rata());
        System.out.print("Hasil Pengumuman       : ");
        ifelse();
        
        System.out.println();
    }
    
}

public class Nilai_rapor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nilairapor rpt=new nilairapor();
        rpt.input();
        rpt.output();
    }
    
}
