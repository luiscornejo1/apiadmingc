package com.rosettcompany.grupoCiencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication(scanBasePackages = { "com.rosettcompany.grupoCiencia" })
public class GrupoCienciaApplication extends org.springframework.boot.web.servlet.support.SpringBootServletInitializer
{
    public static void main( String[] args )
    {
    	SpringApplication.run(GrupoCienciaApplication.class, args);
    }
    
    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(GrupoCienciaApplication.class);
	}	
}
