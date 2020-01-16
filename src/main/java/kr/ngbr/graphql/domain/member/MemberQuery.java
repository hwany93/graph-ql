package kr.ngbr.graphql.domain.member;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.print.Pageable;
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
