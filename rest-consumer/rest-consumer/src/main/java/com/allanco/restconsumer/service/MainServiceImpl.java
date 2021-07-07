package com.allanco.restconsumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.allanco.restconsumer.dto.Request;
import com.allanco.restconsumer.util.Constants;

@Service
public class MainServiceImpl implements IMainService{

	private final Logger log = LoggerFactory.getLogger(MainServiceImpl.class);
	
	@Autowired
	RestTemplate restTemplate;		
	
	@Autowired
	private Environment environment;
	
	@Override
	public Request getRequest() {
		
		Request request = null;
		
		try {
			
			String url = environment.getProperty(Constants.PROP_API_URL);
			ResponseEntity<Request> apiResponse = restTemplate.getForEntity(url, Request.class);
			
			if(apiResponse.getStatusCode() == HttpStatus.OK) 
			{
				if(apiResponse.getBody() != null)
				{
					request = apiResponse.getBody();
				}
				else
				{
					log.info("Consulta realizada con éxito pero sin contenido en su respuesta");
				}
			}
			else
			{
				log.info("No se recibió una respuesta correcta del servidor " + Constants.PROP_API_URL);
			}
			
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		
		return request;
		
	}

	
	
}
