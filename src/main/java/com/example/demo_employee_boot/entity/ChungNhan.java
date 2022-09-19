package com.example.demo_employee_boot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "chungnhan")
public class ChungNhan {
		@Id
		@ManyToOne
		private NhanVien MaNV;
		@Id
		@ManyToOne
		private MayBay MaMB;
}
