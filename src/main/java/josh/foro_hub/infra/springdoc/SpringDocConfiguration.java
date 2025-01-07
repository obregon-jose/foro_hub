package josh.foro_hub.infra.springdoc;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfiguration {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearer-key",
                                new SecurityScheme().type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")))
                .info(new Info()
                        .title("API Foro Hub")
                        .description("API Rest del Foro Hub.")
                        .contact(new Contact()
                                .name("Marysol Ariadna Tello")
                                .email("mail@mail.com")));
//                        .license(new License()
//                                .name("Apache 2.0")
//                                .url("http://foro.hub.challenge/api/licencia")));
    }
}
