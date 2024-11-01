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

import com.entity.TongzhituisongEntity;
import com.entity.view.TongzhituisongView;

import com.service.TongzhituisongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 通知推送
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-09 11:06:58
 */
@RestController
@RequestMapping("/tongzhituisong")
public class TongzhituisongController {
    @Autowired
    private TongzhituisongService tongzhituisongService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TongzhituisongEntity tongzhituisong, HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuanxiaoguanliyuan")) {
			tongzhituisong.setYuanxiaozhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			tongzhituisong.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TongzhituisongEntity> ew = new EntityWrapper<TongzhituisongEntity>();
		PageUtils page = tongzhituisongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tongzhituisong), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TongzhituisongEntity tongzhituisong, HttpServletRequest request){
        EntityWrapper<TongzhituisongEntity> ew = new EntityWrapper<TongzhituisongEntity>();
		PageUtils page = tongzhituisongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tongzhituisong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TongzhituisongEntity tongzhituisong){
       	EntityWrapper<TongzhituisongEntity> ew = new EntityWrapper<TongzhituisongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tongzhituisong, "tongzhituisong")); 
        return R.ok().put("data", tongzhituisongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TongzhituisongEntity tongzhituisong){
        EntityWrapper< TongzhituisongEntity> ew = new EntityWrapper< TongzhituisongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tongzhituisong, "tongzhituisong")); 
		TongzhituisongView tongzhituisongView =  tongzhituisongService.selectView(ew);
		return R.ok("查询通知推送成功").put("data", tongzhituisongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TongzhituisongEntity tongzhituisong = tongzhituisongService.selectById(id);
        return R.ok().put("data", tongzhituisong);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TongzhituisongEntity tongzhituisong = tongzhituisongService.selectById(id);
        return R.ok().put("data", tongzhituisong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TongzhituisongEntity tongzhituisong, HttpServletRequest request){
    	tongzhituisong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tongzhituisong);
        tongzhituisongService.insert(tongzhituisong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TongzhituisongEntity tongzhituisong, HttpServletRequest request){
    	tongzhituisong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tongzhituisong);
        tongzhituisongService.insert(tongzhituisong);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TongzhituisongEntity tongzhituisong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tongzhituisong);
        tongzhituisongService.updateById(tongzhituisong);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tongzhituisongService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<TongzhituisongEntity> wrapper = new EntityWrapper<TongzhituisongEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuanxiaoguanliyuan")) {
			wrapper.eq("yuanxiaozhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = tongzhituisongService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
