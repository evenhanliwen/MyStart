package start.boot.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import start.boot.beans.User;
import start.boot.dao.UserDao;

@Controller
public class UserController{
	@Resource
	UserDao userDao;
	

	@RequestMapping("/get-by-email")
    public @ResponseBody User getByEmail(String email) {
		User user = userDao.findByEmail(email);
        return user;
    }
}