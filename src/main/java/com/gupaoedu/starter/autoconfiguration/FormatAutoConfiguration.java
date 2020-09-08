package com.gupaoedu.starter.autoconfiguration;

import com.gupaoedu.starter.format.FormatProcessor;
import com.gupaoedu.starter.format.JsonFormatProcessor;
import com.gupaoedu.starter.format.StringFormatProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author : lipu
 * @since : 2020-09-08 21:13
 */
@Configuration
public class FormatAutoConfiguration {


    /**
     * 没有注册这个
     */
    @ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
    @Bean
    @Primary
    public FormatProcessor stringFormat(){
        return new StringFormatProcessor();
    }

    /**
     * 有注册这个
     */
    @ConditionalOnClass(name = "com.alibaba.fastjson.JSON")
    @Bean
    public FormatProcessor jsonFormat(){
        return new JsonFormatProcessor();
    }
}
