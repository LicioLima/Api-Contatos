package br.com.api.contatos.config;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;

public class WebConfiguration {

	@Configuration
	@EnableWebMvc
	public class WebConfiguration implements WebMvcConfigurer {

	    @Value("${application-version}")
	    private String appVersion;

	    @PostConstruct
	    void init() {
	        TimeZone.setDefault(TimeZone.getTimeZone(ZoneOffset.UTC));
	    }

	    @Bean
	    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
	        return new PropertySourcesPlaceholderConfigurer();
	    }

	    @Bean
	    public ModelResolver modelResolver(ObjectMapper objectMapper) {
	        return new ModelResolver(objectMapper);
	    }

	    @Bean
	    public OpenAPI customOpenAPI() {
	        return new OpenAPI().components(new Components())
	                .info(new Info().title("Product API").description(
	                        "API responsible for create itens, read (With Filters) itens, update itens, delete itens")
	                        .version(appVersion));
	    }

	    @Bean
	    public InternalResourceViewResolver defaultViewResolver() {
	        return new InternalResourceViewResolver();
	    }
	}
}
