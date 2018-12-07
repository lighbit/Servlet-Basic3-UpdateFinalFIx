package com.DataPegawai;

import java.util.Date;

public class DataPegawai {

	private int id;
	private String nama;
	private String golongan;
	private int gaji_perbulan;
	public Date tanggal_masuk;

	private String formattedTglMasuk;// TODO CONVERT TANGGAL_MASUK --> STRING

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getGolongan() {
		return golongan;
	}

	public void setGolongan(String golongan) {
		this.golongan = golongan;
	}

	public int getGaji_perbulan() {
		return gaji_perbulan;
	}

	public void setGaji_perbulan(int gaji_perbulan) {
		this.gaji_perbulan = gaji_perbulan;
	}

	public Date getTanggal_masuk() {
		return tanggal_masuk;
	}

	public void setTanggal_masuk(Date tanggal_masuk) {
		this.tanggal_masuk = tanggal_masuk;
	}

	public String getFormattedTglMasuk() {
		return formattedTglMasuk;
	}

	public void setFormattedTglMasuk(String formattedTglMasuk) {
		this.formattedTglMasuk = formattedTglMasuk;
	}

}
