package com.cignex.rahul;

public class FileData {

	private String fileContent;
	private String fileName;

	public FileData() {
	}

	public FileData(String fileContent, String fileName) {
		super();
		this.fileContent = fileContent;
		this.fileName = fileName;
	}

	public String getFileContent() {
		return fileContent;
	}

	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
