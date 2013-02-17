package org.hyan.action;

import org.hyan.entity.User;
import org.hyan.service.UserService;

import com.opensymphony.xwork2.ActionContext;

public class UserAction {
	private String username;
	private String psd;
	private UserService userService;

	public String execute(){
		String result = "success";
		//List<User> list = userService.findAllUsers();
		User user = new User();
		user.setFirstName(username);
		userService.saveUser(user);
		return result;
	}
	
	public void setUsername(String username) {
		System.out.println("+++++++++++" + username);
		this.username = username;
	}

	public void setPsd(String psd) {
		this.psd = psd;
	}
	
	public void setUserService(UserService userService){
		this.userService = userService;
	}
	
}
