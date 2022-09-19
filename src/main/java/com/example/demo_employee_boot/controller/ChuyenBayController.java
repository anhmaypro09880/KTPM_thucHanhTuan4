package com.example.demo_employee_boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_employee_boot.entity.ChuyenBay;
import com.example.demo_employee_boot.service.ChuyenBayService;

@RestController
@RequestMapping("/api")
public class ChuyenBayController {
		@Autowired
		private ChuyenBayService cbService;
		
		@GetMapping("/chuyenbay")
		public List<ChuyenBay> getAllChuyenBay(){
			return cbService.findAll();
		}
}
