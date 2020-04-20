package bh.db.ssm.service.member;

import bh.db.ssm.entity.Member;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2019-11-17-18:22
 * 描述：会员处理接口
 */
public interface MemberService {

	/**
	 * 查询所有的会员信息
	 * @return
	 */
	List<Member> findAllMember();

	/**
	 * 根据条件查询会员信息，支持模糊查询
	 * @param start
	 * @param end
	 * @param memberName
	 * @return
	 */
	List<Member> findMemberByCondition(String start, String end, String memberName);
}
