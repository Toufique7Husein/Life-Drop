package lifedrop.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebConfiguration implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context =new AnnotationConfigWebApplicationContext();
		context.register(ApplicationConfigration.class);
		DispatcherServlet dispatcherServlet =new DispatcherServlet(context);
		
		ServletRegistration.Dynamic servlet = servletContext.addServlet("lifedropServer", dispatcherServlet);
		servlet.setLoadOnStartup(5);
		servlet.addMapping("/");
		
	}

}
