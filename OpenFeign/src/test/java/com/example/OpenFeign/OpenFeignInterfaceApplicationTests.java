package com.example.OpenFeign;

import com.example.OpenFeign.controller.dto.SearchMgniRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OpenFeignInterfaceApplicationTests {

	@Autowired
	private OpenFeign openFeign;
	@Test
	void contextLoads() throws JsonProcessingException {

		openFeign.getAllMgni();

		//---------------------------------------------------------------------------------------------

		SearchMgniRequest request=new SearchMgniRequest(null,"1","TWD","20221019");
		openFeign.searchTargetMgni(request);
	}

}
