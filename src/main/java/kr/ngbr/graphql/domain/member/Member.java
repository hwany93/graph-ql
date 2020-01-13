package kr.ngbr.graphql.domain.member;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long memberIndex;

    ///아이디
    @Column(length = 30, unique = true)
    String identify;

    ///비밀번호
    @Column(length = 50)
    String password;

    @Column
    String name;

    @Column
    String gender;

    @Column
    String phoneNumber;

}
