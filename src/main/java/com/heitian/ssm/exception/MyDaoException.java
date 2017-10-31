package com.heitian.ssm.exception;

/**
 * 
 * dao层异常  
 * @author 曾宝
 * @version  [V1.00, 2015-11-2]
 * @see  [相关类/方法]
 * @since V1.00
 */
public class MyDaoException extends Exception
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -8202510586092507210L;

    public MyDaoException()
    {
        super();
    }

    public MyDaoException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public MyDaoException(String message)
    {
        super(message);
    }

    public MyDaoException(Throwable cause)
    {
        super(cause);
    }

   
}
