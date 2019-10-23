package com.tt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("tt_area")
public class Area extends BasePojo {
	@TableId(type = IdType.AUTO)
	private Long id;
	private String province;
	private String city;
	private String district;
	
}
