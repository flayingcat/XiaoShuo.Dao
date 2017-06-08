package com.zengqiang.xiaoshuo.common.exception;

public class XiaoShuoException extends RuntimeException{

	public XiaoShuoException(String message, Throwable cause) {
		super(message, cause);
	}

	public XiaoShuoException(String message) {
		super(message);
	}

	public XiaoShuoException(Throwable cause) {
		super(cause);
	}
	
	
	
}
