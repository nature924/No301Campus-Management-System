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


import com.dao.YuanxiaoDao;
import com.entity.YuanxiaoEntity;
import com.service.YuanxiaoService;
import com.entity.vo.YuanxiaoVO;
import com.entity.view.YuanxiaoView;

@Service("yuanxiaoService")
public class YuanxiaoServiceImpl extends ServiceImpl<YuanxiaoDao, YuanxiaoEntity> implements YuanxiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanxiaoEntity> page = this.selectPage(
                new Query<YuanxiaoEntity>(params).getPage(),
                new EntityWrapper<YuanxiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanxiaoEntity> wrapper) {
		  Page<YuanxiaoView> page =new Query<YuanxiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanxiaoVO> selectListVO(Wrapper<YuanxiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanxiaoVO selectVO(Wrapper<YuanxiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanxiaoView> selectListView(Wrapper<YuanxiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanxiaoView selectView(Wrapper<YuanxiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
