package com.cy.pj.sys.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * POJO对象包含set和get方法
 * 1.po:(持久化对象persistent object)
 * 2.vo:(值对象,封装数据)po是一个特殊的vo,因为要关联表
 * 
 * */
import lombok.Data;
import lombok.ToString;
@Data//@Data默认进行了set和get方法
@ToString//toString


public class SysLog implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2552108194030970453L;
	private Integer id;
	/**用户名*/
	private String username;
	/**用户操作*/
	private String operation;
	/**请求方法*/
	private String method;
	/**请求参数*/
	private String params;
	/**执行时长(毫秒)*/
	private Long time;
	/**IP地址*/
	private String ip;
	/**创建时间*/
	private Date createdTime;

}
