package com.sp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "card")
public class Card {
	
	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description; 

	// @ManyToMany
	// @JoinTable(
	// name = "prix", 
	// joinColumns = @JoinColumn(name = "card_id"), 
	// inverseJoinColumns = @JoinColumn(name = "user_id"))
	@Column(name = "prix")
	private float prix;

	@Column(name = "hp")
	private float hp;

	@Column(name = "attack")
	private float attack;

	@Column(name = "defense")
	private float defense;

	// @ManyToMany
	// @JoinTable(
	// name = "to_sell", 
	// joinColumns = @JoinColumn(name = "card_id"), 
	// inverseJoinColumns = @JoinColumn(name = "user_id"))
	
	@Column(name = "to_sell")
	private boolean toSell;
	// private int familyId;
	// private int affinityId;

	@Column(name = "user_id")
	private int userId;
	

	public Card(int id,String name, String description,float prix, float hp, float attack, float defense, boolean toSell,  int userId) { //int familyId, int affinityId,
		super();
		this.id=id;
		this.name = name;
		this.description = description;
		this.prix = prix;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.toSell = toSell;
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public float getPrix() {
		return this.prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public float getHp() {
		return this.hp;
	}

	public void setHp(float hp) {
		this.hp = hp;
	}

	public float getAttack() {
		return this.attack;
	}

	public void setAttack(float attack) {
		this.attack = attack;
	}

	public float getDefense() {
		return this.defense;
	}

	public void setDefense(float defense) {
		this.defense = defense;
	}

	public void setToSell(Boolean toSell) {
		this.toSell = toSell;
	}

	public boolean getToSell() {
		return this.toSell;
	}

	// public int getFamilyId() {
	// 	return this.familyId;
	// }

	// public void setFamilyId(int familyId) {
	// 	this.familyId = familyId;
	// }

	// public int getAffinityId() {
	// 	return this.affinityId;
	// }

	// public void setAffinityId(int affinityId) {
	// 	this.affinityId = affinityId;
	// }

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}


}
