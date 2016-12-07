package pe.edu.sistemas.asidoc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring3.SpringTemplateEngine;
import org.thymeleaf.spring3.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@Configuration
@EnableWebMvc
@ComponentScan( "pe.edu.sistemas.asidoc" )
public class AppConfig extends WebMvcConfigurerAdapter
{

    @Bean   
    public ServletContextTemplateResolver templateResolver() 
    {
        ServletContextTemplateResolver resolver = new ServletContextTemplateResolver();
        
        resolver.setPrefix( "/views/" );
        resolver.setSuffix( ".html" );
        resolver.setTemplateMode( "LEGACYHTML5" );
        resolver.setCharacterEncoding( "UTF-8" );
        resolver.setCacheable( false ); // En producci�n True
        
        return resolver;
    }
    
    @Bean
    public SpringTemplateEngine templateEngine() 
    {        
//        Set<IDialect> dialects = new HashSet<IDialect>();
//        dialects.add( new LayoutDialect() );
    	
    	//Set<SpringSecurityDialect> dialects = new HashSet<SpringSecurityDialect>();
    	    	
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver( templateResolver() );      
//        engine.setAdditionalDialects( dialects );
        
        return engine;
    }

    @Bean
    public ThymeleafViewResolver viewResolver() 
    {
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setTemplateEngine(templateEngine());
        resolver.setOrder(1);
        resolver.setViewNames( new String[]{ "*", "/resources/js/*", "/resources/css/*", "/resources/img/*", "views/*" } );
        
        return resolver;
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
   	       registry.addResourceHandler("/**").addResourceLocations("/resources/");
    }    

    @Override
    public void configureDefaultServletHandling( DefaultServletHandlerConfigurer configurer ) 
    {
        configurer.enable();
    }
}
