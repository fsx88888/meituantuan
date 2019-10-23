package com.tt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("tt_door_cat")
public class DoorCat extends BasePojo{
	@TableId(type = IdType.AUTO)
	private Long id;
	private Long praentId;
	private String name;
	private int status;
	private int sortOrder;
	private boolean isParent;
}
