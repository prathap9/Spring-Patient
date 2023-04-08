package com.hdfc.appointment.vo;

import com.hdfc.appointment.entity.Queue;

public class QueueAppointment {
	
	private Queue queue;
	private Appointment appointments;
	
	public QueueAppointment() {
		super();
		
	}

	public QueueAppointment(Queue queue, Appointment appointments) {
		super();
		this.queue = queue;
		this.appointments = appointments;
	}

	public Queue getQueue() {
		return queue;
	}

	public void setQueue(Queue queue) {
		this.queue = queue;
	}

	public Appointment getAppointments() {
		return appointments;
	}

	public void setAppointments(Appointment appointments) {
		this.appointments = appointments;
	}
	
	
	

}
