package xyz.sdworld.common.util;

public class CommonUtil {

	public static long startTime;

	public static void exampleStart() {
		startTime = System.currentTimeMillis();
	}

	public static void sleep(int mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
