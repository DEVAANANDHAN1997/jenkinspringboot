package com.htc.employeeApplication;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeApplicationTests {
public static Logger logger = LoggerFactory.getLogger(EmployeeApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test Case Executing");
		assertEquals(true, true);
	}
}
