package bh.db.ssm.service.member.impl;

import bh.db.ssm.entity.Member;
import bh.db.ssm.mapper.member.MemberMapper;
import bh.db.ssm.service.member.MemberService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2019-11-17-18:23
 * 描述：会员服务的实现
 */
@Service
public class MemberServiceImpl implements MemberService {

	/**
	 * 主要是操作会员表(tb_member)
	 */
	@Autowired
	private MemberMapper memberMapper;


	/**
	 * 查询所有的会员信息
	 *
	 * @return
	 */
	@Override
	public List<Member> findAllMember() {

		List<Member> list = memberMapper.findAllMember();

		return list;
	}

	/**
	 * 根据条件查询所有的会员信息。支持模糊查询
	 *
	 * @param start
	 * @param end
	 * @param memberName
	 * @return
	 */
	@Override
	public List<Member> findMemberByCondition(String start, String end, String memberName) {

		List<Member> list = memberMapper.findMemberByCondition(start, end, memberName);

		return list;
	}
}
