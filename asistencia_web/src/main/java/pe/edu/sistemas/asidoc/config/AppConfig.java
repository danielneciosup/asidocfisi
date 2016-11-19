package pe.edu.sistemas.asidoc.config;

import java.util.HashSet;
import java.util.Set;

import nz.net.ultraq.thymeleaf.LayoutDialect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.dialect.IDialect;
import org.thymeleaf.spring3.SpringTemplateEngine;
import org.thymeleaf.spring3.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@Configuration
@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter
{

    @Bean   
    public ServletContextTemplateResolver templateResolver() 
    {
        ServletContextTemplateResolver resolver = new ServletContextTemplateResolver();
        
        resolver.setPrefix( "/views/" );
        resolver.setSuffix( ".html" );
        resolver.setTemplateMode( "LEGACYHTML5" );
        resolver.setCacheable( false );
        
        return resolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() 
    {
        Set<IDialect> dialects = new HashSet<IDialect>();
        dialects.add(new LayoutDialect());

        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver(templateResolver());
        engine.setAdditionalDialects( dialects );
        return engine;
    }

    @Bean
    public ThymeleafViewResolver viewResolver() 
    {
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setTemplateEngine(templateEngine());
        resolver.setOrder(1);
        resolver.setViewNames(new String[]{ "*", "js/*", "template/*" });
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
