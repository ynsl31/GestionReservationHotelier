package com.pfa.reservationhoteliere.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("receptioniste")
public class Receptioniste extends User{

}
