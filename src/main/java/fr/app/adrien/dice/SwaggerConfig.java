package fr.app.adrien.dice;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI api() {
        return new OpenAPI()
                .info(new Info().title("DiceRoll API")
                        .description("API for Dice Roll Game")
                        .version("1.0")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new io.swagger.v3.oas.models.ExternalDocumentation()
                        .description("DiceRoll documentation")
                        .url("https://github.com/Master1-MIAGE-UCA/oil-td-spring-Thewhyap.git"));
    }
}