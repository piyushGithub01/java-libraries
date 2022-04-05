package com.pi.mobile;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MobileQualityChecks {
	
	public void qualityChecks() throws IOException {
		final Path path = Paths.get("quality_check.txt");
		
		try(BufferedWriter writer = Files.newBufferedWriter(path)) {
			writer.write("Device checked");
			writer.newLine();
			writer.write("Accessorires checked");
			writer.newLine();
			writer.write("Packaging checked");
			writer.newLine();
		}
	}

}
