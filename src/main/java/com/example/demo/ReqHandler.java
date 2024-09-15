package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/req")
public class ReqHandler {
	
	@Autowired
	private DataHandlerRepository dataHandlerRepository;
	
	@GetMapping("/shows")
	
	public List<DataHandler> getalldata(){
		return dataHandlerRepository.findAll();
	}	
	
	public void printAllData() {
	    List<DataHandler> dataList = getalldata();
	    for (DataHandler data : dataList) {
	        System.out.println(data);
	    }
	}

	
	

}
