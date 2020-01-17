package kr.ngbr.graphql.domain.member;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.leangen.graphql.annotations.GraphQLQuery;
import kr.ngbr.graphql.domain.board.Board;
import kr.ngbr.graphql.domain.groovy.Groovy;
import kr.ngbr.graphql.domain.groovy.GroovyMember;
import kr.ngbr.graphql.model.group.MemberGender;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
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
    @Column(length = 255)
    @GraphQLQuery(name = "password")
    String password;

    ///이름
    @Column
    @GraphQLQuery(name = "name")
    String name;

    ///성별
    @Column
    @GraphQLQuery(name = "gender")
    String gender;

    ///전화번호
    @Column
    @GraphQLQuery(name = "phoneNumber")
    String phoneNumber;

    @Column(nullable = false)
    @CreationTimestamp
    LocalDateTime regDateTime;

    /////////////////////////////////////////////////////////////////////////////////////

    @JsonIgnore
    @OneToMany(mappedBy = "member")
    List<Groovy> groovyList;

    @JsonIgnore
    @OneToMany(mappedBy = "member")
    List<Board> boardList;

    @JsonIgnore
    @OneToMany(mappedBy = "member")
    List<GroovyMember> groovyMemberList;

}
