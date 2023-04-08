package com.hdfc.schedule.repository;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Schedule> getallSchedule() {

		List<Schedule> list = new ArrayList<Schedule>();

		try {
			Statement stmt = conn.createStatement();

			String query = "select scheduleId,doctorId,dayOfWeek,timeSlot,availability from schedule";

			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {

				Schedule schedule = new Schedule();

				schedule.setScheduleId(rs.getInt("scheduleId"));
				schedule.setDoctorId(rs.getInt("doctorId"));
				schedule.setDayOfWeek(rs.getString("dayOfWeek"));
				schedule.setTimeSlot(rs.getString("timeSlot"));
				schedule.setAvailability(rs.getString("availability"));
				

				list.add(schedule);

			}

		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return list;

	}
	
	@Override
	public int updateSchedule(Schedule schedule) {
		String updateQuery = "update  schedule  set scheduleId = ? , DoctorId = ? ,  dayOfweek = ?, timeSlot =? where availability =?";

		int count = 0;

		try {
			PreparedStatement pstmt = conn.prepareStatement(updateQuery);

			pstmt.setInt(1, schedule.getScheduleId());
			pstmt.setInt(2, schedule.getDoctorId());
			pstmt.setString(3, schedule.getDayOfWeek());
			pstmt.setString(4,schedule.getTimeSlot());
			pstmt.setString(5,schedule.getAvailability());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return count;
	}

}
