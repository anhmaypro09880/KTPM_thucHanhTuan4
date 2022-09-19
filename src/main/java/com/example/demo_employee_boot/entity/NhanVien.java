package com.example.demo_employee_boot.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
//		@OneToMany(mappedBy = "MaNV")
		@ManyToMany
		@JoinTable(name="chuyenbay",
			 joinColumns=@JoinColumn(name="MaNV"),
			 inverseJoinColumns=@JoinColumn(name="MaCB")
		)
		private List<MayBay> mayBays;
}
