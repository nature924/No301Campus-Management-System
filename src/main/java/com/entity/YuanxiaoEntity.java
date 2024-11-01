package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 院校
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
@TableName("yuanxiao")
public class YuanxiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuanxiaoEntity() {
		
	}
	
	public YuanxiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学院名称
	 */
					
	private String xueyuanmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学院名称
	 */
	public void setXueyuanmingcheng(String xueyuanmingcheng) {
		this.xueyuanmingcheng = xueyuanmingcheng;
	}
	/**
	 * 获取：学院名称
	 */
	public String getXueyuanmingcheng() {
		return xueyuanmingcheng;
	}
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
