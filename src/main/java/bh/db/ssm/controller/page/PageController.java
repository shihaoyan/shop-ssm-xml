package bh.db.ssm.controller.page;

import bh.db.ssm.commons.pojo.Week;
import bh.db.ssm.entity.Member;
import bh.db.ssm.service.member.MemberService;
import bh.db.ssm.service.member.StatisticsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author BH-DB-SHY
 * @create 2019-11-03-16:08
 * 描述：所有的界面跳转controller
 * 命名规则：toXxx
 * 映射规则：/page/toXxx
 */
@Controller
public class PageController implements EnvironmentAware {
    private final Log logger = LogFactory.getLog(PageController.class);

    /**
     * 统计的服务
     */
    @Autowired
    private StatisticsService statisticsService;
    /**
     * 会员信息服务
     */
    @Autowired
    private MemberService memberService;

    /**
     * 跳转到登陆页
     *
     * @return
     */
    @RequestMapping("/page/toLogin")
    public String toLogin() {
        logger.info("-----------info------------");
        return "admin/login";
    }

    /**
     * 跳转到主页
     *
     * @return
     */
    @RequestMapping("/page/toIndex")
    public String toIndex() {

        return "index";
    }

    /**
     * 跳转到欢迎页
     *
     * @return
     */
    @RequestMapping("/page/toWelcome")
    public String toWelcome(Map<String, Object> map) {

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        map.put("date", sf.format(new Date()));
        return "welcome";
    }

    /**
     * 跳转到切换用户
     */
    @RequestMapping("/page/toCheckUser")
    public String toCheckUser() {

        return "admin/checkUser";
    }

    /**
     * 跳转到统计界面
     */
    @RequestMapping("/page/toStatistics")
    public String toStatistics(Map<String, Object> map) {

        //首先应该封装数据，首先是一周内新增用户量
        Week<Integer> week = statisticsService.countNewUserForWeek();
        map.put("week", week);

        return "member/statistics";
    }

    /**
     * 跳转到member-list
     */
    @RequestMapping("/page/member-list")
    public String memberList(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                             @RequestParam(required = false, defaultValue = "10") Integer rows,
                             Map<String, Object> map) {

        //查询所有的会员信息
        List<Member> result = memberService.findAllMember();
        map.put("result", result);
        return "member/member-list";
    }

    private Environment environment;
    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
