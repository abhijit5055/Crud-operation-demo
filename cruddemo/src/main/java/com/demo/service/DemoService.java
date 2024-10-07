package com.demo.service;

import java.util.List;

import com.demo.dto.Demodto;
import com.demo.entity.Demo;



public interface DemoService {
	   public void saveDemo(Demo Demo);

	   public List<Demo> getAllDemos();

	   public void deleteDemo(long id);

	   public Demo findDemo(long id);

	   public void updateDemo(Demodto demoDto) ;
	   	


}
