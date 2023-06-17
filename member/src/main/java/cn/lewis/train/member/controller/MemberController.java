package cn.lewis.train.member.controller;

import cn.lewis.train.common.resp.CommonResp;
import cn.lewis.train.member.req.MemberLoginReq;
import cn.lewis.train.member.req.MemberRegisterReq;
import cn.lewis.train.member.req.MemberSendCodeReq;
import cn.lewis.train.member.resp.MemberLoginResp;
import cn.lewis.train.member.service.MemberService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

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
    public CommonResp<Integer> count() {
        int count = memberService.count();

        return new CommonResp<Integer>(count);
    }

    @PostMapping("/register")
    public CommonResp<Long> register(@Valid MemberRegisterReq req) {
        long register = memberService.register(req.getMobile());
        return new CommonResp<Long>(register);
    }

    @PostMapping("/sendCode")
    public CommonResp<Long> sendCode(@Valid MemberSendCodeReq req) {
        memberService.sendCode(req);
        return new CommonResp<>();
    }

    @PostMapping("/login")
    public CommonResp<MemberLoginResp> login(@Valid @RequestBody MemberLoginReq req) {
        MemberLoginResp resp = memberService.login(req);
        return new CommonResp<MemberLoginResp>(resp);
    }
}
