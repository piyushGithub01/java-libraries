package com.pi.mobile.basic;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.contentOf;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import com.pi.mobile.MobileQualityChecks;

public class FileReaderTest {
	
	@Test
	public void qualityCheckPrint() throws IOException {
		final MobileQualityChecks checker = new MobileQualityChecks();
		checker.qualityChecks();
		
		final File file = new File("quality_check.txt");
		
		assertThat(file).exists().isFile().isRelative();
		assertThat(contentOf(file))
		.contains("Device checked")
		.contains("Accessorires checked")
		.contains("Packaging checked");
	}

}
