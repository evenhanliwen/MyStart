package start.boot.controller;

import start.boot.beans.Department;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DepartmentController{
	
	@RequestMapping("/showDepartment")
    public @ResponseBody Department showDepartment() {
        return new Department("001001","审计局");
    }
}