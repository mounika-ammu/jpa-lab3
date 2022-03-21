package petdemo;
import javax.persistence.EntityManager;



import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.PassengerId;
import com.Passenger;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PetPU");
		EntityManager entitymanager = emf.createEntityManager();
		
		PassengerId pid = new PassengerId();
		pid.setPassengerEmail("teja198@gmail.com");
		pid.setPassengerMobile(98567893);
		
		Passenger pass = new Passenger();
		pass.setPassengerEmail(pid.getPassengerEmail());
		pass.setPassengerMobile(pid.getPassengerMobile());
		pass.setPassengerName("mounika alla");
		pass.setSource("Tanuku");
		pass.setDestination("visakapatanam");
		
		entitymanager.getTransaction().begin();
		entitymanager.persist(pass);
		entitymanager.flush();
		entitymanager.getTransaction().commit();
		
		
		
	}
}
