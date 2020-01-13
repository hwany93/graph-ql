package kr.ngbr.graphql.domain.member;

import graphql.ExecutionResult;

public interface MemberDetails {

    ExecutionResult excute(String query);

}
