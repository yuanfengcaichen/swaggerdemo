package club.codeqi.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author codeqi
 * @version 1.0
 * @date 2021/1/18 0018 23:01
 */
@Configuration
public class Swagger2Config {
    @Bean
    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("swaggerdemo接口文档（标题）")
                .contact(new Contact("codeqi", null, null))
                .description("swaggerdemo接口文档（说明）")
                .version("1.0")
                .build();
    }
}
