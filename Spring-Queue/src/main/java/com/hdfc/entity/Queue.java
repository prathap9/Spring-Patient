package com.hdfc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Entity
@Table(name ="queue")
public class Queue {

	@Id
	private int queueID;
	private int appointmentID;
	private int queueNumber;
	private String queueStatus;

}
