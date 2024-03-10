package com.gl.springboot.entiry;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Ticker_Tracker")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int slNo;
	
	@Column(name="Ticket_Title")
	private String ticketTitle;
	
	@Column(name="Ticket_Short_Description")
	private String description;
	
	@Column(name="Created_On")
	@jakarta.persistence.Temporal(TemporalType.DATE)
	@CreationTimestamp
	@LastModifiedDate
	private Date createdOn;
	
	@Column(name="Content")
	private String content;
	
}
