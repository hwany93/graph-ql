package kr.ngbr.graphql.domain.member;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import io.leangen.graphql.annotations.GraphQLMutation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@GraphQLMutation(name = "MemberMutation")
public class MemberMutation implements GraphQLMutationResolver {

    MemberRepository memberRepository;

    public Member register(String identify){
        Member member = Member.builder().identify(identify).build();
        return memberRepository.save(member);
    }

}
