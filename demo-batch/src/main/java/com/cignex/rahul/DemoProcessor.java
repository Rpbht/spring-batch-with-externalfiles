package com.cignex.rahul;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.core.io.Resource;
import org.springframework.scheduling.annotation.AsyncResult;

public class DemoProcessor implements ItemProcessor<Resource, Future<FileData>> {

	private String inputDirectory;
	private static final String PREFIX = "'/>";
	public static final Pattern TAG_REGEX = Pattern.compile("<(.*?) V='(.*?)'");

	public String getInputDirectory() {
		return inputDirectory;
	}

	public void setInputDirectory(String inputDirectory) {
		this.inputDirectory = inputDirectory;
	}

	public Future<FileData> process(Resource item) throws Exception {
		
		System.out.println("File name from Processor==> " + item.getFilename());
		String content = new String(Files.readAllBytes(Paths.get(item.getFile().getPath())),
				StandardCharsets.ISO_8859_1);

		final HashMap<String, String> tagValues = new HashMap<String, String>();
		List<HashMap<String, String>> dataList = new ArrayList<HashMap<String, String>>();
		final Matcher matcher = TAG_REGEX.matcher(content);
		FileData data = new FileData(content, item.getFilename());
		while (matcher.find()) {
			if (!matcher.group(1).startsWith(PREFIX)) {
				tagValues.put(matcher.group(1), matcher.group(2));
			}
			dataList.add(tagValues);
		}
		System.out.println(dataList);
		return new AsyncResult<FileData>(data);

	} 
	
}
