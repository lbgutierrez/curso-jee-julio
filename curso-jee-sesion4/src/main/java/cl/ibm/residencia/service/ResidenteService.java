package cl.ibm.residencia.service;

import org.springframework.stereotype.Component;

import cl.ibm.residencia.vo.ResidenteVO;

@Component
public class ResidenteService {

	public ResidenteVO getResidentes( String rut ) {
		ResidenteVO residente = new ResidenteVO();
		residente.setRut("1-9");
		residente.setNombre("Juanito Perez");
		residente.setIsResidente("Visita");
		
		return residente;
	}
	
}
