package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Garage;

/**
 * @author Spencer Tramontina - srtramontina
 * CIS175 - Spring 2024
 * Feb 22, 2024
 */
public class GarageHelper {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Cars");
	
	public void persist(Garage model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(Garage model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(Garage.class, model.getGarageId()));
		manager.getTransaction().commit();
		manager.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Garage> showAllGarages(){
		EntityManager manager = factory.createEntityManager();
		manager.clear();
		Query q = manager.createQuery("SELECT i FROM garage i");
		List<Garage> allCars = q.getResultList();
		manager.close();
		return allCars;
	}
	
	public void update(Garage model) {
		EntityManager manager = factory.createEntityManager();
		Garage dbEntity = manager.find(Garage.class, model.getGarageId());
		manager.getTransaction().begin();
		dbEntity.setName(model.getName());
		manager.getTransaction().commit();
		manager.close();
	}
	
	public Garage searchGarageByName(String name) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Garage> query = manager.createQuery("SELECT i FROM garage AS i WHERE i.name = :name", Garage.class);
		query.setParameter("name", name);
		Garage dbEntity;
		
		try {
			dbEntity = query.getSingleResult();
		} catch(NoResultException nre) {
			dbEntity = new Garage();
		}
		manager.close();
		return dbEntity;
	}
}
