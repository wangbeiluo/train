package cn.lewis.train.common.exception;

/**
 * @author lewis
 * @description:
 * @date: 2023/6/13
 * @Copyright:
 */
public enum BusinessExceptionEnum
{
    /**
     * 手机号已注册
     */
    MEMBER_MOBILE_EXIST("手机号已注册"),
    /**
     * 请先获取短信验证码
     */
    MEMBER_MOBILE_NOT_EXIST("请先获取短信验证码"),
    /**
     * 短信验证码错误
     */
    MEMBER_MOBILE_CODE_ERROR("短信验证码错误");

    private String desc;

    BusinessExceptionEnum(String desc)
    {
        this.desc = desc;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }
}
