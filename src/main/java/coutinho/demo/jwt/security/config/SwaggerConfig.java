package coutinho.demo.jwt.security.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class SwaggerConfig {
    @Bean
    public OpenAPI api() {
        return new OpenAPI()
                .info(new Info().title("JWT Security - Demo")
                        .description("Projeto com demonstração de uma API com recurso de segurança JWT")
                        .version("v1.0.0")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Projeto com demonstração de uma API com recurso de segurança JWT")
                        .url("https://springshop.wiki.github.org/docs"));
    }
}
