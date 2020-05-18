package com.pfa.reservationhoteliere.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("chefreception")
public class ChefReception extends User{

}
