package kr.ngbr.graphql.domain.member;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class MemberDataFetcher {

    private MemberRepository memberRepository;

    public DataFetcher<?> allMembers() {
        return members -> memberRepository.findAll();
    }

    public DataFetcher<?> member() {
        return member -> {
            long index = member.getArgument("memberIndex");
            return memberRepository.findById(index);
        };
    }

}
