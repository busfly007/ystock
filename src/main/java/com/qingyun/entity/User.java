package com.qingyun.entity;

/**
 * @Description 用户实体类
 * @author 张立增[zhanglizeng] Tel：18860126570
 * @createDate 2019年1月23日 下午3:36:46
 */
public class User {

	private Integer id;
	private String username;
	private String password;
	private String email;     //邮箱
	
	public User() {
		super();
	}

	public User(Integer id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
