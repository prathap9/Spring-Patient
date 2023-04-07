package com.hdfc.schedule.repository;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;


import org.springframework.stereotype.Repository;

import com.hdfc.schedule.entity.Schedule;



@Repository
public class ScheduleRepoImp  implements IScheduleRepo{
	
	private Connection conn;

	public ScheduleRepoImp() {

		this.conn = ScheduleRepoDBUtill.getDBConnection();

	}

	@Override
	public int addSchedule(Schedule schedule) {

		String insertQuery = "insert into schedule(scheduleId,doctorId,dayOfWeek,timeSlot,availability) values(?,?,?,?,?)";

		int count = 0;

		try {
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, schedule.getScheduleId());
			pstmt.setInt(2, schedule.getDoctorId());
			pstmt.setString(3,  schedule.getDayOfWeek());
            pstmt.setString(4,  schedule.getTimeSlot());
            pstmt.setString(5, schedule.getAvailability());       
            
			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return count;

	}

}
