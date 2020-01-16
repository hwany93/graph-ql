package kr.ngbr.graphql.domain.member;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GraphQLQuery(name = "memberIndex")
    long memberIndex;

    ///아이디
    @Column(length = 30, unique = true)
    @GraphQLQuery(name = "identify")
    String identify;

    ///비밀번호
    @Column(length = 50)
    @GraphQLQuery(name = "password")
    String password;

    @Column
    @GraphQLQuery(name = "name")
    String name;

    @Column
    @GraphQLQuery(name = "gender")
    String gender;

    @Column
    @GraphQLQuery(name = "phoneNumber")
    String phoneNumber;

}
