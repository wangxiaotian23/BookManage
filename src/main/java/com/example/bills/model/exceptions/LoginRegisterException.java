package com.example.bills.model.exceptions;

/**
 * @Auther: 李清依
 * @Date: 2019/11/10 15:32
 * @Description:
 */
public class LoginRegisterException extends RuntimeException {
    public LoginRegisterException(){
        super();
    }
    public LoginRegisterException(String message) {
        super(message);
    }
    public LoginRegisterException(String message,Throwable cause) {
        super(message,cause);
    }
    public LoginRegisterException(Throwable cause) {
        super(cause);
    }
}
