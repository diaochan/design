package com.journaldev.design.command;

public class WindowsFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		// TODO Auto-generated method stub
		System.out.println("Opening file in Windows OS");
	}

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub
		System.out.println("Writing file in Windows OS");
	}

	@Override
	public void closeFile() {
		// TODO Auto-generated method stub
		System.out.println("Closing file in Windows OS");
	}

}
