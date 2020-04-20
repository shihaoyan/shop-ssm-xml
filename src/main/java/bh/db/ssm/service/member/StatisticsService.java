package bh.db.ssm.service.member;

import bh.db.ssm.commons.pojo.Week;

/**
 * @author 石皓岩
 * @create 2019-11-14-20:54
 * 描述：专门用来处理统计功能的服务
 */
public interface StatisticsService {
	/**
	 * 统计一周内新增用户
	 * @return	返回值包含了每一周的新增用户量
	 */
	Week<Integer> countNewUserForWeek();

	/**
	 * 统计一周之内的pv量
	 * @return
	 */
	Week<Integer> countPvForWeek();

	/**
	 * 统计一周之内的uv量
	 * @return
	 */
	Week<Integer> countUvForWeek();

	/**
	 * 统计一周之内的fileServerQuantity量
	 * @return
	 */
	Double countFileServerQuantity();


}
