package xyz.sdworld.study01;

import io.reactivex.Observable;
import xyz.sdworld.common.util.CommonUtil;
import xyz.sdworld.common.util.Log;

import java.util.concurrent.TimeUnit;

public class RxInterval {

	public static void main(String[] args) {
		CommonUtil.exampleStart();
		Observable<Long> source = Observable.interval(100L, TimeUnit.MILLISECONDS)
			.map(data -> (data + 1) * 100)
			.take(5);

		source.subscribe(Log::it);

		CommonUtil.sleep(1000);
	}
}
