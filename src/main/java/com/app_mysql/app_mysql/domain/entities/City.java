package com.app_mysql.app_mysql.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cities")
public class City {
    @Id
    @Column(columnDefinition = "VARCHAR(5)", nullable = false)
    private String codeCity;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String nameCity;

    @ManyToOne
    private Region regions;

    public City() {
    }

    public City(String codeCity, String nameCity) {
        this.codeCity = codeCity;
        this.nameCity = nameCity;
    }

    public String getCodeCity() {
        return codeCity;
    }

    public void setCodeCity(String codeCity) {
        this.codeCity = codeCity;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    
}
