package com.oaec.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oaec.mapper.UserMapper;
@Service
public class UserService implements IUser{
  
	@Autowired
	private UserMapper um;
	@Override
	public List<Map<String, Object>> selectUsers() {
		
		return um.selectUsers();
	}

}
