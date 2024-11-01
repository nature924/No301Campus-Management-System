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


import com.dao.YuanxiaoguanliyuanDao;
import com.entity.YuanxiaoguanliyuanEntity;
import com.service.YuanxiaoguanliyuanService;
import com.entity.vo.YuanxiaoguanliyuanVO;
import com.entity.view.YuanxiaoguanliyuanView;

@Service("yuanxiaoguanliyuanService")
public class YuanxiaoguanliyuanServiceImpl extends ServiceImpl<YuanxiaoguanliyuanDao, YuanxiaoguanliyuanEntity> implements YuanxiaoguanliyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanxiaoguanliyuanEntity> page = this.selectPage(
                new Query<YuanxiaoguanliyuanEntity>(params).getPage(),
                new EntityWrapper<YuanxiaoguanliyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanxiaoguanliyuanEntity> wrapper) {
		  Page<YuanxiaoguanliyuanView> page =new Query<YuanxiaoguanliyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanxiaoguanliyuanVO> selectListVO(Wrapper<YuanxiaoguanliyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanxiaoguanliyuanVO selectVO(Wrapper<YuanxiaoguanliyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanxiaoguanliyuanView> selectListView(Wrapper<YuanxiaoguanliyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanxiaoguanliyuanView selectView(Wrapper<YuanxiaoguanliyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
