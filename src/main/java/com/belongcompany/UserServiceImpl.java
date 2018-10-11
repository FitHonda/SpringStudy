package com.belongcompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belongcompany.mapper.UserDAOMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAOMapper userDaoMapper;

	@Override
	public User findsss(String id) {
        return userDaoMapper.find(id);
	}

}
