package com.example.demo_employee_boot.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien {
		@Id
//		@Column(name = "MaNV")
		private String MaNV;
		@Column(name = "Ten")
		private String ten;
		@Column(name = "Luong")
		private int  luong;
		@OneToMany(mappedBy = "MaNV")
		private List<ChungNhan> chungNhan;
}
