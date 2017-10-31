package com.heitian.ssm.exception;

/**
 * 
 * 控制层异常
 * 
 * @author 曾宝
 * @version [V1.00, 2015-11-2]
 * @see [相关类/方法]
 * @since V1.00
 */
public class MyControllerException extends Exception
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -8919724964262825371L;
    
    public MyControllerException()
    {
        super();
    }
    
    public MyControllerException(String message, Throwable cause)
    {
        super(message, cause);
    }
    
    public MyControllerException(String message)
    {
        super(message);
    }
    
    public MyControllerException(Throwable cause)
    {
        super(cause);
    }
    
}
