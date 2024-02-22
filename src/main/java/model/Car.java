package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Spencer Tramontina - srtramontina
 * CIS175 - Spring 2024
 * ${date}
 */

@Entity(name="cars")
public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rowId;
	
	private int year;
	private String make;
	private String model;
	private String color;
	private String ownerName;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="garageId", nullable = false)
	private Garage garage = new Garage();
	
	
	public int getRowId() {
		return rowId;
	}
	
	public void setRowId(int rowId) {
		this.rowId = rowId;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
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

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Garage getGarage() {
		return garage;
	}

	public void setGarage(Garage garage) {
		this.garage = garage;
	}
	
	
}
