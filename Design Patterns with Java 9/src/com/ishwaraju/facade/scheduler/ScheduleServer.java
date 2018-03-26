package com.ishwaraju.facade.scheduler;

public class ScheduleServer {
	public void startBooting() {
		System.out.println("System started booting..");
	}

	public void readSystemConfigFile() {
		System.out.println("Reading configuration property from the file.");
	}

	public void init() {
		System.out.println("Initializing the system..");
	}

	public void intializeContext() {
		System.out.println("Initializing the context..");
	}

	public void initializeListener() {
		System.out.println("Initilaing the listeners..");

	}

	public void createSystemObject() {
		System.out.println("Creating the system objects..");
	}

	public void releaseProcess() {
		System.out.println("Realeasing the proecess..");
	}

	public void destroy() {
		System.out.println("Calling destroy function..");
	}

	public void destroySystemObejcts() {
		System.out.println("Destroying the System objects..");
	}

	public void destroyListeners() {
		System.out.println("Destroy the Listeners..");
	}

	public void destroyContext() {
		System.out.println("Destroying the conexr..");
	}

	public void shutdown() {
		System.out.println("Shutting down the system..");
	}
}
