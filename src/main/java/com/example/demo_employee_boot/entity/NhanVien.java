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
	private int luong;
//		@OneToMany(mappedBy = "MaNV")
	@ManyToMany
	@JoinTable(name = "chuyenbay", joinColumns = @JoinColumn(name = "MaNV"), inverseJoinColumns = @JoinColumn(name = "MaCB"))
	private List<MayBay> mayBays;

	public NhanVien(String maNV, String ten, int luong, List<MayBay> mayBays) {
		super();
		MaNV = maNV;
		this.ten = ten;
		this.luong = luong;
		this.mayBays = mayBays;
	}

	public String getMaNV() {
		return MaNV;
	}

	public void setMaNV(String maNV) {
		MaNV = maNV;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}

	public List<MayBay> getMayBays() {
		return mayBays;
	}

	public void setMayBays(List<MayBay> mayBays) {
		this.mayBays = mayBays;
	}

}
