package com.jee.donationswebsite.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "donateur")
@Table(name = "donateur")
@DiscriminatorValue("donateur")
public class Donateur extends Personne {

}
