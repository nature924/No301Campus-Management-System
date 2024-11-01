package com.entity.view;

import com.entity.YuanxiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 院校
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
@TableName("yuanxiao")
public class YuanxiaoView  extends YuanxiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanxiaoView(){
	}
 
 	public YuanxiaoView(YuanxiaoEntity yuanxiaoEntity){
 	try {
			BeanUtils.copyProperties(this, yuanxiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
