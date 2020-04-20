package bh.db.ssm.service.member.impl;

import bh.db.ssm.commons.pojo.Week;
import bh.db.ssm.mapper.admin.UserMapper;
import bh.db.ssm.service.member.StatisticsService;
import bh.db.ssm.utils.MyDateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 石皓岩
 * @create 2019-11-15-14:25
 * 描述：进行统计的service服务
 */
@Service
public class StatisticsServiceImpl implements StatisticsService {
	/**
	 * 用来统计新增用户需要用到
	 */
	@Autowired
	private UserMapper userMapper;

	/**
	 * 统计一周内的新增用户
	 *
	 * @return
	 */
	@Override
	public Week<Integer> countNewUserForWeek() {

		Week<Integer> week = new Week<Integer>();
		//获取当前周的每一天的时间
		String[] weekDays = MyDateUtils.getWeekDays();
		//查询这一周的新增用户
		week.setMonday(userMapper.countNewUserForDay(weekDays[0], weekDays[1]));
		week.setTuesday(userMapper.countNewUserForDay(weekDays[1], weekDays[2]));
		week.setWednesday(userMapper.countNewUserForDay(weekDays[2], weekDays[3]));
		week.setThursday(userMapper.countNewUserForDay(weekDays[3], weekDays[4]));
		week.setFriday(userMapper.countNewUserForDay(weekDays[4], weekDays[5]));
		week.setSaturday(userMapper.countNewUserForDay(weekDays[5], weekDays[6]));
		week.setSunday(userMapper.countNewUserForDay(weekDays[6], weekDays[7]));
		//返回数据
		return week;
	}

	/**
	 * 统计一周之内的PV量
	 *
	 * @return
	 */
	@Override
	public Week<Integer> countPvForWeek() {
		return null;
	}

	/**
	 * 统计一周之内的UV量
	 *
	 * @return
	 */
	@Override
	public Week<Integer> countUvForWeek() {
		return null;
	}

	/**
	 * 通过图片服务器的使用量
	 *
	 * @return
	 */
	@Override
	public Double countFileServerQuantity() {
		return null;
	}
}
