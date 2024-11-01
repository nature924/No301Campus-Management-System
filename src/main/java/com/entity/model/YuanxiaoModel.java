package com.entity.model;

import com.entity.YuanxiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 院校
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
public class YuanxiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 资料文件
	 */
	
	private String ziliaowenjian;
		
	/**
	 * 学院简介
	 */
	
	private String xueyuanjianjie;
		
	/**
	 * 职工人数
	 */
	
	private String zhigongrenshu;
		
	/**
	 * 院校账号
	 */
	
	private String yuanxiaozhanghao;
				
	
	/**
	 * 设置：资料文件
	 */
	 
	public void setZiliaowenjian(String ziliaowenjian) {
		this.ziliaowenjian = ziliaowenjian;
	}
	
	/**
	 * 获取：资料文件
	 */
	public String getZiliaowenjian() {
		return ziliaowenjian;
	}
				
	
	/**
	 * 设置：学院简介
	 */
	 
	public void setXueyuanjianjie(String xueyuanjianjie) {
		this.xueyuanjianjie = xueyuanjianjie;
	}
	
	/**
	 * 获取：学院简介
	 */
	public String getXueyuanjianjie() {
		return xueyuanjianjie;
	}
				
	
	/**
	 * 设置：职工人数
	 */
	 
	public void setZhigongrenshu(String zhigongrenshu) {
		this.zhigongrenshu = zhigongrenshu;
	}
	
	/**
	 * 获取：职工人数
	 */
	public String getZhigongrenshu() {
		return zhigongrenshu;
	}
				
	
	/**
	 * 设置：院校账号
	 */
	 
	public void setYuanxiaozhanghao(String yuanxiaozhanghao) {
		this.yuanxiaozhanghao = yuanxiaozhanghao;
	}
	
	/**
	 * 获取：院校账号
	 */
	public String getYuanxiaozhanghao() {
		return yuanxiaozhanghao;
	}
			
}
