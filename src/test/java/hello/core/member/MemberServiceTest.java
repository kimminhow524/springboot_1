package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

	Memberservice memberservice =new MemberSeviceimpl();

	@Test
	void join() {
	Member member=new Member(1L, "memberA", Grade.VIP);
	
	memberservice.join(member);
	Member findMember =memberservice.findMember(1L);
	
	Assertions.assertThat(member).isEqualTo(findMember);
	
		}
}
