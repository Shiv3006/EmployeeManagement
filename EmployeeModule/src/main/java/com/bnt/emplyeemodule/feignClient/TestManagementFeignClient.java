
package com.bnt.emplyeemodule.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bnt.emplyeemodule.dto.TestResponse;

@FeignClient(name = "TestManagementFeignClient", url = "http://localhost:8080/testmanagement/api/v1/tests")
public interface TestManagementFeignClient {
	@GetMapping("/{testId}")
	ResponseEntity<TestResponse> getTestById(@PathVariable("testId") Long testId);
}