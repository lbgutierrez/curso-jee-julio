package cl.ibm.residencia;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import cl.ibm.residencia.form.ResidenciaForm;

@Configuration
@EnableWebMvc 
@ComponentScan("cl.ibm.residencia")
@Import({WebApplicationConfig.class})
public class AppConfig {

	@Bean(name="residenciaForm")
	@Scope("prototype")
	public ResidenciaForm residenciaForm() {
		return new ResidenciaForm();
	}
	
}
