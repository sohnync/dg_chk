package dgchk.testPkg.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dgchk.testPkg.service.testHelloWorldService;

@RestController
@RequestMapping("/test")
public class testHellopWorld {

	@Resource(name = "testHelloWorldService")
	private testHelloWorldService testService;
	
	@RequestMapping("/hello.do")
	public @ResponseBody String HelloWorldTest() {
		System.out.println("hello");
		return "Hello World";
	}
	
	@RequestMapping("/testDB.do")
	public @ResponseBody String testDB() throws Exception{
		System.out.println("sddd");
		return testService.testDB();
	}
	
	
}
