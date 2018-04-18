package com.cignex.rahul;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import org.springframework.batch.item.ItemWriter;

public class DemoWriter implements ItemWriter<FileData> {

	private String inputDirectory;

	public DemoWriter() {
		super();
	}

	public DemoWriter(String inputDirectory) {
		super();
		this.inputDirectory = inputDirectory;
	}

	public String getInputDirectory() {
		return inputDirectory;
	}

	public void setInputDirectory(String inputDirectory) {
		this.inputDirectory = inputDirectory;
	}

	public void write(List<? extends FileData> items) throws Exception {

		for (FileData fileData : items) {
			String fileName = fileData.getFileName();
			Path movefrom = FileSystems.getDefault().getPath("D:/LTR/input/" + fileName);
			Path target = FileSystems.getDefault().getPath("D:/LTR/demo/" + fileName);
			Files.move(movefrom, target, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File name from Writer==> " + fileName);
		}

	}

}
