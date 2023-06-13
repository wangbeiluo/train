package cn.lewis.train.common.util;

import cn.hutool.core.util.IdUtil;

/**
 * @author lewis
 * @description: 封装hutool雪花算法
 * @date: 2023/6/13
 * @Copyright:
 */
public class SnowUtil
{
    /**
     * 数据中心
     */
    private static long dataCenterId = 1;
    /**
     * 机器标识
     */
    private static long workerId = 1;

    public static long getSnowflakeNextId() {
        return IdUtil.getSnowflake(workerId, dataCenterId).nextId();
    }

    public static String getSnowflakeNextIdStr() {
        return IdUtil.getSnowflake(workerId, dataCenterId).nextIdStr();
    }
}
