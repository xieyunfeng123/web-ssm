package com.heitian.ssm.comm;

/**
 * 
 * 短信模板
 * 
 * @author 曾宝
 * @version [V1.00, 2015-11-2]
 * @see [相关类/方法]
 * @since V1.00
 */
public interface ConstantSMS
{
    /**
     * 短信片段头部
     */
    public static final String SMS_TOP = "【城市说】亲爱的用户，您的验证码是";
    /**
     * 短信片段尾部
     */
    public static final String SMS_END = "。有效期为2小时，请尽快验证";
    /**
     * 短信次数
     */
    public static final String SMS_ERR ="短信注册次数已过多，请2小时候在进行注册";
    

}
