package bh.db.ssm.controller.member;

import bh.db.ssm.entity.Member;
import bh.db.ssm.mapper.member.MemberMapper;
import bh.db.ssm.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @author 石皓岩
 * @create 2019-11-17-18:50
 * 描述：主要是处理会员的controller
 */
@SuppressWarnings("all")
@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;


	/**
	 * 按照条件查询会员信息,允许模糊查询
	 *
	 * @param start
	 * @param end
	 * @param memberName
	 * @return
	 */
	@RequestMapping("/member/search")
	public String search(@RequestParam(required = false, defaultValue = "") String start,
						 @RequestParam(required = false, defaultValue = "") String end,
						 @RequestParam(required = false, defaultValue = "") String memberName,
						 Map<String, Object> map) {

		List<Member> result = memberService.findMemberByCondition(start, end, memberName);
		map.put("result",result);
		return "forward:/page/member-list";
	}


}
