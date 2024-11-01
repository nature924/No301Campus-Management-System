package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DanweileibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DanweileibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DanweileibieView;


/**
 * 单位类别
 *
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
public interface DanweileibieService extends IService<DanweileibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DanweileibieVO> selectListVO(Wrapper<DanweileibieEntity> wrapper);
   	
   	DanweileibieVO selectVO(@Param("ew") Wrapper<DanweileibieEntity> wrapper);
   	
   	List<DanweileibieView> selectListView(Wrapper<DanweileibieEntity> wrapper);
   	
   	DanweileibieView selectView(@Param("ew") Wrapper<DanweileibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DanweileibieEntity> wrapper);
   	
}

