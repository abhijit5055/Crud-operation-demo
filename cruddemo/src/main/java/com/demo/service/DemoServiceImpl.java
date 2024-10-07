package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.demo.dto.Demodto;
import com.demo.entity.Demo;
import com.demo.repository.DemoRepository;


@Service
public class DemoServiceImpl implements DemoService {
	@Autowired
	private DemoRepository demoRepo;


	@Override
	public void saveDemo(@ModelAttribute Demo demo) {
		demoRepo.save(demo);

	}


	@Override
	public List<Demo> getAllDemos() {
		List<Demo> leads = demoRepo.findAll();
		return leads;
	}


	@Override
	public void deleteDemo(long id) {
		demoRepo.deleteById(id);
		
	}


	@Override
	public Demo findDemo(long id) {
		Demo demo = demoRepo.findById(id).get();
		return demo;
	}
	@Override
	public void updateDemo(Demodto demoDto) {
		Demo demo = new Demo();
		demo.setId(demoDto.getId());
		demo.setFirstName(demoDto.getFirstName());
		demo.setLastName(demoDto.getLastName());
		demo.setEmail(demoDto.getEmail());
		demo.setMobile(demoDto.getMobile());
		demoRepo.save(demo);
	}


	
		
	}

