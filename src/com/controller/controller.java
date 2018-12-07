package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DataPegawai.DataPegawai;
import com.Manipulasi.Manipulasi;

/**
 * Servlet implementation class controller
 */
@WebServlet("/controller")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @author zulkarnaen
	 */
	
	public controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @author zulkarnaen
	 */
	
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
			response.sendRedirect("controller");
		} else {
			out.print("Kesalahan di Fungsi Menyimpan data. Check Manipulasi");
		}
	}

	/**
	 * @author zulkarnaen
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Manipulasi manipulasi = new Manipulasi();
		List<DataPegawai> dataPegawai = manipulasi.getDataPegawai();
		
		//attribute user1 untuk mendapatkan list pada index.jsp
		request.setAttribute("users1", dataPegawai);
		

		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @author zulkarnaen
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		proses(request, response);
		
	}

}
