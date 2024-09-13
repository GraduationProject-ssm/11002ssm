package com.entity.vo;

import com.entity.XiaoshoutongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 销售统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-11-05 11:57:46
 */
public class XiaoshoutongjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 客户姓名
	 */
	
	private String kehuxingming;
		
	/**
	 * 销售数量
	 */
	
	private String xiaoshoushuliang;
		
	/**
	 * 销售价格
	 */
	
	private String xiaoshoujiage;
		
	/**
	 * 销售日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiaoshouriqi;
				
	
	/**
	 * 设置：客户姓名
	 */
	 
	public void setKehuxingming(String kehuxingming) {
		this.kehuxingming = kehuxingming;
	}
	
	/**
	 * 获取：客户姓名
	 */
	public String getKehuxingming() {
		return kehuxingming;
	}
				
	
	/**
	 * 设置：销售数量
	 */
	 
	public void setXiaoshoushuliang(String xiaoshoushuliang) {
		this.xiaoshoushuliang = xiaoshoushuliang;
	}
	
	/**
	 * 获取：销售数量
	 */
	public String getXiaoshoushuliang() {
		return xiaoshoushuliang;
	}
				
	
	/**
	 * 设置：销售价格
	 */
	 
	public void setXiaoshoujiage(String xiaoshoujiage) {
		this.xiaoshoujiage = xiaoshoujiage;
	}
	
	/**
	 * 获取：销售价格
	 */
	public String getXiaoshoujiage() {
		return xiaoshoujiage;
	}
				
	
	/**
	 * 设置：销售日期
	 */
	 
	public void setXiaoshouriqi(Date xiaoshouriqi) {
		this.xiaoshouriqi = xiaoshouriqi;
	}
	
	/**
	 * 获取：销售日期
	 */
	public Date getXiaoshouriqi() {
		return xiaoshouriqi;
	}
			
}