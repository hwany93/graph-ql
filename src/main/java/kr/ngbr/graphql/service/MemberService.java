package kr.ngbr.graphql.service;

import graphql.ExecutionResult;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import kr.ngbr.graphql.domain.member.MemberDetails;
import kr.ngbr.graphql.domain.member.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@GraphQLApi
public class MemberService {

    private MemberDetails memberDetails;

    MemberRepository memberRepository;

    @GraphQLQuery(name = "members")
    public List getMembers(){
        return memberRepository.findAll();
    }


}
