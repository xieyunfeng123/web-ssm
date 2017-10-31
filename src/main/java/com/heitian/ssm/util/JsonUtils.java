package com.heitian.ssm.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.heitian.ssm.comm.Constant_ErrMsg;
import com.heitian.ssm.exception.MyRuntimeException;
import com.mysql.jdbc.StringUtils;

import static com.heitian.ssm.comm.Constant_ErrMsg.RESULT;

/**
 * 
 * json工具类  
 * @author 曾宝
 * @version  [V1.00, 2015-11-2]
 * @see  [相关类/方法]
 * @since V1.00
 */
public class JsonUtils implements Constant_ErrMsg
{
    
    /**
     * 
     * 版 权: Copyright udit<br>
     * 描 述: 获取 PrintWriter<br>
     * 创 建 人: 曾宝 zbmax001@126.com<br>
     * 创建时间:2015-11-2<br>
     * 版本号： 1.0 <br>
     */
    public static PrintWriter getPrintWriter(HttpServletResponse response)
    {
        try
        {
            response.setContentType("text/html; charset=utf-8");
            return response.getWriter();
            
        }
        catch (IOException e)
        {
            throw new MyRuntimeException("JsonUtils,getPrintWriter", e);
        }
    }
    
    /**
     * 
     * 版 权: Copyright udit<br>
     * 描 述: 打印jsonObject ，关闭printWriter<br>
     * 创 建 人: 曾宝 zbmax001@126.com<br>
     * 创建时间:2015-11-2<br>
     * 版本号： 1.0 <br>
     */
    public static void PrintWriter(PrintWriter printWriter,JSONObject jsonObject)
    {
        if (printWriter == null)
            throw new MyRuntimeException("JsonUtils PrintWriter is null");
        
        printWriter.print(jsonObject);
        printWriter.close();
        printWriter = null;
        
    }
    
    
    /**
     * 
     * 版 权: Copyright udit<br>
     * 描 述: 封装json<br>
     * 创 建 人: 曾宝 zbmax001@126.com<br>
     * 创建时间:2015-11-2<br>
     * 版本号： 1.0 <br>
     */
    public static <T> JSONObject ToJsonObject(String result, String message, T t)
    {
        if (!StringUtils.isNullOrEmpty(result))
        {
            throw new MyRuntimeException("result is null or not params");
        }

        JSONObject jsonObject = new JSONObject();
        jsonObject.put(RESULT, result);
        if (StringUtils.isNullOrEmpty(message))
        {
            jsonObject.put(MSG, message);
        }
        if (t != null)
        {
            if (t instanceof ArrayList<?>)
            {
                jsonObject.put("list", JSONArray.toJSON(t));
            }
            else if (t instanceof HashMap<?, ?>)
            {
                jsonObject.put("map", JSONArray.toJSON(t));
            }
            else if(t instanceof Integer)
            {
                jsonObject.put("count",t);
            }
            else if(t instanceof String)
            {
                jsonObject.put("value", t);
            }
            else
            {
                jsonObject.put(t.getClass().getSimpleName(), JSONObject.toJSON(t));
            }

        }

        return jsonObject;
    }
    
}
