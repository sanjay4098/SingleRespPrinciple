package com.myCoolApp.reminderApp;

import java.io.IOException;
import java.time.LocalDateTime;

public class App {

	public static void main(String[] args) throws IOException {

		Reminder cricketReminder = new Reminder(1, "play cricket", LocalDateTime.of(2023,4,12,1, 0 ));
		Reminder sleepReminder = new Reminder(2, "sleep", LocalDateTime.of(2023,1,12,10, 05 ));
		
		/*
		 * Reminder.addReminder(cricketReminder); Reminder.addReminder(sleepReminder);
		 * Reminder.printReminders(); Reminder.removeReminder(1);
		 * Reminder.printReminders();
		 */
		Reminder.saveReminder(sleepReminder);
		System.out.println("git Test1");
		System.out.println("git Test2");

	}

}
