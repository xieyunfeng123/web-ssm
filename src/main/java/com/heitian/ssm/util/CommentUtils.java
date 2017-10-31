package com.heitian.ssm.util;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import com.heitian.ssm.exception.MyRuntimeException;
import org.slf4j.Logger;

/**
 * 
 * 公共方法
 * 
 * @author 曾宝
 * @version [V1.00, 2015-11-2]
 * @see [相关类/方法]
 * @since V1.00
 */
public class CommentUtils
{
    
    /**
     * 
     * 版 权: Copyright udit<br>
     * 描 述: 加载request 参数 返回HashMap<String,Object> 便于对参数的管理<br>
     * 创 建 人: 曾宝 zbmax001@126.com<br>
     * 创建时间:2015-11-2<br>
     * 版本号： 1.0 <br>
     */
    @SuppressWarnings("unchecked")
    public static Map<String, Object> requestToHashMap(HttpServletRequest request, Logger logger)
    {
    
        Map<String, String[]> map = request.getParameterMap();
        Iterator<Entry<String, String[]>> iterator = map.entrySet().iterator();
        Map<String, Object> map_params = new HashMap<String, Object>();
        String agent = request.getHeader("User-agent");
       
        while (iterator.hasNext())
        {
            Entry<String, String[]> entry = iterator.next();
            String key = entry.getKey();
            String value = ((String[])entry.getValue())[0];
            
            if(agent.contains("android"))
            {
                map_params.put(key, value);
            }
            else if(agent.contains("ios"))
            {}
            else
            {
                try
                {
                    String v = new String(value.getBytes("ISO-8859-1"),"utf-8");
                    map_params.put(key, v);
                }
                catch (UnsupportedEncodingException e)
                {
                    e.printStackTrace();
                }
              
            }
            
        }
        if (map_params != null)
        {
            printMap(map_params, logger);
        }
        return map_params;
        
    }
    
    /**
     * 版 权: Copyright udit<br>
     * 描 述: 打印Map参数<br>
     * 创 建 人: 曾宝 zbmax001@126.com<br>
     * 创建时间:2015-11-2<br>
     * 版本号： 1.0 <br>
     */
    public static void printMap(Map<String, Object> map, Logger logger)
    {
        if (map == null)
        {
            throw new MyRuntimeException("printParament map is null");
        }
        
        Iterator<Entry<String, Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Entry<String, Object> entry = iterator.next();
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Object[])
            {
                logger.info("key:" + key);
                printArray(value, logger);
            }
            else
            {
                logger.info("key:" + key + "  value:" + value);
            }
        }
        
    }
    
    /**
     * 
     * 版 权: Copyright udit<br>
     * 描 述: 打印各种类型参数<br>
     * 创 建 人: 曾宝 zbmax001@126.com<br>
     * 创建时间:2015-11-2<br>
     * 版本号： 1.0 <br>
     */
    private static void printArray(Object value, Logger logger)
    {
        
        if (value == null)
        {
            throw new MyRuntimeException("printArray value is null");
        }
        if (value instanceof String[])
        {
            for (String s : (String[])value)
            {
                logger.info("s:" + s);
            }
        }
    }
    
    /**
     * 
     * 版 权: Copyright udit<br>
     * 描 述: 打印list参数<br>
     * 创 建 人: 曾宝 zbmax001@126.com<br>
     * 创建时间:2015-11-2<br>
     * 版本号： 1.0 <br>
     */
    public static <T> void printList_Bean(List<T> mlist, Logger logger)
    {
        if (mlist == null)
        {
            throw new MyRuntimeException("printList_Bean list is null");
        }
        for (int i = 0; mlist != null && i < mlist.size(); i++)
        {
            T t = mlist.get(i);
            
            printBean(t, logger);
        }
        
    }
    
    /**
     * 
     * 版 权: Copyright udit<br>
     * 描 述: 打印类的参数<br>
     * 创 建 人: 曾宝 zbmax001@126.com<br>
     * 创建时间:2015-11-2<br>
     * 版本号： 1.0 <br>
     */
    public static <T> void printBean(T t, Logger logger)
    {
        if (t == null)
        {
            throw new MyRuntimeException("printBean t is null");
        }
        Class<? extends Object> cls_t = t.getClass();
        
        Field[] fs = cls_t.getDeclaredFields();
        
        for (int j = 0; fs != null && j < fs.length; j++)
        {
            Field field = fs[j];
            field.setAccessible(true);
            try
            {
                Object obj_field = field.get(t);
                
                String name = field.getName();
                
                logger.info("name:" + name + "  value:" + (obj_field == null ? "null" : obj_field));
                
            }
            catch (IllegalArgumentException e)
            {
                new MyRuntimeException("printBean IllegalArgumentException" + e.getMessage());
            }
            catch (IllegalAccessException e)
            {
                new MyRuntimeException("printBean IllegalAccessException" + e.getMessage());
            }
            
        }
        
    }
    
    /**
     * 
     * 版 权: Copyright udit<br>
     * 描 述: 方法描述<br>
     * 创 建 人: 曾宝 zbmax001@126.com<br>
     * 创建时间:2015-11-2<br>
     * 版本号： 1.0 <br>
     */
    public static String getRandomNumFive()
    {
        String base = "0123456789";
        int base_length = base.length();
        StringBuffer sb = new StringBuffer(5);
        for (int i = 0; i < 5; i++)
        {
            sb.append(base.charAt(new Random().nextInt(base_length)));
        }
        return sb.toString();
    }
    
    
    public static String puzero(int num)
    {
        // 得到一个NumberFormat的实例
        NumberFormat nf = NumberFormat.getInstance();
        // 设置是否使用分组
        nf.setGroupingUsed(false);
        // 设置最大整数位数
        nf.setMaximumIntegerDigits(10);
        // 设置最小整数位数
        nf.setMinimumIntegerDigits(10);
        // 输出测试语句
        String n = nf.format(num);
        return n;
    }
}
