package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanxiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanxiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanxiaoView;


/**
 * 院校
 *
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
public interface YuanxiaoService extends IService<YuanxiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanxiaoVO> selectListVO(Wrapper<YuanxiaoEntity> wrapper);
   	
   	YuanxiaoVO selectVO(@Param("ew") Wrapper<YuanxiaoEntity> wrapper);
   	
   	List<YuanxiaoView> selectListView(Wrapper<YuanxiaoEntity> wrapper);
   	
   	YuanxiaoView selectView(@Param("ew") Wrapper<YuanxiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanxiaoEntity> wrapper);
   	
}

