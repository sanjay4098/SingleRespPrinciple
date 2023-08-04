package com.myCoolApp.reminderApp;

import java.io.IOException;
import java.io.PrintStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reminder implements Serializable{


	private int reminderId;
	private String note;
	private LocalDateTime time;

	static List<Reminder> myRemiderList=new ArrayList<Reminder>();

	public Reminder() {}


	public Reminder(int reminderId, String note, LocalDateTime time) {
		this.reminderId = reminderId;
		this.note = note;
		this.time = time;

	}


	public static void addReminder(Reminder reminder)
	{
		myRemiderList.add(reminder);

	}

	public static void removeReminder(int reminderNo)
	{
		myRemiderList.remove(reminderNo);

	}

	public static void printReminders() {

		myRemiderList.forEach(e->System.out.println(e));
	}
	
	
	public static void saveReminder(Reminder reminder) throws IOException {
		
		String filepath ="/home/sanjay/data/note";
		PrintStream output = new PrintStream(filepath);
		output.print(reminder);
	}

	public int getReminderId() {
		return reminderId;
	}
	public void setReminderId(int reminderId) {
		this.reminderId = reminderId;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}


	@Override
	public String toString() {
		return "Reminder [reminderId=" + reminderId + ", note=" + note + ", time=" + time + "]";
	}



}
