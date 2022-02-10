package hello.core.dicount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

	private int disCountPercent=10;
	@Override
	public int discount(Member member, int price) {
		if(member.getGrade()==Grade.VIP) {
			return price * disCountPercent /100;
		}{
			return 0;
			
		}
	}

}
