package org.hanfeng.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.hanfeng.entity.Student;
import org.hanfeng.service.StudentService;

public class StudentAction {
	private StudentService studentService;

	public String execute(){
		String result = "success";
		//List<User> list = userService.findAllUsers();
		Student stu = new Student();
		HttpServletRequest request = ServletActionContext.getRequest();
		stu.setSName((String)request.getAttribute("stuName"));
		studentService.save(stu);
		return result;
	}

	/**
	 * @param stuService the stuService to set
	 */
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
}
