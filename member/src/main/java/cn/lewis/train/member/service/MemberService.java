package cn.lewis.train.member.service;

import cn.hutool.core.collection.CollUtil;
import cn.lewis.train.common.exception.BusinessException;
import cn.lewis.train.common.exception.BusinessExceptionEnum;
import cn.lewis.train.member.domain.Member;
import cn.lewis.train.member.domain.MemberExample;
import cn.lewis.train.member.mapper.MemberMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lewis
 * @description:
 * @date: 2023/6/12
 * @Copyright:
 */
@Service
public class MemberService
{
    @Resource
    private MemberMapper memberMapper;

    public int count() {
        return (int) memberMapper.countByExample(null);
    }

    public long register(String mobile) {
        MemberExample memberExample = new MemberExample();
        memberExample.createCriteria().andMobileEqualTo(mobile);
        List<Member> list = memberMapper.selectByExample(memberExample);

        if (CollUtil.isNotEmpty(list)) {
//            return list.get(0).getId();
            throw new BusinessException(BusinessExceptionEnum.MEMBER_MOBILE_EXIST);
        }

        Member member = new Member();
        member.setId(System.currentTimeMillis());
        member.setMobile(mobile);
        memberMapper.insert(member);
        return member.getId();
    }
}
