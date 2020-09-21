package bridgelabz.javasamples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 * CONFLICT INDUCED IN REMOTE
 */
public class App {
	private static final Logger LOG = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		String message = "Hello, World ";
		LOG.debug(message + "will be printed on Debug");
		LOG.info(message + "printed on info");
		LOG.warn(message + "printed on waarn");
		LOG.error(message + "printed on error");
		LOG.fatal(message + "printed on fatal");
		LOG.info("Appending string: {}.", message);
		System.out.println(message);
	}
}
