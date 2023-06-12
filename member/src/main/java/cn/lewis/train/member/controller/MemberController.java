package cn.lewis.train.member.controller;

import cn.lewis.train.member.service.MemberService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lewis
 * @description:
 * @date: 2023/6/12
 * @Copyright:
 */
@RestController
@RequestMapping("/member")
public class MemberController
{
    @Resource
    private MemberService memberService;

    @GetMapping("/count")
    public int count() {
        int count = memberService.count();

        return count;
    }
}
