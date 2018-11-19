package com.dake.shelterme.data;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Provider {
    @Id
    String userId;
    String firstName;
    String lastName;
    String email;
    String street;
    String city;
    String state;
    String zip;
    String phone;
    boolean isActive;

    @ElementCollection
    List<Shelter> shelters;
}
