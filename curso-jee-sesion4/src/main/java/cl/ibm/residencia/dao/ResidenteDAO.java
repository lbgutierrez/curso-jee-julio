package cl.ibm.residencia.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cl.ibm.residencia.entity.Residente;

public class ResidenteDAO {

	@PersistenceContext
    protected EntityManager em;
	
	public void crearResidente( Residente residente ) {
		
		em.persist( residente );
		
	}
	
}
