package com.example.bookmyshow.models;

import com.example.bookmyshow.models.constant.BaseModel;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Actor extends BaseModel {
    private String name;

}
