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
 * 投票信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
@TableName("toupiaoxinxi")
public class ToupiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ToupiaoxinxiEntity() {
		
	}
	
	public ToupiaoxinxiEntity(T t) {
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
	 * 候选人姓名
	 */
					
	private String houxuanrenxingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 年龄
	 */
					
	private String nianling;
	
	/**
	 * 个人介绍
	 */
					
	private String gerenjieshao;
	
	/**
	 * 赞成票
	 */
					
	private Integer zanchengpiao;
	
	/**
	 * 反对票
	 */
					
	private Integer fanduipiao;
	
	/**
	 * 更新时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date gengxinshijian;
	
	
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
	 * 设置：候选人姓名
	 */
	public void setHouxuanrenxingming(String houxuanrenxingming) {
		this.houxuanrenxingming = houxuanrenxingming;
	}
	/**
	 * 获取：候选人姓名
	 */
	public String getHouxuanrenxingming() {
		return houxuanrenxingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
	/**
	 * 设置：个人介绍
	 */
	public void setGerenjieshao(String gerenjieshao) {
		this.gerenjieshao = gerenjieshao;
	}
	/**
	 * 获取：个人介绍
	 */
	public String getGerenjieshao() {
		return gerenjieshao;
	}
	/**
	 * 设置：赞成票
	 */
	public void setZanchengpiao(Integer zanchengpiao) {
		this.zanchengpiao = zanchengpiao;
	}
	/**
	 * 获取：赞成票
	 */
	public Integer getZanchengpiao() {
		return zanchengpiao;
	}
	/**
	 * 设置：反对票
	 */
	public void setFanduipiao(Integer fanduipiao) {
		this.fanduipiao = fanduipiao;
	}
	/**
	 * 获取：反对票
	 */
	public Integer getFanduipiao() {
		return fanduipiao;
	}
	/**
	 * 设置：更新时间
	 */
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}

}
