package com.hdfc.doctor.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
