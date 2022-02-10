package hello.core.member;

public class MemberSeviceimpl implements Memberservice {

	private final MemberRepository memberRepository;
	
	public MemberSeviceimpl(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	@Override
	public void join(Member member) {
		memberRepository.save(member);
	}

	@Override
	public Member findMember(Long memberId) {
		return memberRepository.findById(memberId);
	}

}
