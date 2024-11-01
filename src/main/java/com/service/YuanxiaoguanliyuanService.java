package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanxiaoguanliyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanxiaoguanliyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanxiaoguanliyuanView;


/**
 * 院校管理员
 *
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
public interface YuanxiaoguanliyuanService extends IService<YuanxiaoguanliyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanxiaoguanliyuanVO> selectListVO(Wrapper<YuanxiaoguanliyuanEntity> wrapper);
   	
   	YuanxiaoguanliyuanVO selectVO(@Param("ew") Wrapper<YuanxiaoguanliyuanEntity> wrapper);
   	
   	List<YuanxiaoguanliyuanView> selectListView(Wrapper<YuanxiaoguanliyuanEntity> wrapper);
   	
   	YuanxiaoguanliyuanView selectView(@Param("ew") Wrapper<YuanxiaoguanliyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanxiaoguanliyuanEntity> wrapper);
   	
}

