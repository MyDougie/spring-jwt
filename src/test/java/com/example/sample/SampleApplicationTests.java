package com.example.sample;

import com.example.sample.service.TieRsltPickWcsRRepository;
import com.example.sample.vo.TieRsltPickWcsRVO;
import io.jsonwebtoken.lang.Assert;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
class SampleApplicationTests {

	@Autowired
	TieRsltPickWcsRRepository tieRsltPickWcsRRepository;

	@Test
	void contextLoads() {
	}


	@Test
	public void findAll() {

		List<TieRsltPickWcsRVO> list = tieRsltPickWcsRRepository.findAll();
		Assert.notNull(list, "list is empty");

		log.info("size : {}", list.size());
	}

}
