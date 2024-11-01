package com.dao;

import com.entity.DanweileibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DanweileibieVO;
import com.entity.view.DanweileibieView;


/**
 * 单位类别
 * 
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
public interface DanweileibieDao extends BaseMapper<DanweileibieEntity> {
	
	List<DanweileibieVO> selectListVO(@Param("ew") Wrapper<DanweileibieEntity> wrapper);
	
	DanweileibieVO selectVO(@Param("ew") Wrapper<DanweileibieEntity> wrapper);
	
	List<DanweileibieView> selectListView(@Param("ew") Wrapper<DanweileibieEntity> wrapper);

	List<DanweileibieView> selectListView(Pagination page,@Param("ew") Wrapper<DanweileibieEntity> wrapper);
	
	DanweileibieView selectView(@Param("ew") Wrapper<DanweileibieEntity> wrapper);
	
}
