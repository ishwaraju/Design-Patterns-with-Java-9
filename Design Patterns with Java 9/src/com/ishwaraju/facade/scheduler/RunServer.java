package com.ishwaraju.facade.scheduler;

public class RunServer {
	public static void main(String[] args) {
		ScheduleServer scheduleServer = new ScheduleServer();
		scheduleServer.startBooting();
		scheduleServer.readSystemConfigFile();
		scheduleServer.init();
		scheduleServer.intializeContext();
		scheduleServer.intializeContext();
		scheduleServer.createSystemObject();
		System.out.println("System started and it is up..");

		scheduleServer.releaseProcess();
		scheduleServer.destroyContext();
		scheduleServer.destroyListeners();
		scheduleServer.destroySystemObejcts();
		scheduleServer.shutdown();
		System.out.println("System shut down successfully..");

	}
}
