package kr.ngbr.graphql.service.member;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import kr.ngbr.graphql.domain.member.Member;
import kr.ngbr.graphql.domain.member.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class MemberQuery implements GraphQLQueryResolver {

    private MemberRepository memberRepository;

    public List<Member> getMembers(int count, int offset){
        return memberRepository.findAll();
    }

    public Optional<Member> getMember(Long memberIndex){
        return memberRepository.findById(memberIndex);
    }



}
