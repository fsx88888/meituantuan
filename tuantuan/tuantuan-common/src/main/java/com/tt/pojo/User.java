package com.tt.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("tt_user")
public class User extends BasePojo{

	private Long id;
	private String username;
	private String password;
	private String phone;
	private String email;
}
