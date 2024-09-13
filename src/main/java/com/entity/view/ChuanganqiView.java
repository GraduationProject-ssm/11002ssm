package com.entity.view;

import com.entity.ChuanganqiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 传感器
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-05 11:57:46
 */
@TableName("chuanganqi")
public class ChuanganqiView  extends ChuanganqiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChuanganqiView(){
	}
 
 	public ChuanganqiView(ChuanganqiEntity chuanganqiEntity){
 	try {
			BeanUtils.copyProperties(this, chuanganqiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}