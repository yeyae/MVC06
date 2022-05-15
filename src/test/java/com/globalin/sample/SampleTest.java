package com.globalin.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })
//RunWith : 스프링 테스트 코드 환경을 실행한다는 의미
@RunWith(SpringJUnit4ClassRunner.class)
//이 어노테이션은 우리가 설정한 스프링 환경설정 파일의 위치를 지정
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//@Log4j // 콘솔에 로그를 남기기 위해 로그 객체를 사용하겠다는 어노테이션

public class SampleTest {
//	@Setter(onMethod_ = {@Autowired})
	@Autowired
	private Restaurant res;

//레스토랑을 달라고 했는데 과연 그 안에 셰프까지 자동 주입해줬는지
	// 테스트 메소드
	@Test
	public void test() {
		// 먼저 레스토랑이 빈으로 잘 등록되었는지
		assertNotNull(res);

		// 레스토랑에서 셰프를 getter를 통해서 가져온 다음 테스ㅡㅌ
		// 셰프도 빈으로 잘 등록되었는지
		assertNotNull(res.getChef());
		// log.info(res);
//		log.info("======================");
//		log.info(res.getChef());
		System.out.println("res");
	}
}
