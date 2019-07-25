package cl.ibm.residencia.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.ibm.residencia.form.ResidenciaForm;
import cl.ibm.residencia.service.ResidenteService;
import cl.ibm.residencia.vo.ResidenteVO;

@Controller
public class ResidenciaController {

	@Autowired
	private ResidenteService service;
	
	@RequestMapping(value="/", method=RequestMethod.GET )
	public ModelAndView home( ModelAndView mv, HttpServletRequest request, ResidenciaForm form ) {
		
		mv.setViewName( "index" );
		mv.addObject("residenciaForm", form);
		mv.addObject("resultado", new ResidenteVO());
		
		return mv;
		
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST )
	public ModelAndView home_Consulta( ModelAndView mv, ResidenciaForm form ) {
		
		ResidenteVO residente = service.getResidentes( form.getRut() );
		
		System.out.println(form.getRut());
		mv.setViewName( "index" );
		mv.addObject("residenciaForm", form);
		mv.addObject("resultado", residente);
		
		return mv;
		
	}
	
	@RequestMapping(value="/residente/crear", method=RequestMethod.GET )
	public ModelAndView crearResidente( ModelAndView mv, HttpServletRequest request, ResidenciaForm form ) {
		
		service.crearResidente("2-7", "Perico los palotes");
		
		mv.setViewName( "index" );
		mv.addObject("residenciaForm", form);
		mv.addObject("resultado", new ResidenteVO());
		
		return mv;
		
	}
	
}
