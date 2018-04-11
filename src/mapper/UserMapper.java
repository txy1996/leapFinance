package mapper;


import java.util.List;

import entity.Auth;
import entity.User;



import org.apache.ibatis.annotations.Param;

import entity.User;


/**
 * 用户表的接口类
 * @author 晓煜
 * @date2018年3月26日下午3:57:51
 * @version
 * @explain
 */
public interface UserMapper {
	/**
	 * 添加用户
	 * @param user 用户实体对象
	 *
	 */
	public void saveUser(User user);
	/**
	 * 删除用户
	 * @param user 用户实体对象
	 */
	public void removeUser(User user);
	/**
	 * 查询当前用户状态
	 * @param user 用户实体对象
	 * @return user.locked,状态为2代表锁定，不可对当前用户执行删除等改变操作
	 */
	public User getUserLocked(User user);
	/**
	 * 修改当前用户的所属部门
	 * @param user 用户实体对象
	 */
	public void updateUserDept(User user);
	/**
	 * 查询当前用户是否存在，用于登陆验证授权
	 * @param user 用户实体对象
	 * @return  登陆需要的一切信息，权限，角色
	 */
	public User getUserNameAndPassword(User user);
	/**
	 * 修改当前用户的密码
	 * @param user 用户实体对象，传入需要的数据
	 */
	public void updateUserPassword(User user);
	/**
	 * 查询当前用户的id
	 * @param user 用户实体对象
	 * @return 当前用户id
	 */
	public User getUserId(User user);
	/**
	 * 查询用户详细信息
	 * @param user
	 * @return
	 */
	public User getUserIdDetails(User user);
	/**
	 * 查询所有用户的的信息
	 * @return 返回用户实体对象的集合
	 */
	public List<User> listUser();
	
	public User findUserNameAndPwd(@Param(value="username")String username,@Param(value="password")String password);
	public List<Auth> findAuthName(String username);
}
