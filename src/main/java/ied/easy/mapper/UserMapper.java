package ied.easy.mapper;

import ied.easy.bean.Page;
import ied.easy.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by mdh on 2020/3/21.
 */
@Mapper
/**
 * 用户接口
 */
public interface UserMapper {
    // 登录（查询）
    List<User> findList(User user);
    // 注册（添加）
    int insert(User user);

    //分页计数
    int count(Page<User> page);
    // 查询列表信息
    List<User> findPage(Page<User> page);
    User get(Integer id);

    //修改
    int update(User user);

    /**
     * 根据主键删除
     * @param id
     * @return
     */
    int delete(Integer id);

}
