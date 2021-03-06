package br.com.abware.jcondo.persistence.entity;

import br.com.abware.jcondo.booking.model.BookingStatus;

import java.sql.Time;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the rb_booking database table.
 * 
 */
@Entity
@Table(name="rb_booking")
public class Booking extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BookingPK id;

	private Time endTime;

	private Time startTime;
	
	private double price;

	@Enumerated(EnumType.ORDINAL)
	private BookingStatus status;

	@ManyToOne
	@JoinColumn(name="roomId", insertable=false, updatable=false)
	private Room room;

	private long userId;

	public Booking() {
		this.status = BookingStatus.OPENED;
		
//		String[] parsePatterns = new String[] {"HH:mm:ss"};
//		try {
//			this.startTime = new Time(DateUtils.parseDate("10:00:00", parsePatterns).getTime());
//			this.endTime = new Time(DateUtils.parseDate("22:00:00", parsePatterns).getTime());
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	public Booking(int roomId, Date date, long userId) {
		this();
		this.id = new BookingPK(roomId, date);
		this.userId = userId;
	}	

	public BookingPK getId() {
		return this.id;
	}

	public void setId(BookingPK id) {
		this.id = id;
	}

	public Time getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public Time getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public BookingStatus getStatus() {
		return this.status;
	}

	public void setStatus(BookingStatus status) {
		this.status = status;
	}

	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUser(long userId) {
		this.userId = userId;
	}

	public Date getDate() {
		return id.getDate();	
	}
	
	public void setDate(Date date) {
		this.id.setDate(date);
	}
}