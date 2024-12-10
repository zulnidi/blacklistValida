package com.edu.ue.blacklist;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "blacklist")
public class blacklist {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_blacklist;

    @Column
    private String estado;

    // constructores
    public blacklist() {
    }

    public blacklist(int id_blacklist, String estado) {
        this.id_blacklist = id_blacklist;
        this.estado = estado;
    }

    // geters y seters
    public int getId_blacklist() {
        return id_blacklist;
    }

    public void setId_blacklist(int id_blacklist) {
        this.id_blacklist = id_blacklist;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
