package com.dao;

import com.entity.YuanxiaoguanliyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanxiaoguanliyuanVO;
import com.entity.view.YuanxiaoguanliyuanView;


/**
 * 院校管理员
 * 
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
public interface YuanxiaoguanliyuanDao extends BaseMapper<YuanxiaoguanliyuanEntity> {
	
	List<YuanxiaoguanliyuanVO> selectListVO(@Param("ew") Wrapper<YuanxiaoguanliyuanEntity> wrapper);
	
	YuanxiaoguanliyuanVO selectVO(@Param("ew") Wrapper<YuanxiaoguanliyuanEntity> wrapper);
	
	List<YuanxiaoguanliyuanView> selectListView(@Param("ew") Wrapper<YuanxiaoguanliyuanEntity> wrapper);

	List<YuanxiaoguanliyuanView> selectListView(Pagination page,@Param("ew") Wrapper<YuanxiaoguanliyuanEntity> wrapper);
	
	YuanxiaoguanliyuanView selectView(@Param("ew") Wrapper<YuanxiaoguanliyuanEntity> wrapper);
	
}
