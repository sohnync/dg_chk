package dgchk.testPkg.mapper;

import java.util.List;

import dgchk.testPkg.vo.testHelloWorldVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("testHelloWorldMapper")
public interface testHelloWorldMapper {
	List<testHelloWorldVO> testDB() throws Exception;
	
		
}
