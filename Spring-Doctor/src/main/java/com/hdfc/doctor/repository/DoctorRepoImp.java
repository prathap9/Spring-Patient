package com.hdfc.doctor.repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hdfc.doctor.entity.Doctor;





@Repository
public class DoctorRepoImp implements IDoctorRepo{
	private Connection conn;

	public DoctorRepoImp() {

		this.conn = DoctorRepoDBUtill.getDBConnection();

	}

	@Override
	public int addDoctor(Doctor doctor) {

		String insertQuery = "insert into doctor(doctorId,firstName,lastName,contactDetails,specialization) values(?,?,?,?,?)";

		int count = 0;

		try {
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, doctor.getDoctorId());
			pstmt.setString(2, doctor.getFirstName());
			pstmt.setString(3, doctor.getLastName());
            pstmt.setLong(4, doctor.getContactDetails());
            pstmt.setString(5, doctor.getSpecialization());
           
            
			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return count;
}
	@Override
	public List<Doctor> getAllDoctors() {

		List<Doctor> list = new ArrayList<Doctor>();

		try {
			Statement stmt = conn.createStatement();

			String query = "select doctorId,firstName,lastName,contactDetails,specialization from doctor";

			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {

				Doctor doctor = new Doctor();

				doctor.setDoctorId(rs.getInt("doctorId"));
				doctor.setFirstName(rs.getString("firstName"));
				doctor.setLastName(rs.getString("lastName"));
				doctor.setContactDetails(rs.getLong("contactDetails"));
				doctor.setSpecialization(rs.getString("specialization"));
				

				list.add(doctor);

			}

		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return list;

	}
	
	@Override
	public int updateDoctor(Doctor doctor) {
		String updateQuery = "update  doctor  set doctorId = ? , firstName = ? ,  lastName = ?, contactDetails =? where specialization =?";

		int count = 0;

		try {
			PreparedStatement pstmt = conn.prepareStatement(updateQuery);

			pstmt.setInt(1, doctor.getDoctorId());
			pstmt.setString(2, doctor.getFirstName());
			pstmt.setString(3, doctor.getLastName());
			pstmt.setLong(4,doctor.getContactDetails());
			pstmt.setString(5,doctor.getSpecialization());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public int deleteDoctorById(int doctorId) {
		String deleteOne = "delete from doctor where doctorId =?";

		int count = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(deleteOne);

			pstmt.setInt(1, doctorId);

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return count;
	}

	
	
}
