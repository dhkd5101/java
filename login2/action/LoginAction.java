package login2.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import login2.dao.LoginDAO;
import login2.model.UserInfo;


public class LoginAction implements Action, Preparable, ModelDriven {
//도메인 오브젝트
UserInfo userInfo;	
public String execute() throws Exception {
	LoginDAO dao = new LoginDAO();		
	if (dao.loginChk(userInfo)) {
		return SUCCESS;
	}
	else {
		return LOGIN;
	}
}	
//Preparable인터페이스의 prepare 구현
public void prepare() throws Exception {
	userInfo = new UserInfo();
}	
//ModelDriven 인터페이스의 getModel 구현
public Object getModel() {
	return userInfo;
}
}
