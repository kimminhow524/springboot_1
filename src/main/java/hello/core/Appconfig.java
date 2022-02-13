package hello.core;

import hello.core.dicount.DiscountPolicy;
import hello.core.dicount.FixDiscountPolicy;
import hello.core.dicount.RateDiscountPolicy;
import hello.core.member.MemberSeviceimpl;
import hello.core.member.Memberservice;
import hello.core.member.MemoryrMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

	@Bean
	public Memberservice memberService() {
		return new MemberSeviceimpl(memberRepository());
	}

	@Bean
	public MemoryrMemberRepository memberRepository() {
		return new MemoryrMemberRepository();
	}

	@Bean
	public OrderService orderService() {
		return new OrderServiceImpl( memberRepository(), discountPolicy());
	}

	@Bean
	public DiscountPolicy discountPolicy() {
		return new RateDiscountPolicy();
//		return new FixDiscountPolicy()
	}
}


