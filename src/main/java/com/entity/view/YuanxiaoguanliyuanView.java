package com.entity.view;

import com.entity.YuanxiaoguanliyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 院校管理员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
@TableName("yuanxiaoguanliyuan")
public class YuanxiaoguanliyuanView  extends YuanxiaoguanliyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanxiaoguanliyuanView(){
	}
 
 	public YuanxiaoguanliyuanView(YuanxiaoguanliyuanEntity yuanxiaoguanliyuanEntity){
 	try {
			BeanUtils.copyProperties(this, yuanxiaoguanliyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
