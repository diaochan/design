package com.journaldev.design.command;

public class FileSystemClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
		OpenFileCommand openFileCommand = new OpenFileCommand(fs);
		FileInvoker file = new FileInvoker(openFileCommand);
		file.execute();
		WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
		file = new FileInvoker(writeFileCommand);
		file.execute();
		
		CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
		file = new FileInvoker(closeFileCommand);
		file.execute();
	}

}
