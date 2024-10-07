package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Demo;
import com.demo.repository.DemoRepository;

@RestController
@RequestMapping("/api")
public class DemoRestcontroller {
	 @Autowired
		private DemoRepository demoRepo;
		
		//http://localhost:8080/api
	    @GetMapping
	    public List<Demo> getDemos(){
	    	List<Demo> demos = demoRepo.findAll();
	    	return demos;
	    }
	    @PostMapping
	    public void saveDemo(@RequestBody Demo demo) {
	    	demoRepo.save(demo);
	    }
	    @PutMapping
	    public void updateDemo(@RequestBody Demo demo) {
	    	demoRepo.save(demo);
	    }
	    //http://localhost:8080/api/7
	    @DeleteMapping("/{id}")
	    public void deleteDemo(@PathVariable("id") long id) {
	    	demoRepo.deleteById(id);
		
	    }
	}



