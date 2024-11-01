package com.dao;

import com.entity.TongzhituisongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TongzhituisongVO;
import com.entity.view.TongzhituisongView;


/**
 * 通知推送
 * 
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
public interface TongzhituisongDao extends BaseMapper<TongzhituisongEntity> {
	
	List<TongzhituisongVO> selectListVO(@Param("ew") Wrapper<TongzhituisongEntity> wrapper);
	
	TongzhituisongVO selectVO(@Param("ew") Wrapper<TongzhituisongEntity> wrapper);
	
	List<TongzhituisongView> selectListView(@Param("ew") Wrapper<TongzhituisongEntity> wrapper);

	List<TongzhituisongView> selectListView(Pagination page,@Param("ew") Wrapper<TongzhituisongEntity> wrapper);
	
	TongzhituisongView selectView(@Param("ew") Wrapper<TongzhituisongEntity> wrapper);
	
}
