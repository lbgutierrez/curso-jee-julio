package cl.ibm.residencia;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer  {
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		 return new Class[] { AppConfig.class };
	}

	@Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebApplicationConfig.class };
    }
 
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    } 
    
}
