package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Car;
import model.Garage;

public class CarsHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Cars");
	
	
	public void persist(Car model) {
		GarageHelper garageHelper = new GarageHelper();
		Garage existing = garageHelper.searchGarageByName(model.getGarage().getName());
		model.setGarage(existing);
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void update(Car model) {
		EntityManager manager = factory.createEntityManager();
		Car carEntity = manager.find(Car.class, model.getRowId());
		manager.getTransaction().begin();
		carEntity.setOwnerName(model.getOwnerName());
		carEntity.setYear(model.getYear());
		carEntity.setMake(model.getMake());
		carEntity.setModel(model.getModel());
		carEntity.setColor(model.getColor());
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(Car model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(Car.class, model.getRowId()));
		manager.getTransaction().commit();
		manager.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Car> showAllCars(){
		EntityManager manager = factory.createEntityManager();
		List<Car> allTrees = manager.createQuery("SELECT i FROM cars i").getResultList();
		manager.close();
		return allTrees;
	}
	
	public Car searchCarByOwner(String oldName) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Car> query = manager.createQuery("SELECT i FROM cars AS i WHERE i.ownerName = :ownerName", Car.class);
		query.setParameter("ownerName", oldName);
		Car carEntity = query.getSingleResult();
		return carEntity;
	}
}
