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
    MEMBER_MOBILE_EXIST("手机号已注册");

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
