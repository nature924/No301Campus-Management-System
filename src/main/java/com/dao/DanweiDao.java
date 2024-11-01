package com.dao;

import com.entity.DanweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DanweiVO;
import com.entity.view.DanweiView;


/**
 * 单位
 * 
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
public interface DanweiDao extends BaseMapper<DanweiEntity> {
	
	List<DanweiVO> selectListVO(@Param("ew") Wrapper<DanweiEntity> wrapper);
	
	DanweiVO selectVO(@Param("ew") Wrapper<DanweiEntity> wrapper);
	
	List<DanweiView> selectListView(@Param("ew") Wrapper<DanweiEntity> wrapper);

	List<DanweiView> selectListView(Pagination page,@Param("ew") Wrapper<DanweiEntity> wrapper);
	
	DanweiView selectView(@Param("ew") Wrapper<DanweiEntity> wrapper);
	
}
