package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TongzhituisongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TongzhituisongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TongzhituisongView;


/**
 * 通知推送
 *
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
public interface TongzhituisongService extends IService<TongzhituisongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TongzhituisongVO> selectListVO(Wrapper<TongzhituisongEntity> wrapper);
   	
   	TongzhituisongVO selectVO(@Param("ew") Wrapper<TongzhituisongEntity> wrapper);
   	
   	List<TongzhituisongView> selectListView(Wrapper<TongzhituisongEntity> wrapper);
   	
   	TongzhituisongView selectView(@Param("ew") Wrapper<TongzhituisongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TongzhituisongEntity> wrapper);
   	
}

