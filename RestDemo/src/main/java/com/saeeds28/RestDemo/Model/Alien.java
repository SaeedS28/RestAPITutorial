package com.saeeds28.RestDemo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This POJO class will be annotated so it can be returned as an XML format
 * @author Saad
 *
 */

@XmlRootElement
@Entity(name="Alien")
@Table(name="Alien")
public class Alien {

	@Id
	@SequenceGenerator(name="id_generator", sequenceName = "product_id_seq", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
	@Column(name = "ALIEN_ID", nullable=false)
	private int id;
	
	@Column(name="ALIEN_NAME", nullable = false)
	private String name;
	
	@Column(name="SKILL_POINTS", nullable = false)
	private int skillPoints;
	
	public Alien() {}
	
	public Alien(String name, int skillPoints) {
		super();
		this.name = name;
		this.skillPoints = skillPoints;
	}
	
	public Alien(int id, String name, int skillPoints) {
		super();
		this.id=id;
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
