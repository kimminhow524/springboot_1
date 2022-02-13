package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.Memberservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
	
	public static void main(String[] args) {
//		Appconfig appconfig=new Appconfig();
//		Memberservice memberservice= appconfig.memberservice();

		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Appconfig.class);
		Memberservice memberservice = applicationContext.getBean("memberService",Memberservice.class);


		Member member= new Member(1L,"memberA",Grade.VIP);
		memberservice.join(member);
		
		Member findMember =memberservice.findMember(1L);
		
		System.out.println("member="+member.getName());
		System.out.println("findMember="+findMember.getName());
		
	}
}
 