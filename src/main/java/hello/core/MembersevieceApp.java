package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberSeviceimpl;
import hello.core.member.Memberservice;

public class MembersevieceApp {
	
	public static void main(String[] args) {
		Memberservice memberservice;
		Member member= new Member(1L,"memberA",Grade.VIP);
		memberservice.join(member);
		
		Member findMember =memberservice.findMember(1L);
		
		System.out.println("member="+member.getName());
		System.out.println("findMember="+findMember.getName());
		
	}
}
 