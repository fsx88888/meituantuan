package com.tt.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("tt_order")
public class Order extends BasePojo{

	private String orderId;
	private String payment;
	private Integer paymentType;
	private Long userId;
	private String buyerMessage;
	private String buyerNick;
	private Integer buyerRate;
	private Date endTime;
	private Date closeTime;	
}
