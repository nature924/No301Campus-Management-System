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


import com.dao.DanweileibieDao;
import com.entity.DanweileibieEntity;
import com.service.DanweileibieService;
import com.entity.vo.DanweileibieVO;
import com.entity.view.DanweileibieView;

@Service("danweileibieService")
public class DanweileibieServiceImpl extends ServiceImpl<DanweileibieDao, DanweileibieEntity> implements DanweileibieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DanweileibieEntity> page = this.selectPage(
                new Query<DanweileibieEntity>(params).getPage(),
                new EntityWrapper<DanweileibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DanweileibieEntity> wrapper) {
		  Page<DanweileibieView> page =new Query<DanweileibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DanweileibieVO> selectListVO(Wrapper<DanweileibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DanweileibieVO selectVO(Wrapper<DanweileibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DanweileibieView> selectListView(Wrapper<DanweileibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DanweileibieView selectView(Wrapper<DanweileibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
