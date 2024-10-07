package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.dto.Demodto;
import com.demo.entity.Demo;
import com.demo.service.DemoService;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Controller
public class DemoController {
	   @Autowired
		private DemoService demoService;
		

		 //http://localhost:8080/view
		@RequestMapping("/view")
		public String ViewCreateDemoForm() {
			return "create_demo";
				}

		@RequestMapping("/saveDemo")
		public String saveDemo(Demodto demoDto, Model model) {
			
			Demo demo = new Demo();
		
			demo.setFirstName(demoDto.getFirstName());
			demo.setLastName(demoDto.getLastName());
			demo.setEmail(demoDto.getEmail());
			demo.setMobile(demoDto.getMobile());
			
     demoService.saveDemo(demo);
	
	model.addAttribute("msg","Demo is saved!!");
			return "create_demo";
	}
		@RequestMapping("/listall")
		public String getAllDemos(Model model) {
		List<Demo>demos=demoService.getAllDemos();
		model.addAttribute("demos", demos);
		return "list_demos";
		}
		@RequestMapping("/delete")
		public String deleteDemo(@RequestParam("id") long id, ModelMap model) {
			demoService.deleteDemo(id);
			List<Demo> demos= demoService.getAllDemos();
			model.addAttribute("demos", demos);

			return "list_demos";
			
		}
		@RequestMapping("/update")
		public String updateDemo(@RequestParam("id") long id, ModelMap model) {
		Demo demo = demoService.findDemo(id);
		model.addAttribute("demo", demo);

			return "update_demo";
			
		}	
		@RequestMapping("/updateDemo")
		public String updateDemoInformation(Demodto demoDto, Model model) {
			demoService.updateDemo(demoDto);
			List<Demo>demos=demoService.getAllDemos();
			model.addAttribute("demos", demos);
			return "list_demos";
		}
	}

