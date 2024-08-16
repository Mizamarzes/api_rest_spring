package com.app_mysql.app_mysql.domain.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Person {
    @Id
    @Column(name = "id_person", columnDefinition = "VARCHAR(20)", nullable = false)
    private String idperson;
    
    @Column(name = "first_name", columnDefinition = "VARCHAR(50)", nullable = false)
    private String firtname;

    @Column(name = "last_name", columnDefinition = "VARCHAR(50)", nullable = false)
    private String lastname;

    @ManyToOne
    City cities;

    @ManyToOne
    TypePerson type_persons;

    public Person() {
    }

    public String getIdperson() {
        return idperson;
    }

    public void setIdperson(String idperson) {
        this.idperson = idperson;
    }

    public String getFirtname() {
        return firtname;
    }

    public void setFirtname(String firtname) {
        this.firtname = firtname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public City getCities() {
        return cities;
    }

    public void setCities(City cities) {
        this.cities = cities;
    }

    public TypePerson getType_persons() {
        return type_persons;
    }

    public void setType_persons(TypePerson type_persons) {
        this.type_persons = type_persons;
    }


}
