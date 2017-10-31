package com.heitian.ssm.comm;
/**
 * 
 * 正则表达式 
 * @author 曾宝
 * @version  [V1.00, 2015-11-11]
 * @see  [相关类/方法]
 * @since V1.00
 */
public interface Constant_Pattern
{
    /**
     * 检查 城市索引首字母
     */
    public static final String PATTERN_CKEY="[a-zA-Z]{1}";
    /**
     * 检查手机号码
     */
    public static final String PATTERN_PHONE="^1[0-9]{10}$";
}
