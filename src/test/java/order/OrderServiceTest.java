package order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberSeviceimpl;
import hello.core.member.Memberservice;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderServiceTest {
	Memberservice memberservice=new MemberSeviceimpl();
	OrderService orderService= new OrderServiceImpl();
	
	@Test
	void createOrder() {
		
		Long memberId=1L;
		Member member=new Member(memberId, "memberA", Grade.VIP);
		memberservice.join(member);
		
		
		Order order= orderService.createOrder(memberId, "itemA", 10000);

		Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
		
	}
}
