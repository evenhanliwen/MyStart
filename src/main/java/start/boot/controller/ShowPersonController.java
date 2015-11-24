package start.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import start.boot.beans.Person;

@Controller
public class ShowPersonController{
	
	@RequestMapping("/showPerson")
    public @ResponseBody Person showPerson() {
        return new Person("levinzhang","levinzhang1981@gmail.com");
    }
	
}