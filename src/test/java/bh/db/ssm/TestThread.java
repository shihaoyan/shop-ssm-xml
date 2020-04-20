package bh.db.ssm;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 石皓岩
 * @create 2019-11-15-18:08
 * 描述：
 */
public class TestThread {
	private static Map<String, Integer> pvs = new ConcurrentHashMap<>(1000);
	private static Lock lock = new ReentrantLock();


	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			final int tmp = i;
			new Thread(() -> {
				test01();
			}, String.valueOf(tmp)).start();
		}
		pvs.forEach((s, integer) -> {
			System.out.println(integer);
		});
	}

	public static void test01() {

		lock.lock();
		try {
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sf.format(new Date());
			//判断这个时间段中是否已经有人访问过了
			if (pvs.containsKey(date)) {
				Integer sum = pvs.get(date);
				sum = sum + 1;
				System.out.println(sum);
				//其实这个是pv量
				pvs.put(date, sum);
			} else {
				System.out.println("========");
				//添加到集合中
				pvs.put(date, 1);
			}
		}finally {
			lock.unlock();
		}

	}

}
