package cn.lewis.train.member.req;

/**
 * @author lewis
 * @description:
 * @date: 2023/6/12
 * @Copyright:
 */
public class MemberRegisterReq
{
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

