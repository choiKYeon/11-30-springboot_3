package com.std.sbb;

import com.std.sbb.article.service.ArticleService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
class SbbApplicationTests {
	@Autowired
	private ArticleService articleService;

	@Test
	@DisplayName("스트림 데이터 넣기")
	void contextLoads() {
		IntStream.rangeClosed(3, 300)
				.forEach(no -> articleService.create("테스트 %d 번 제목입니다.".formatted(no), "테스트 %d 번 내용입니다.".formatted(no), null));
	}

}
