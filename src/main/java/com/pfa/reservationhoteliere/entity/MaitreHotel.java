package com.pfa.reservationhoteliere.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("maitrehotel")
public class MaitreHotel extends User{

}
