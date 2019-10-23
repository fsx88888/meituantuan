package com.tt.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("tt_item_desc")
public class ItemDesc extends BasePojo{

	private Long itemId;
	private String itemDesc;
	
	
}
