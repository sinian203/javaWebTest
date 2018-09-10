package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@EnableAutoConfiguration
@SpringBootApplication
@EnableScheduling
public class MainAPP {

	public static void main(String[] args) {
		SpringApplication.run(MainAPP.class, args);
	}

	@Bean
    public HttpMessageConverters fastJsonHttpMessageConverters(){
    	FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
		
		FastJsonConfig config = new FastJsonConfig();
		config.setSerializerFeatures(SerializerFeature.PrettyFormat);
		
		converter.setFastJsonConfig(config);
		HttpMessageConverter<?> converters = converter;
		
		return new HttpMessageConverters(converters);
		
    }
	
}
