package com.heitian.ssm.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.heitian.ssm.comm.Constant_ErrMsg;
import com.heitian.ssm.comm.Constant_Mode;
import com.heitian.ssm.comm.Constant_Pattern;
import com.heitian.ssm.exception.MyRuntimeException;
import org.slf4j.Logger;

/**
 * 
 * 验证工具
 * 
 * @author 曾宝
 * @version [V1.00, 2015-11-2]
 * @see [相关类/方法]
 * @since V1.00
 */
public class AssertUtils implements Constant_ErrMsg, Constant_Mode, Constant_Pattern
{
    
    /**
     * 
     * 版 权: Copyright udit<br>
     * 描 述: 验证字符是/否为空  为空true 不为空false<br>
     * 创 建 人: 曾宝 zbmax001@126.com<br>
     * 创建时间:2015-11-24<br>
     * 版本号： 1.0 <br>
     */
    public static boolean CheckStrNull(String str)
    {
        if(str==null || str.isEmpty())
            return true;
        
        return false;
    }
    
    /**
     * 
     * 版 权: Copyright udit<br>
     * 描 述: int 类型<br>
     * 创 建 人: 曾宝 zbmax001@126.com<br>
     * 创建时间:2015-11-9<br>
     * 版本号： 1.0 <br>
     */
    public static void NOTNULL_INT(Object obj, String msg, Logger logger)
    {
        if (obj == null)
        {
            logger.error(msg + "不能为空");
            throw new MyRuntimeException(msg + "不能为空");
        }
        try
        {
            Integer.parseInt(obj.toString());
        }
        catch (NumberFormatException e)
        {
            logger.error(msg + "非法");
            throw new MyRuntimeException(msg + "非法");
        }
    }

    /**
     *
     * 版 权: Copyright udit<br>
     * 描 述:验证手机号码<br>
     * 创 建 人: 曾宝 zbmax001@126.com<br>
     * 创建时间:2015-11-9<br>
     * 版本号： 1.0 <br>
     */
    public static void NOTNULL_USERNAME(Object obj, Logger logger)
    {
        if (obj == null)
        {
            logger.error(IUser_Err.USER_VALIDATE_LOGINNAME_ERR);
            throw new MyRuntimeException(IUser_Err.USER_VALIDATE_LOGINNAME_ERR);
        }
        Pattern p = Pattern.compile(PATTERN_PHONE);
        Matcher m = p.matcher(obj.toString());
        if (!m.matches())
        {
            logger.error(IParams_Err.PHONE_NOT_VALIDATE);
            throw new MyRuntimeException(IParams_Err.PHONE_NOT_VALIDATE);
        }
    }
    
    /**
     * 
     * 版 权: Copyright udit<br>
     * 描 述:验证手机号码<br>
     * 创 建 人: 曾宝 zbmax001@126.com<br>
     * 创建时间:2015-11-9<br>
     * 版本号： 1.0 <br>
     */
    public static void NOTNULL_PHONE(Object obj, Logger logger)
    {
        if (obj == null)
        {
            logger.error(IParams_Err.PHONE_NULL);
            throw new MyRuntimeException(IParams_Err.PHONE_NULL);
        }
        Pattern p = Pattern.compile(PATTERN_PHONE);
        Matcher m = p.matcher(obj.toString());
        if (!m.matches())
        {
            logger.error(IParams_Err.PHONE_NOT_VALIDATE);
            throw new MyRuntimeException(IParams_Err.PHONE_NOT_VALIDATE);
        }
    }
    
    /**
     * 
     * 版 权: Copyright udit<br>
     * 描 述: 检查参数是/否 为null，包括检查各种类型的强制转换<br>
     * 创 建 人: 曾宝 zbmax001@126.com<br>
     * 创建时间:2015-11-2<br>
     * 版本号： 1.0 <br>
     */
    public static void NULL(Object obj, String msg, Logger logger)
    {
        if (obj != null)
        {
            if (obj instanceof String)
            {
                if (!obj.toString().isEmpty() && obj.toString().length() > 0)
                    throw new MyRuntimeException(msg);
            }
            else
                throw new MyRuntimeException(msg);
        }
        
    }
    
