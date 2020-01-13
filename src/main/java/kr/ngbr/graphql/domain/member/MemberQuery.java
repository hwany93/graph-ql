package kr.ngbr.graphql.domain.member;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MemberQuery implements GraphQLQueryResolver {

    private MemberRepository memberRepository;



}
