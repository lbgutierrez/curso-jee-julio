package cl.ibm.residencia;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import cl.ibm.residencia.dao.ResidenteDAO;
import cl.ibm.residencia.form.ResidenciaForm;
import cl.ibm.residencia.service.ResidenteService;

@Configuration
@EnableWebMvc 
@ComponentScan("cl.ibm.residencia")
@EnableTransactionManagement
@Import({WebApplicationConfig.class, PersistanceConfig.class })
public class AppConfig {

	@Bean(name="residenciaForm")
	@Scope("prototype")
	public ResidenciaForm residenciaForm() {
		return new ResidenciaForm();
	}
	
	@Bean(name="residenteService")
	@Scope("prototype")
	public ResidenteService residenteService() {
		return new ResidenteService();
	}
	
	@Bean(name="residenteDAO")
	@Scope("prototype")
	public ResidenteDAO residenteDAO() {
		return new ResidenteDAO();
	}
	
}
