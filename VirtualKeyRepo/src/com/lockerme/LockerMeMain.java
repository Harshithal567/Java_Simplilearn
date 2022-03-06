package com.lockerme;

public class LockerMeMain {

	public static void main(String[] args) {

		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");

		MenuOptions.printWelcomeScreen("Lockers Pvt Ltd", "Harshitha L");

		HandleOptions.handleWelcomeScreenInput();

	}

}
