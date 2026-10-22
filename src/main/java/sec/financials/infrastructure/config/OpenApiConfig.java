package sec.financials.infrastructure.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("SEC Fund & benchmark Analytics API")
                        .version("1.0.0")
                        .description("REST API supporting mutual fund research, N-PORT holdings, and model portfolios"));
    }
}