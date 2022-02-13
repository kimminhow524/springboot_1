package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberSeviceimpl;
import hello.core.member.Memberservice;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
	public static void main(String[] args) {

//		Appconfig appconfig=new Appconfig();
//		Memberservice memberservice= appconfig.memberService();
//		OrderService orderService= appconfig.orderService();
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Appconfig.class);
		Memberservice memberservice=applicationContext.getBean("memberService",Memberservice.class);
		OrderService orderService=applicationContext.getBean("orderService",OrderService.class);


		Long memberId=1L;
		Member member=new Member(memberId, "memberA", Grade.VIP);
		memberservice.join(member);

		
		Order order= orderService.createOrder(memberId, "itemA", 10000);
		System.out.println("order="+order);
	}
}
