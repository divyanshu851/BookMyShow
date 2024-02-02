package com.example.bookmyshow.models;

import com.example.bookmyshow.models.constant.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class City extends BaseModel {
    @Column(name = "CityName")
    private String name;
    @OneToMany
    private List<Theatre> theatres;

}
