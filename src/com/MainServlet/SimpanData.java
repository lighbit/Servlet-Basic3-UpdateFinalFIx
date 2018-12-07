package com.MainServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DataPegawai.DataPegawai;
import com.Manipulasi.Manipulasi;

/**
 * @author zulkarnaen
 */

@WebServlet("/SimpanData")
public class SimpanData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @author zulkarnaen
	 */

	public SimpanData() {
		super();

	}

	protected void proses(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Ambil data dari form
		PrintWriter out = response.getWriter();
		DataPegawai ambildatapegawai = new DataPegawai();
		ambildatapegawai.setNama(request.getParameter("Nama"));
		ambildatapegawai.setGolongan(request.getParameter("Golongan"));
		ambildatapegawai.setGaji_perbulan(Integer.parseInt(request.getParameter("Gaji Perbulan")));
		
		// simpan data
		Manipulasi datamanipulasi = new Manipulasi();

		if (datamanipulasi.insertData(ambildatapegawai)) {
			response.sendRedirect("s");
		} else {
			out.print("Kesalahan di Fungsi Menyimpan data. Check Manipulasi");
		}
	}

	/**
	 * @author zulkarnaen
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		proses(request, response);
	}

	/**
	 * @author zulkarnaen
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		proses(request, response);
	}

}
