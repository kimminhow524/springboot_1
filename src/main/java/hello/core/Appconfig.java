package hello.core;

import hello.core.dicount.FixDiscountPolicy;
import hello.core.member.MemberSeviceimpl;
import hello.core.member.Memberservice;
import hello.core.member.MemoryrMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class Appconfig {
	public Memberservice memberservice() {
		return new MemberSeviceimpl(new MemoryrMemberRepository());
	}
	
	public OrderService orderService() {
		
		return new OrderServiceImpl(
				new MemoryrMemberRepository(), new FixDiscountPolicy());
	}
}
