package xyz.sdworld.study01;

import io.reactivex.Observable;
import xyz.sdworld.common.util.CommonUtil;
import xyz.sdworld.common.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class RxTimer {
	public static void main(String[] args) {
		CommonUtil.exampleStart();

		Observable<String> source = Observable.timer(500L, TimeUnit.MILLISECONDS)
			.map(notUsed -> {
				System.out.println("not =>" + notUsed);
				return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
					.format(new Date());
			});

		source.subscribe(Log::it);

		CommonUtil.sleep(1000);
	}
}
