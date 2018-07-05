package xyz.sdworld.common.util;

public class Log {
	public static void it(Object obj) {
		long time = System.currentTimeMillis() - CommonUtil.startTime;
		System.out.println(Thread.currentThread().getName() + " | " + time + " | " + "value = " + obj);
	}
}
