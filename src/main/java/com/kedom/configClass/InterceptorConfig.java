package com.kedom.configClass;

import com.kedom.myInterceptor.ApiVisitInterceptor;
import com.kedom.myInterceptor.ErrorPageInterceptor;
import com.kedom.myInterceptor.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    private final TokenInterceptor tokenInterceptor;
    private final ApiVisitInterceptor apiVisitInterceptor;
    private final ErrorPageInterceptor errorPageInterceptor;



    public InterceptorConfig(TokenInterceptor tokenInterceptor, ApiVisitInterceptor apiVisitInterceptor, ErrorPageInterceptor errorPageInterceptor) {
        this.tokenInterceptor = tokenInterceptor;
        this.apiVisitInterceptor = apiVisitInterceptor;
        this.errorPageInterceptor = errorPageInterceptor;
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tokenInterceptor).addPathPatterns("/**").excludePathPatterns("/**.ico");
        registry.addInterceptor(apiVisitInterceptor).addPathPatterns("/**").excludePathPatterns("/**.ico");
        registry.addInterceptor(errorPageInterceptor).addPathPatterns("/**").excludePathPatterns("/**.ico");
    }

}
