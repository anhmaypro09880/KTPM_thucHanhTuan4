package com.example.demo_employee_boot.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Primary;

@Entity
@Table(name = "chuyenbay")
public class ChuyenBay {
	@Id
	private String MaCB;
	private String GaDi;
	private String GaDen;
	private int DoDai;
	private Date GioDi;
	private Date GioDen;
	private int ChiPhi;

	public ChuyenBay(String maCB, String gaDi, String gaDen, int doDai, Date gioDi, Date gioDen, int chiPhi) {
		super();
		MaCB = maCB;
		GaDi = gaDi;
		GaDen = gaDen;
		DoDai = doDai;
		GioDi = gioDi;
		GioDen = gioDen;
		ChiPhi = chiPhi;
	}

	public String getMaCB() {
		return MaCB;
	}

	public void setMaCB(String maCB) {
		MaCB = maCB;
	}

	public String getGaDi() {
		return GaDi;
	}

	public void setGaDi(String gaDi) {
		GaDi = gaDi;
	}

	public String getGaDen() {
		return GaDen;
	}

	public void setGaDen(String gaDen) {
		GaDen = gaDen;
	}

	public int getDoDai() {
		return DoDai;
	}

	public void setDoDai(int doDai) {
		DoDai = doDai;
	}

	public Date getGioDi() {
		return GioDi;
	}

	public void setGioDi(Date gioDi) {
		GioDi = gioDi;
	}

	public Date getGioDen() {
		return GioDen;
	}

	public void setGioDen(Date gioDen) {
		GioDen = gioDen;
	}

	public int getChiPhi() {
		return ChiPhi;
	}

	public void setChiPhi(int chiPhi) {
		ChiPhi = chiPhi;
	}

}
