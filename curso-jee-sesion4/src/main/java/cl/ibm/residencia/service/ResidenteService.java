package cl.ibm.residencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cl.ibm.residencia.dao.ResidenteDAO;
import cl.ibm.residencia.entity.Residente;
import cl.ibm.residencia.vo.ResidenteVO;

@Component
@Transactional(propagation = Propagation.REQUIRED)
public class ResidenteService {

	@Autowired
	ResidenteDAO dao;
	
	public void crearResidente( String rut, String nombre) {
		
		Residente residente = new Residente();
		residente.setRut( rut );
		residente.setNombre( nombre );
		residente.setResidente( true );
		
		dao.crearResidente( residente );
		
	}
	
	
	public ResidenteVO getResidentes( String rut ) {
		ResidenteVO residente = new ResidenteVO();
		residente.setRut("1-9");
		residente.setNombre("Juanito Perez");
		residente.setIsResidente("Visita");
		
		return residente;
	}
	
}
