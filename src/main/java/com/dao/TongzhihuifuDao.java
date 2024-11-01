package com.dao;

import com.entity.TongzhihuifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TongzhihuifuVO;
import com.entity.view.TongzhihuifuView;


/**
 * 通知回复
 * 
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
public interface TongzhihuifuDao extends BaseMapper<TongzhihuifuEntity> {
	
	List<TongzhihuifuVO> selectListVO(@Param("ew") Wrapper<TongzhihuifuEntity> wrapper);
	
	TongzhihuifuVO selectVO(@Param("ew") Wrapper<TongzhihuifuEntity> wrapper);
	
	List<TongzhihuifuView> selectListView(@Param("ew") Wrapper<TongzhihuifuEntity> wrapper);

	List<TongzhihuifuView> selectListView(Pagination page,@Param("ew") Wrapper<TongzhihuifuEntity> wrapper);
	
	TongzhihuifuView selectView(@Param("ew") Wrapper<TongzhihuifuEntity> wrapper);
	
}
