package controller;

import java.io.IOException;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Auth;
import entity.Dept;
import entity.Role;
import entity.User;
import entity.UserAndRole;
import service.AuthorizationService;

/**
 * 权限设置
 * @author 晓煜
 * @date2018年3月27日上午11:13:20
 * @version
 * @explain
 */
@Controller
public class AuthorizationController {
	@Autowired
	private AuthorizationService authorizationService;
	/**
	 * 添加用户
	 * @param user
	 * @param userAndRole
	 * 
	 */
	@ResponseBody
	@RequestMapping("saveUser.action")
	public User saveUser(User user) {
		User user2=user;
		String password=DigestUtils.md5Hex("ppnn13%dkstFeb.1st");
		user2.setPassword(password);
		authorizationService.saveUser(user2);
		return user2;
	}
	/**
	 * 添加角色
	 * @param role
	 * @return
	 */
	@ResponseBody
	@RequestMapping("saveRole.action")
	public Role saveRole(Role role){
		authorizationService.saveRole(role);
		Role role2=role;
		return role2;
	}
	/**
	 * 添加部门
	 * @param dept
	 * @return
	 */
	@ResponseBody
	@RequestMapping("saveDept.action")
	public Dept saveDept(Dept dept){
		authorizationService.saveDept(dept);
		Dept dept2=dept;
		return dept2;
		
	}
	/**
	 * 查询全部用户
	 * @return
	 */
	@ResponseBody
	@RequestMapping("listUser.action")
	public List<User> listUser() {
		List<User>users=authorizationService.listUser();
		return users;
	}
	/**
	 * 查询角色
	 * @return
	 */
	@ResponseBody
	@RequestMapping("listRole.action")
	public List<Role> listRole(){
		return authorizationService.listRole();
	}
	/**
	 * 查询部门
	 * @return
	 */
	@ResponseBody
	@RequestMapping("listDept.action")
	public List<Dept>listDept(){
		return authorizationService.lisrDept();
	}
	/**
	 * 删除用户
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping("removeUser.action")
	public User removeUser(User user){
		authorizationService.removeUser(user);
		User user2=user;
		return user2;
		
	}
	/**
	 * 删除角色
	 * @param role
	 * @return
	 */
	@ResponseBody
	@RequestMapping("removeRole.action")
	public Role removeRole(Role role){
		authorizationService.removeRole(role);
		Role role2=role;
		return role2;
		
	}
	/**
	 * 删除部门
	 * @param dept
	 * @return
	 */
	@ResponseBody
	@RequestMapping("removeDept.action")
	public Dept removeDept(Dept dept){
		authorizationService.removeDept(dept);
		Dept dept2=dept;
		return dept2;
		
	}
	/**
	 * 修改用户部门
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping("updateUserDept.action")
	public User updateUserDept(User user){
		authorizationService.updateUserDept(user);
		return user;
		
	}
	/**
	 * 修改用户角色
	 * @param userAndRole
	 * @return
	 */
	@ResponseBody
	@RequestMapping("updateUserAndRole.action")
	public UserAndRole updateUserAndRole(UserAndRole userAndRole){
		authorizationService.updateUserAndRole(userAndRole);
		return userAndRole;
		
	}
	/**
	 * 修改用户部门角色
	 * @param userAndRole
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping("updateUserAndRoleAndDept.action")
	public User updateUserAndRoleAndDept(UserAndRole userAndRole,User user){
		authorizationService.updateUserAndRole(userAndRole);
		authorizationService.updateUserDept(user);
		return user;
		
	}
	/**
	 * 点击用户查询用户详细信息，部门，角色，权限
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping("getUserIdDetails.action")
	public User getUserIdDetails(User user){
		User user2=authorizationService.getUserIdDetails(user);
		return user2;
	}
	/**
	 * 查询所有权限信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping("listAuth.action")
	public List<Auth> listAuth() {
		return authorizationService.listAuth();
		
	}
}
