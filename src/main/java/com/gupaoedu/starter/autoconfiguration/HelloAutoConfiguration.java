package com.gupaoedu.starter.autoconfiguration;

import com.gupaoedu.starter.HelloFormatTemplate;
import com.gupaoedu.starter.format.FormatProcessor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : lipu
 * @since : 2020-09-08 21:18
 */
@Import(FormatAutoConfiguration.class)
@EnableConfigurationProperties(HelloProperties.class)
@Configuration
public class HelloAutoConfiguration {



    @Bean
    public HelloFormatTemplate helloFormatTemplate(FormatProcessor formatProcessor,HelloProperties helloProperties){
        return new HelloFormatTemplate(formatProcessor,helloProperties);
    }
}
