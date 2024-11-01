package com.entity.view;

import com.entity.ToupiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 投票信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
@TableName("toupiaoxinxi")
public class ToupiaoxinxiView  extends ToupiaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ToupiaoxinxiView(){
	}
 
 	public ToupiaoxinxiView(ToupiaoxinxiEntity toupiaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, toupiaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
