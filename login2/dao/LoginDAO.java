package login2.dao;

import login2.model.UserInfo;

public class LoginDAO {
	public boolean loginChk(UserInfo userInfo) {
		//DB���� �� �Ѿ���� ����� ������ ������ �α��� üũ
		//�� ���������� id�� test�̸� �α��� ����
		//UserInfo�� name�� "ȫ�浿"���� ���� �� true�� ����
		if ("test".equals(userInfo.getId())) {
		    userInfo.setName("ȫ�浿");
		    return true;
		}
		else {
		    return false;
		}
	}
}
