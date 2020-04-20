package bh.db.ssm.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author 石皓岩
 * @create 2019-11-15-15:37
 * 描述：时间处理工具类
 */
public class MyDateUtils {

	/**
	 * 获取当前日的一周时间
	 * @return
	 */
	public static String[] getWeekDays(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
			calendar.add(Calendar.DAY_OF_WEEK, -1);
		}
		String[] dates = new String[8];
		for (int i = 0; i < 8; i++) {
			dates[i] = dateFormat.format(calendar.getTime());
			calendar.add(Calendar.DATE, 1);
		}
		return dates;
	}

}
