package com.saeeds28.RestDemo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * This POJO class will be annotated so it can be returned as an XML format
 * @author Saad
 *
 */

@XmlRootElement
public class Alien {

	private String name;
	private int skillPoints;
	
	public Alien() {}
	
	public Alien(String name, int skillPoints) {
		super();
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
	
}
