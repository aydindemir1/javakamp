package coreLogging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("database e loglandı " + data);
		
	}

}
