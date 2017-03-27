package com.example.dao;

import com.example.annotation.MyBatisDao;
import com.example.base.CrudDao;
import com.example.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2017/3/23.
 */
@MyBatisDao
public interface UserDao extends CrudDao<User> {
    /**
     * 保存用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 获取所有用户列表
     * @return
     */
    List<User> listAllUser();

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    /**
     * 更新用户的信息
     * @param user
     */
    int updateUser(User user);

    /**
     * 根据id删除指定的用户
     * @param id
     */
    void deleteUserById(@Param("id") Integer id);

    /**
     * 批量添加用户
     * @param list
     */
    void batchSaveUser(List<User> list);

    /**
     * 批量删除用户
     * @param ids
     */
    void batchDeleteUser(String[] ids);

}
