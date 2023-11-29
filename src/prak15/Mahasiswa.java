/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak15;

/**
 *
 * @author idref
 */
public class Mahasiswa {
    
    private String NPM;
    private String Nama;
    private String Alamat;

    public Mahasiswa(String NPM, String Nama, String Alamat) {
        this.NPM = NPM;
        this.Nama = Nama;
        this.Alamat = Alamat;
    }

    public String getNPM() {
        return NPM;
    }

    public void setNPM(String NPM) {
        this.NPM = NPM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    
    
    
}
