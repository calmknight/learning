package com.matholic.learning.config;

import com.google.common.collect.Lists;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfig {
    @Bean
    public Mapper mapper() {
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.setMappingFiles(Lists.newArrayList("dozerJdk8Converters.xml"));

        return mapper;
    }

    @Bean
    RestTemplate restTemplate() {
//        CloseableHttpClient httpClient
//            = HttpClients.custom()
//            .setSSLHostnameVerifier(new NoopHostnameVerifier())
//            .build();
//        HttpComponentsClientHttpRequestFactory requestFactory
//            = new HttpComponentsClientHttpRequestFactory();
//        requestFactory.setHttpClient(httpClient);

        return new RestTemplate();
    }

//    @Bean
//    public HandlerExceptionResolver sentryExceptionResolver() {
//        return new io.sentry.spring.SentryExceptionResolver();
//    }
}
