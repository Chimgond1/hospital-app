package hospital_app.controller.user;

import hospital_app.dao.imp.UserDaoImp;
import hospital_app.dto.User;
import hospital_app.service.imp.AddressServiceImp;
import hospital_app.service.imp.UserServiceImp;

public class TestSaveUserController {
	public static void main(String[] args) {
		User user=new User();
		user.setName("deeksha");
		user.setEmail("deeksha@gmail.com");
		user.setPassword("deeksha@123");
		user.setRole(" on-duty doctor");
		
		UserServiceImp userService=new UserServiceImp();
		User user2=userService.saveUser(user);
		if(user2!=null) {
			System.out.println("user data is saved");
		}else {
			System.out.println("user data is not saves");
		}
	}

}
