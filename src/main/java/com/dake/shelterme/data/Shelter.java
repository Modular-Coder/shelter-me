package com.dake.shelterme.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Shelter {
    @Id
    String guid;
    String name;
    String street;
    String city;
    String state;
    String zip;
    String phone;
    String email;
    String notes;
    int totalCapacity;
    int availableCapacity;
    String type;
    String county;
    boolean hasBed;
    boolean hasFood;
    boolean hasFirstAid;
    boolean hasMentalServices;
    boolean hasElderlyServices;
    boolean hasReconnectionAssistance;
    boolean hasInformationAboutOtherResources;
    boolean hasChildCare;
    boolean hasElectricity;
    boolean hasLaundry;
    boolean allowsPets;
    String itemsToBring;
    String rules;
    boolean isOpen;
    boolean isActive;
}
