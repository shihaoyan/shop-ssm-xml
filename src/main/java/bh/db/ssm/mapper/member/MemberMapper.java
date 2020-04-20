package bh.db.ssm.mapper.member;

import bh.db.ssm.entity.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2019-11-17-18:16
 * 描述：
 */
public interface MemberMapper {

	/**
	 * 查询所有的会员
	 *
	 * @return
	 */
	List<Member> findAllMember();

	/**
	 * 根据条件进行模糊查询
	 *
	 * @param start
	 * @param end
	 * @param memberName
	 * @return
	 */
	List<Member> findMemberByCondition(@Param("start") String start, @Param("end") String end, @Param("memberName") String memberName);



}
