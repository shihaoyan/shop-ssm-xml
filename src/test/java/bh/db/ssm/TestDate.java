package bh.db.ssm;

import bh.db.ssm.commons.MyConstant;
import bh.db.ssm.service.admin.UserService;
import bh.db.ssm.service.admin.impl.UserServiceImpl;
import org.junit.Test;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 石皓岩
 * @create 2019-11-15-15:28
 * 描述：
 */
public class TestDate {

    private UserService userService = null;


	@Test
	public void test01(){

		Calendar calendar=Calendar.getInstance();
		String week = MyConstant.WEEKDAYS[calendar.get(Calendar.DAY_OF_WEEK)-1];
		System.out.println();
		//获取当前时间
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sf.format(new Date());
		System.out.println(date);
	}

	@Test
	public void test2(){
        TestDate t = new TestDate();
        Class<? extends TestDate> aClass = t.getClass();
        try {
            Field userService = aClass.getDeclaredField("userService");
            userService.setAccessible(true);
            userService.set(t,new UserServiceImpl());



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
