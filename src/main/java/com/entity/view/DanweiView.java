package com.entity.view;

import com.entity.DanweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 单位
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
@TableName("danwei")
public class DanweiView  extends DanweiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DanweiView(){
	}
 
 	public DanweiView(DanweiEntity danweiEntity){
 	try {
			BeanUtils.copyProperties(this, danweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
