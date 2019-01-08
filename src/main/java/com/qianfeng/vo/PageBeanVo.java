package com.qianfeng.vo;

import java.util.List;

public class PageBeanVo<T> {

	private int code;
	private int count;
	private String msg;
	private List<T> data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	
	public static <T> PageBeanVo setPage(int count,List<T> data) {
		PageBeanVo pvo=new PageBeanVo();
		pvo.setCode(0);
		pvo.setMsg("");
		pvo.setCount(count);
		pvo.setData(data);
		return pvo;
	}
	
}
