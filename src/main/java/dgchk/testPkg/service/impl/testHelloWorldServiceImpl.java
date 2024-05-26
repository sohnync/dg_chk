package dgchk.testPkg.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dgchk.testPkg.mapper.testHelloWorldMapper;
import dgchk.testPkg.service.testHelloWorldService;
import dgchk.testPkg.vo.testHelloWorldVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("testHelloWorldService")
public class testHelloWorldServiceImpl extends EgovAbstractServiceImpl implements testHelloWorldService {
	
	@Resource(name="testHelloWorldMapper")
	private testHelloWorldMapper testMapper;
	
	
	@Override
	public String testDB() throws Exception {
		
		List<testHelloWorldVO> data = testMapper.testDB();
		return data.get(0).getTest();
	}

}
