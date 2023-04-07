package com.hdfc.patient.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.hdfc.patient.entity.Patient;



@Repository
public class RepoPatientImp implements IRepo{
	
	private Connection conn;

	public RepoPatientImp() {

		this.conn = RepoPatientDBUtill.getDBConnection();

	}

	@Override
	public int addPatient(Patient patient) {

		String insertQuery = "insert into patient(patientId,firstName,lastName,contactDetails,medicalHistory,insuranceDetails) values(?,?,?,?,?,?)";

		int count = 0;

		try {
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, patient.getPatientId());
			pstmt.setString(2, patient.getFirstName());
			pstmt.setString(3, patient.getLastName());
            pstmt.setDouble(4, patient.getContactDetails());
            pstmt.setString(5, patient.getMedicalHistory());
            pstmt.setString(6, patient.getInsuranceDetails());
            
			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return count;

	}

}
