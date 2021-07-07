package com.allanco.restconsumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allanco.restconsumer.dto.Request;
import com.allanco.restconsumer.dto.Response;
import com.allanco.restconsumer.service.IMainService;

@RestController
public class MainController {	
	
	@Autowired
	IMainService service;
	
	private final Logger log = LoggerFactory.getLogger(MainController.class);
	
	@PostMapping("/restructured")
	public Response restructured(){
	
		Response response = new Response();		
		Request request = service.getRequest();		
		
		try {
			
			if(request != null) 
			{
				int dataSize = request.getData().size();
				if( dataSize > 0) {
					String[] restructuredData = new String[dataSize];					
					StringBuilder data = new StringBuilder("");
					for(int i = 0; i < dataSize ; i++) {
						data.setLength(0);
						data.append("<");
						data.append(request.getData().get(i).getId());
						data.append(">|<");
						data.append(request.getData().get(i).getLast_name());
						data.append(">|<");
						data.append(request.getData().get(i).getEmail());
						data.append(">");						
						restructuredData[i] = data.toString();
					}
					response.setData(restructuredData);
				}			
			}
			
		} catch (Exception e) {
			log.error(e.getMessage());
		}		
		return response;		
	}	
}
