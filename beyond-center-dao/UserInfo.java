package com.beyond.model;

import java.io.Serializable;

public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String password;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public UserInfo() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public UserInfo(Integer id, String name, String password, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}

}
