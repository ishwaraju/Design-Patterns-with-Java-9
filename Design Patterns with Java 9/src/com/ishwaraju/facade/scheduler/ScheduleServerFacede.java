package com.ishwaraju.facade.scheduler;

public class ScheduleServerFacede {
	private final ScheduleServer scheduleServer;

	public ScheduleServerFacede(ScheduleServer scheduleServer) {
		this.scheduleServer = scheduleServer;
	}

	public void startSever() {
		scheduleServer.startBooting();
		scheduleServer.readSystemConfigFile();
		scheduleServer.init();
		scheduleServer.intializeContext();
		scheduleServer.intializeContext();
		scheduleServer.createSystemObject();
	}

	public void stopServer() {
		scheduleServer.releaseProcess();
		scheduleServer.destroyContext();
		scheduleServer.destroyListeners();
		scheduleServer.destroySystemObejcts();
		scheduleServer.shutdown();
	}
}
