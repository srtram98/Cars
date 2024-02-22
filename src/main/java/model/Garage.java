package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Spencer Tramontina - srtramontina
 * CIS175 - Spring 2024
 * Feb 22, 2024
 */
@Entity(name="garage")
public class Garage {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int garageId;
	private String name;
	@OneToMany(mappedBy="garage", cascade=CascadeType.MERGE, fetch= FetchType.EAGER)
	private List<Car> cars;
	
	
	public int getGarageId() {
		return garageId;
	}
	public void setGarageId(int garageId) {
		this.garageId = garageId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	
}