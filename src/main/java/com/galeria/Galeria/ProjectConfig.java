/*
 * I am light in the darkness ,
 * 
 */
package com.galeria.Galeria;


import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration

public class ProjectConfig implements WebMvcConfigurer {

    @Bean
    public LocaleResolver localeResolver() {  // Metodo para saber idioma y localizacion del servidor y del usuario
        var slr = new SessionLocaleResolver();
        slr.setDefaultLocale(Locale.getDefault());//Para asignar el idioma por defecto en el servidor
        slr.setLocaleAttributeName("session.current.locale");//Para saber la ubicacion del browser del usuario
        slr.setTimeZoneAttributeName("session.current.timezone");
        return slr;

    }

}
