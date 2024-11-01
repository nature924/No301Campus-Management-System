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


import com.dao.TongzhituisongDao;
import com.entity.TongzhituisongEntity;
import com.service.TongzhituisongService;
import com.entity.vo.TongzhituisongVO;
import com.entity.view.TongzhituisongView;

@Service("tongzhituisongService")
public class TongzhituisongServiceImpl extends ServiceImpl<TongzhituisongDao, TongzhituisongEntity> implements TongzhituisongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TongzhituisongEntity> page = this.selectPage(
                new Query<TongzhituisongEntity>(params).getPage(),
                new EntityWrapper<TongzhituisongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TongzhituisongEntity> wrapper) {
		  Page<TongzhituisongView> page =new Query<TongzhituisongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TongzhituisongVO> selectListVO(Wrapper<TongzhituisongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TongzhituisongVO selectVO(Wrapper<TongzhituisongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TongzhituisongView> selectListView(Wrapper<TongzhituisongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TongzhituisongView selectView(Wrapper<TongzhituisongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
