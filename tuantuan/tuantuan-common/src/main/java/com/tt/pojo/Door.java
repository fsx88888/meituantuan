package com.tt.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("tt_door")
public class Door extends BasePojo{

	private Long id;
	private Long doorCatId;
	private Long areaId;
	private String doorName;
	private Integer status;
	private String addr;
	private String tel;
}
