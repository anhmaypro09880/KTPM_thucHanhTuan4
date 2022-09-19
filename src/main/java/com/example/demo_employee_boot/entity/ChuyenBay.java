package com.example.demo_employee_boot.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Primary;

@Entity
@Table(name = "chuyenbay")
public class ChuyenBay {
	@Id
	private String MaCB;
	@Column(name = "GaDi")
	private String gaDi;
	@Column(name = "GaDen")
	private String gaDen;
	@Column(name = "DoDai")
	private int doDai;
	@Column(name = "GioDi")
	private Date gioDi;
	@Column(name = "GioDen")
	private Date gioDen;
	@Column(name = "ChiPhi")
	private int chiPhi;

	

}
