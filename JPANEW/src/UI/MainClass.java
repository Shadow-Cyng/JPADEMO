package UI;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Login;

public class MainClass {
	
public static void main(String[] args) {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPANEW" );
    EntityManager entitymanager = emfactory.createEntityManager( );
    entitymanager.getTransaction( ).begin( );
    Login login = new Login("satyam0109","Shadowcyng123@");
    
    entitymanager.persist( login );
    
    
    
    
    
    
    
    
    entitymanager.getTransaction( ).commit( );
    entitymanager.close( );
    emfactory.close( );
}
	
}

