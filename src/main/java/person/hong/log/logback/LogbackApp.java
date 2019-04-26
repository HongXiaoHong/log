package person.hong.log.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackApp {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(LogbackApp.class);
		logger.error("这是一个log back HELLO LOG BACK");
	}

}
