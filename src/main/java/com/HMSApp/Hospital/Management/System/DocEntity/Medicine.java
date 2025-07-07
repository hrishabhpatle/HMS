package com.HMSApp.Hospital.Management.System.DocEntity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicines")
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String  durgname;
    private String stock;
    public Medicine(long id, String durgname, String stock) {
        this.id = id;
        this.durgname = durgname;
        this.stock = stock; 
    }
    public Medicine() {
        super();
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDurgname() {
        return durgname;
    }
    public void setDurgname(String durgname) {
        this.durgname = durgname;
    }
    public String getStock() {
        return stock;
    }
    public void setStock(String stock) {
        this.stock = stock;
    }
}
