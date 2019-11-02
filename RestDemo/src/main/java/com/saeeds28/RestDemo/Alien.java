package com.saeeds28.RestDemo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * This POJO class will be annotated so it can be returned as an XML format
 * @author Saad
 *
 */

@XmlRootElement
public class Alien {

	private int id;
	private String name;
	private int skillPoints;
	
	public Alien() {}
	
	public Alien(int id, String name, int skillPoints) {
		super();
		this.id = id;
		this.name = name;
		this.skillPoints = skillPoints;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSkillPoints() {
		return skillPoints;
	}
	public void setSkillPoints(int skillPoints) {
		this.skillPoints = skillPoints;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", skillPoints=" + skillPoints + "]";
	}
	
	
}
