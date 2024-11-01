package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TongzhihuifuDao;
import com.entity.TongzhihuifuEntity;
import com.service.TongzhihuifuService;
import com.entity.vo.TongzhihuifuVO;
import com.entity.view.TongzhihuifuView;

@Service("tongzhihuifuService")
public class TongzhihuifuServiceImpl extends ServiceImpl<TongzhihuifuDao, TongzhihuifuEntity> implements TongzhihuifuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TongzhihuifuEntity> page = this.selectPage(
                new Query<TongzhihuifuEntity>(params).getPage(),
                new EntityWrapper<TongzhihuifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TongzhihuifuEntity> wrapper) {
		  Page<TongzhihuifuView> page =new Query<TongzhihuifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TongzhihuifuVO> selectListVO(Wrapper<TongzhihuifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TongzhihuifuVO selectVO(Wrapper<TongzhihuifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TongzhihuifuView> selectListView(Wrapper<TongzhihuifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TongzhihuifuView selectView(Wrapper<TongzhihuifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
