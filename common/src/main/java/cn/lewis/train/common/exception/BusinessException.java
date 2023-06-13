package cn.lewis.train.common.exception;

/**
 * @author lewis
 * @description:
 * @date: 2023/6/13
 * @Copyright:
 */
public class BusinessException extends RuntimeException
{
    private BusinessExceptionEnum exceptionEnum;

    public BusinessException(BusinessExceptionEnum exceptionEnum)
    {
        this.exceptionEnum = exceptionEnum;
    }

    public BusinessExceptionEnum getExceptionEnum()
    {
        return exceptionEnum;
    }

    public void setExceptionEnum(BusinessExceptionEnum exceptionEnum)
    {
        this.exceptionEnum = exceptionEnum;
    }
}
