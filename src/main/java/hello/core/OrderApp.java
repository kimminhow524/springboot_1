package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberSeviceimpl;
import hello.core.member.Memberservice;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {
	public static void main(String[] args) {
		Memberservice memberservice=new MemberSeviceimpl();
		OrderService orderService= new OrderServiceImpl();
		
		Long memberId=1L;
		Member member=new Member(memberId, "memberA", Grade.VIP);
		memberservice.join(member);

		
		Order order= orderService.createOrder(memberId, "itemA", 10000);
		System.out.println("order="+order);
	}
}
