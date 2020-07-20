package com.sa.poc.carscrud.entities;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Car implements Serializable {

	private static final long serialVersionUID = -1190490253693716460L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	@Column(name = "build_date", nullable = false, length = 100)
	private String builddate;

	@Column(name = "make", nullable = false, length = 100)
	private String make;

	@Column(name = "model", nullable = false, length = 100)
	private String model;

	@Column(name = "color", nullable = false, length = 100)
	private String color;

	@Column(name = "number_of_doors", nullable = false, length = 100)
	private String numberofdoors;

	@Column(name = "engine_sie", nullable = false, length = 100)
	private String enginesie;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBuilddate() {
		return builddate;
	}

	public void setBuilddate(String builddate) {
		this.builddate = builddate;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNumberofdoors() {
		return numberofdoors;
	}

	public void setNumberofdoors(String numberofdoors) {
		this.numberofdoors = numberofdoors;
	}

	public String getEnginesie() {
		return enginesie;
	}

	public void setEnginesie(String enginesie) {
		this.enginesie = enginesie;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Car() {

	}

}
