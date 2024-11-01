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


import com.dao.DanweiDao;
import com.entity.DanweiEntity;
import com.service.DanweiService;
import com.entity.vo.DanweiVO;
import com.entity.view.DanweiView;

@Service("danweiService")
public class DanweiServiceImpl extends ServiceImpl<DanweiDao, DanweiEntity> implements DanweiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DanweiEntity> page = this.selectPage(
                new Query<DanweiEntity>(params).getPage(),
                new EntityWrapper<DanweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DanweiEntity> wrapper) {
		  Page<DanweiView> page =new Query<DanweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DanweiVO> selectListVO(Wrapper<DanweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DanweiVO selectVO(Wrapper<DanweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DanweiView> selectListView(Wrapper<DanweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DanweiView selectView(Wrapper<DanweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
