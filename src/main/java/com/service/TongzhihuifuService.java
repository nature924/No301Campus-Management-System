package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TongzhihuifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TongzhihuifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TongzhihuifuView;


/**
 * 通知回复
 *
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
public interface TongzhihuifuService extends IService<TongzhihuifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TongzhihuifuVO> selectListVO(Wrapper<TongzhihuifuEntity> wrapper);
   	
   	TongzhihuifuVO selectVO(@Param("ew") Wrapper<TongzhihuifuEntity> wrapper);
   	
   	List<TongzhihuifuView> selectListView(Wrapper<TongzhihuifuEntity> wrapper);
   	
   	TongzhihuifuView selectView(@Param("ew") Wrapper<TongzhihuifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TongzhihuifuEntity> wrapper);
   	
}

