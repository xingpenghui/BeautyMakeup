package com.qianfeng.vo;


public class ResultVo {
	private int code;
	private String msg;
	private Object data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	public static ResultVo setOK(Object data) {
		ResultVo rvo=new ResultVo();
		rvo.setCode(0);
		rvo.setMsg("OK");
		rvo.setData(data);
		return rvo;
	}
	public static ResultVo setERROR(String message) {
		ResultVo rvo=new ResultVo();
		rvo.setCode(1);
		rvo.setMsg(message);
		return rvo;
	}
	

}
