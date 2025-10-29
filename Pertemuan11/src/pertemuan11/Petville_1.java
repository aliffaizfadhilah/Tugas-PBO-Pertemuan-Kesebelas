/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan11;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Alif
 */
@Entity
@Table(name = "petville")
@NamedQueries({
    @NamedQuery(name = "Petville_1.findAll", query = "SELECT p FROM Petville_1 p ORDER BY p.idHewan ASC"),
    @NamedQuery(name = "Petville_1.findByIdHewan", query = "SELECT p FROM Petville_1 p WHERE p.idHewan = :idHewan"),
    @NamedQuery(name = "Petville_1.findByNamaHewan", query = "SELECT p FROM Petville_1 p WHERE p.namaHewan = :namaHewan"),
    @NamedQuery(name = "Petville_1.findByJenisHewan", query = "SELECT p FROM Petville_1 p WHERE p.jenisHewan = :jenisHewan"),
    @NamedQuery(name = "Petville_1.findByHarga", query = "SELECT p FROM Petville_1 p WHERE p.harga = :harga")})
public class Petville_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_hewan")
    private String idHewan;
    @Column(name = "nama_hewan")
    private String namaHewan;
    @Column(name = "jenis_hewan")
    private String jenisHewan;
    @Column(name = "harga")
    private Integer harga;

    public Petville_1() {
    }

    public Petville_1(String idHewan) {
        this.idHewan = idHewan;
    }

    public String getIdHewan() {
        return idHewan;
    }

    public void setIdHewan(String idHewan) {
        this.idHewan = idHewan;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHewan != null ? idHewan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Petville_1)) {
            return false;
        }
        Petville_1 other = (Petville_1) object;
        if ((this.idHewan == null && other.idHewan != null) || (this.idHewan != null && !this.idHewan.equals(other.idHewan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pertemuan11.Petville_1[ idHewan=" + idHewan + " ]";
    }
    
}
