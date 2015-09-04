package com.library.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="RESERVE")
@NamedQuery(name = "Reserve.findAll", query = "select o from Reserve o")
@XmlRootElement
public class Reserve {
	
	@Id
	@Column(name="ID_RESERVE")	
	@GeneratedValue(strategy = SEQUENCE, generator = "RESERVE_GENERATOR")
	@SequenceGenerator(name = "RESERVE_GENERATOR", sequenceName = "SEQ_RESERVE", allocationSize = 1)
	private int id;
	
	@Column(name="BOOK_TITLE", nullable=false)
	private String bookTitle;
	
	@Column(name="USERNAME", nullable=false)
	private String username;
	
	@Column(name="PICKUP_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date pickUpDate;
	
	@Column(name="DELIVERY_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date deliveryDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getPickUpDate() {
		return pickUpDate;
	}
	public void setPickUpDate(Date pickUpDate) {
		this.pickUpDate = pickUpDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}	

}