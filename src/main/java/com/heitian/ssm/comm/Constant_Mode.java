package com.heitian.ssm.comm;

/**
 * 
 * 类型 
 * @author 曾宝
 * @version  [V1.00, 2015-11-9]
 * @see  [相关类/方法]
 * @since V1.00
 */
public interface Constant_Mode
{
    
    public interface IEnumeration
    {
        /**
         * 性别
         */
        public static final String USER_SEX="type_user_sex_";
        /**
         * 类型
         */
        public static final String USER_TYPE="type_user_type_";
        
    }
    /**
     * 
     * 类型定义
     * @author 曾宝
     * @version  [V1.00, 2015-11-9]
     * @see  [相关类/方法]
     * @since V1.00
     */
    public interface IMode_type
    {
        public static int MODE_SMS = 0;
    }
    /**
     * 
     * 短信类型 
     * @author 曾宝
     * @version  [V1.00, 2015-11-9]
     * @see  [相关类/方法]
     * @since V1.00
     */
    public interface IMode_SMS
    {
        /**
         * 登录
         */
        public static int MODE_LOGIN = 0;
        /**
         * 注册
         */
        public static int MODE_REGISTER = 1;
        /**
         * 找回密码
         */
        public static int MODE_FORGETPASSWORD = 2;
    }
}
