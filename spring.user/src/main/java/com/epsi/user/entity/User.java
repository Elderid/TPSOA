package com.epsi.user.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="user",catalog = "epsi", uniqueConstraints = {
		@UniqueConstraint(columnNames="USER_LOGIN"),		
		@UniqueConstraint(columnNames = "USER_PASSWORD") })
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public User(){}
	
	public User( String userLogin, String userPassword){
		this.userLogin = userLogin;
		this.userPassword= userPassword;
	}
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="USER_ID", unique=true, nullable=false)
	private Integer userId;	
	
	@Column(name="USER_LOGIN", unique=true, nullable=false, length =10)
	private String userLogin;
	
	@Column(name="USER_PASSWORD", unique=true, nullable=false, length =20)
	private String userPassword;

}
