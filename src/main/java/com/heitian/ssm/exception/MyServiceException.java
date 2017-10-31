package com.heitian.ssm.exception;

/**
 * 
 * service层 异常 
 * @author 曾宝
 * @version  [V1.00, 2015-11-2]
 * @see  [相关类/方法]
 * @since V1.00
 */
public class MyServiceException extends Exception
{
    static final long serialVersionUID = -3387516993124229948L;

    public MyServiceException()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    public MyServiceException(String message, Throwable cause)
    {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    public MyServiceException(String message)
    {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public MyServiceException(Throwable cause)
    {
        super(cause);
        // TODO Auto-generated constructor stub
    }
    
 
}
