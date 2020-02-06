package se.fredf.app.configuration

import com.google.common.base.Predicates
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class SwaggerConfiguration {

    @Bean
    fun customDocket(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.any())
            .paths(Predicates.not(PathSelectors.regex("/error.*")))
            .build()
            .apiInfo(metadata())
    }

    @Bean
    fun metadata(): ApiInfo {
        return ApiInfoBuilder()
            .title("TODO-PoC")
            .description("Documentation of the REST API")
            .version("0.0.1")
            .build()

    }

}