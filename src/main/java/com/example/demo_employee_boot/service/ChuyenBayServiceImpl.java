package com.example.demo_employee_boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_employee_boot.dao.ChuyenBayRepository;
import com.example.demo_employee_boot.entity.ChuyenBay;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService {
	@Autowired 
	private ChuyenBayRepository cbDao;
	@Override
	public List<ChuyenBay> findAll() {
		// TODO Auto-generated method stub
		return cbDao.findAll();
	}
		
}
