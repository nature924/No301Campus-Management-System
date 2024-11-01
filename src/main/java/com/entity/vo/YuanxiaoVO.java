package com.entity.vo;

import com.entity.YuanxiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 院校
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
public class YuanxiaoVO  implements Serializable {
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
