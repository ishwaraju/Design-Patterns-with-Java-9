package com.ishwaraju.facade.scheduler;

public class TestFacadePattern {
	public static void main(String[] args) {
		ScheduleServer scheduleServer = new ScheduleServer();
		ScheduleServerFacede facede = new ScheduleServerFacede(scheduleServer);
		facede.startSever();
		System.out.println("System got started Sucessfully....");
		facede.stopServer();
		System.out.println("System got shutdown Sucessfully.....");
	}
}
