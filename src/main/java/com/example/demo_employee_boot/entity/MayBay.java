package com.example.demo_employee_boot.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
public class MayBay {
	@Id
	private int MaMB;
	private String Loai;
	@Column(name = "TamBay")
	private int tamBay;
	@ManyToMany(mappedBy = "mayBays")
	private List<NhanVien> nhanVien;

	

}
