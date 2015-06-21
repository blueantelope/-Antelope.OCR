package com.antelope.ocr;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

public class OCR {
	private static final Logger log = Logger.getLogger(OCR.class);
	
	private static void init() throws IOException {
		PatternLayout layout = new PatternLayout("%d %-5p %c - %m%n");
		RollingFileAppender fileAppender = new RollingFileAppender(layout,"ocr.log");
		fileAppender.setMaximumFileSize(102400);
		fileAppender.setMaxBackupIndex(10);
		ConsoleAppender appender = new ConsoleAppender(layout);
		BasicConfigurator.configure(appender);
		Logger.getRootLogger().addAppender(fileAppender);
	}

	public static void main(String[] args) throws IOException {
		init();
		log.info("start ocr...");
	}
}
