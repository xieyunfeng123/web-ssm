package com.heitian.ssm.exception;

/**
 * 
 * 项目运行时异常  
 * @author 曾宝
 * @version  [V1.00, 2015-11-2]
 * @see  [相关类/方法]
 * @since V1.00
 */
public class MyRuntimeException extends RuntimeException
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -2710037744203924127L;
    
    public MyRuntimeException()
    {
        super();
    }
    
    public MyRuntimeException(String message, Throwable cause)
    {
        super(message, cause);
    }
    
    public MyRuntimeException(String message)
    {
        super(message);
    }
    
    public MyRuntimeException(Throwable cause)
    {
        super(cause);
    }
    
}
