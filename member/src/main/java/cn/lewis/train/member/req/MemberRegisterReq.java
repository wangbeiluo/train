package cn.lewis.train.member.req;

import jakarta.validation.constraints.NotBlank;

/**
 * @author lewis
 * @description:
 * @date: 2023/6/12
 * @Copyright:
 */
public class MemberRegisterReq
{

    @NotBlank(message = "【手机号】不能为空")
    private String mobile;

    public String getMobile()
    {
        return mobile;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    @Override
    public String toString()
    {
        return "MemberRegisterReq{" +
                "mobile='" + mobile + '\'' +
                '}';
    }
}

