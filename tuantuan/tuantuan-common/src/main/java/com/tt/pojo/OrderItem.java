package com.tt.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("tt_order_item")
public class OrderItem extends BasePojo{

	private String itemId;
	private String orderId;
	private Integer num;
	private String title;
	private Long price;
	private String totalFee;
	private String picPath;
}
