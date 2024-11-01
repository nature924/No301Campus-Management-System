package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DanweileibieEntity;
import com.entity.view.DanweileibieView;

import com.service.DanweileibieService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 单位类别
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
@RestController
@RequestMapping("/danweileibie")
public class DanweileibieController {
    @Autowired
    private DanweileibieService danweileibieService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DanweileibieEntity danweileibie, HttpServletRequest request){
        EntityWrapper<DanweileibieEntity> ew = new EntityWrapper<DanweileibieEntity>();
		PageUtils page = danweileibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, danweileibie), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DanweileibieEntity danweileibie, HttpServletRequest request){
        EntityWrapper<DanweileibieEntity> ew = new EntityWrapper<DanweileibieEntity>();
		PageUtils page = danweileibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, danweileibie), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DanweileibieEntity danweileibie){
       	EntityWrapper<DanweileibieEntity> ew = new EntityWrapper<DanweileibieEntity>();
      	ew.allEq(MPUtil.allEQMapPre( danweileibie, "danweileibie")); 
        return R.ok().put("data", danweileibieService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DanweileibieEntity danweileibie){
        EntityWrapper< DanweileibieEntity> ew = new EntityWrapper< DanweileibieEntity>();
 		ew.allEq(MPUtil.allEQMapPre( danweileibie, "danweileibie")); 
		DanweileibieView danweileibieView =  danweileibieService.selectView(ew);
		return R.ok("查询单位类别成功").put("data", danweileibieView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DanweileibieEntity danweileibie = danweileibieService.selectById(id);
        return R.ok().put("data", danweileibie);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DanweileibieEntity danweileibie = danweileibieService.selectById(id);
        return R.ok().put("data", danweileibie);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DanweileibieEntity danweileibie, HttpServletRequest request){
    	danweileibie.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(danweileibie);
        danweileibieService.insert(danweileibie);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DanweileibieEntity danweileibie, HttpServletRequest request){
    	danweileibie.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(danweileibie);
        danweileibieService.insert(danweileibie);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DanweileibieEntity danweileibie, HttpServletRequest request){
        //ValidatorUtils.validateEntity(danweileibie);
        danweileibieService.updateById(danweileibie);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        danweileibieService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DanweileibieEntity> wrapper = new EntityWrapper<DanweileibieEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = danweileibieService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
