<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Selamat Datang</title>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>



<body>
	<div
		style="background-color: maroon; border: 1px solid black; padding: 7px; width: auto;">
		<!-- Mempercantik Tampilan -->
		<marquee>
			<span style="color: white;"><c:forEach items="${requestScope.users1}" var="emp"> 
				<tr>
					<td><c:out value="${emp.nama}"></c:out></td>
					<td><c:out value="${emp.golongan}"></c:out></td>
					<td><c:out value="Rp. ${emp.gaji_perbulan}"></c:out></td>
					<td><c:out value="${emp.formattedTglMasuk}"></c:out>
					<td> -|- </td>
				</c:forEach></span>
		</marquee>
		<!-- Mempercantik Tampilan -->
		
	</div>

	<center>
		<h1>
			<font size="7" face="Georgia, Arial" color="maroon">M</font>asukan <font
				size="7" face="Georgia, Arial" color="maroon">D</font>ata
		</h1>
	</center>
	<hr />
	<form action="controller" method="POST">
		<center>
			<tr>
				<td><code> Nama Karyawan</code></td>
				<td><input type="text" name="Nama"> |</td>

				<td><code> Golongan</code></td>
				<td><input type="text" name="Golongan"> |</td>

				<td><code> Gaji Perbulan</code></td>
				<td><input type="text" name="Gaji Perbulan"> |</td>

				<td><input type="submit" value="kirim"></td>
			</tr>
		</center>
	</form>

	<br>

	<center>
		<table border="1" cellpadding="10" cellspacing="1">
			<thead>
				<tr>
					<th>Nama karyawan</th>
					<th>Golongan</th>
					<th>Gaji Perbulan</th>
					<th>Tanggal Masuk</th>
					<th>Option Section</th>
				</tr>
			</thead>

			<tbody>
				<h1>
					<font size='7' face='Georgia, Arial' color='maroon'>T</font>able <font
						size='7' face='Georgia, Arial' color='maroon'>D</font>ata
				</h1>
				<hr />
				</center>
				<br>
				<center>
					<c:forEach items="${requestScope.users1}" var="emp"> 
				<tr>
					<td><c:out value="${emp.nama}"></c:out></td>
					<td><c:out value="${emp.golongan}"></c:out></td>
					<td><c:out value="Rp. ${emp.gaji_perbulan}"></c:out></td>
					<td><c:out value="${emp.formattedTglMasuk}"></c:out>
					<td>- <a href='PerbaharuiData?ID=${emp.id}'>edit</a>| |
						<a href='HapusData?ID=${emp.id}'>Hapus</a> -</td>
				</c:forEach>
				</center>
		
			</tbody>
		</table>
	</center>

</body>
</html>