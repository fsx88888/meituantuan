package com.tt.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("tt_item")
public class Item extends BasePojo{

	private Long id;
	private String title;
	private String sellPoint;
	private Integer doorId;
	private Long price;
	private Integer num;
	private String barcode;
	private String image;
	private Integer status;
	
}
