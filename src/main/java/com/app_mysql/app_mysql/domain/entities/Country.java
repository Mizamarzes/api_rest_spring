package com.app_mysql.app_mysql.domain.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @Column(columnDefinition = "VARCHAR(5)", nullable = false)
    private String codeCountry;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String nameCountry;

    @OneToMany(mappedBy = "countries")
    private List<Region> regions;

    public Country() {
    }

    public Country(String codeCountry, String nameCountry) {
        this.codeCountry = codeCountry;
        this.nameCountry = nameCountry;
    }

    public String getCodeCountry() {
        return codeCountry;
    }

    public void setCodeCountry(String codeCountry) {
        this.codeCountry = codeCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    
    

}