    /**
     * 版 权: Copyright udit<br>
     * 描 述: 检查参数是/否 为null，包括检查各种类型的强制转换<br>
     * 创 建 人: 曾宝 zbmax001@126.com<br>
     * 创建时间:2015-11-2<br>
     * 版本号： 1.0 <br>
     */
    public static void NOTNULL(Object obj, String msg, Logger logger)
    {
        if (obj == null)
        {
            throw new MyRuntimeException(msg);
        }
        else if (obj instanceof String)
        {
            logger.info("AssertUtils-NOTNULL obj is String");
            if (obj.toString().isEmpty() || obj.toString().length() == 0)
                throw new MyRuntimeException(msg);
        }
        else if (obj instanceof Integer)
        {
            logger.info("AssertUtils-NOTNULL obj is Integer");
            try
            {
                Integer.parseInt(obj.toString());
            }
            catch (NumberFormatException e)
            {
                throw new MyRuntimeException(msg);
            }
        }
        else if (obj instanceof Float)
        {
            logger.info("AssertUtils-NOTNULL obj is Float");
            try
            {
                Float.parseFloat(obj.toString());
            }
            catch (NumberFormatException e)
            {
                throw new MyRuntimeException(msg);
            }
        }
        else if (obj instanceof List<?>)
        {
            logger.info("AssertUtils-NOTNULL obj is List");
            if (((List<?>)obj).size() == 0)
                throw new MyRuntimeException(msg);
        }
        else if(obj instanceof Map<?, ?>)
        {
            logger.info("AssertUtils-NOTNULL obj is MAP");
            if (((Map<?, ?>)obj).size() == 0)
                throw new MyRuntimeException(msg);
        }
        else if(obj instanceof HashMap<?, ?>)
        {
            logger.info("AssertUtils-NOTNULL obj is HashMap");
            if (((HashMap<?, ?>)obj).size() == 0)
                throw new MyRuntimeException(msg);
        }
    }
    
    /**
     * 类型
     * 版 权: Copyright udit<br>
     * 描 述: 方法描述<br>
     * 创 建 人: 曾宝 zbmax001@126.com<br>
     * 创建时间:2015-11-9<br>
     * 版本号： 1.0 <br>
     */
    public static void NOTNULL_MODE(Object objSmsMode, int mode_type, Logger logger)
    {
        if (objSmsMode == null)
        {
            logger.error(IParams_Err.MODE_NULL);
            throw new MyRuntimeException(IParams_Err.MODE_NULL);
        }
        try
        {
            Integer.parseInt(objSmsMode.toString());
        }
        catch (NumberFormatException e)
        {
            throw new MyRuntimeException(IParams_Err.MODE_NOT_VALIDATE);
        }
        
    }
    
    /**
     * 
     * 版 权: Copyright udit<br>
     * 描 述: 检验城市key <br>
     * 创 建 人: 曾宝 zbmax001@126.com<br>
     * 创建时间:2015-11-11<br>
     * 版本号： 1.0 <br>
     */
    public static void validateCkey(Object objectCkey, Logger logger)
    {
        NOTNULL(objectCkey, ICity_Err.CITY_CKEY_NULL, logger);
        
        Matcher matcher;
        try
        {
            Pattern r = Pattern.compile(PATTERN_CKEY);
            matcher = r.matcher(objectCkey.toString());
            if (!matcher.matches())
            {
                throw new MyRuntimeException(ICity_Err.CITY_CKEY_NOT_VALIDATE);
            }
        }
        catch (Exception e)
        {
            throw new MyRuntimeException(ICity_Err.CITY_CKEY_NOT_VALIDATE);
        }
        
    }
    
    public static boolean isNoTEmtry(String str)
    {
        if(str!=null && str.length()>0 && !str.isEmpty())
        {
            return true;
        }
        return false;
    }

    public static void NOTNULL_TIME(Object obj_time, String format, String msg,Logger logger)
    {
        NOTNULL(obj_time, msg, logger);
        try
        {
            DateUtil.toDate(obj_time.toString(), format);
        }
        catch (Exception e)
        {
           throw new MyRuntimeException("参数不合格");
        }
        
    }
}
