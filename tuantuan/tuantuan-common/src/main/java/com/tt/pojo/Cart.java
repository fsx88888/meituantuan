package com.tt.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("tt_cart")
public class Cart extends BasePojo {
	private Long id;
	private Long userId;
	private Long itemId;
	private String itemTitle;
	private String itemImage;
	private Long itemPrice;
	private Integer num;

}
