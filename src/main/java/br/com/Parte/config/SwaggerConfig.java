package br.com.Parte.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI Contato(){
        return new OpenAPI().info(new Info()
                .title("Contato")
                .description("Api para buscar cep")
                .version("1.0.0")
                .license(new License().name("Sistema de busca de cep").url(""))
        );
    }
    // --> http://localhost:8090/swagger-ui/index.html
    // http://localhost:8080/swagger-ui.html
}
