package com.tt.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("tt_comment")
public class Comment extends BasePojo{

	private Long orderId;
	private Long id;
	private String doorComment;
	private String footComment;
	private String images;
	private Integer grade;
}
