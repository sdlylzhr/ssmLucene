package com.erinic.ssm.service;

import com.erinic.ssm.domain.User;
import com.erinic.ssm.utils.Page;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/3 0003.
 */
public interface UserService {

    public User getUserById(int userId);
    public int createUser(User user) ;
    public User findByLogin(User user) ;
    public Page<User> findByParams(User u, int pageNo, int limit) ;
    int deleteByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(User record);
    int findAllCount(User u) ;
    List<User> findHotUser() ;

    List<User> findAllByQuery(User user) ;

    /**
     * 分页查询
     * @param map
     * @return
     */
    public List<User> list(Map<String,Object> map) ;

    public Long getTotal(Map<String,Object> map);


    /**
     * Shiro的登录验证，通过用户名查询用户信息
     * @param username
     * @return
     */
    public User findUserByUsername(String username) ;
}
