package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DanweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DanweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DanweiView;


/**
 * 单位
 *
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
public interface DanweiService extends IService<DanweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DanweiVO> selectListVO(Wrapper<DanweiEntity> wrapper);
   	
   	DanweiVO selectVO(@Param("ew") Wrapper<DanweiEntity> wrapper);
   	
   	List<DanweiView> selectListView(Wrapper<DanweiEntity> wrapper);
   	
   	DanweiView selectView(@Param("ew") Wrapper<DanweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DanweiEntity> wrapper);
   	
}

