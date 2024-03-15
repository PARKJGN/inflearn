package jpabook.jpashop;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class JpashopApplicationTests {

	@Autowired
	MemberRepository memberRepository;

	@Test
	public void testMember() throws Exception {

	}

}
