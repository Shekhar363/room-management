package com.room.managament.management;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Roommangement 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomno;
	private String guest;
	private String singleroom;
	private String doubleroom;
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public String getGuest() {
		return guest;
	}
	public void setGuest(String guest) {
		this.guest = guest;
	}
	public String getSingleroom() {
		return singleroom;
	}
	public void setSingleroom(String singleroom) {
		this.singleroom = singleroom;
	}
	public String getDoubleroom() {
		return doubleroom;
	}
	public void setDoubleroom(String doubleroom) {
		this.doubleroom = doubleroom;
	}
}
