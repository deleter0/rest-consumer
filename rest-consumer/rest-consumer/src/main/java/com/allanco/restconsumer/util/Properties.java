package com.allanco.restconsumer.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:consumer.properties")
public class Properties {

	@Value(Constants.PROP_API_URL)
	public String apiUrl;
	
}
