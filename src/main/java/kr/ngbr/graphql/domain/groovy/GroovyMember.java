package kr.ngbr.graphql.domain.groovy;

import kr.ngbr.graphql.domain.member.Member;
import kr.ngbr.graphql.model.group.GroupGrade;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class GroovyMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long groovyMembersIndex;

    @Column
    long groovyIndex;

    @Column
    long memberIndex;

    @Column(nullable = false)
    GroupGrade groupGrade;

    @Column
    String introduce;

    @Column(nullable = false)
    @CreationTimestamp
    LocalDateTime regDateTime;

    ///////////////////////////////////////////////////////////////////////

    @ManyToOne
    @JoinColumn(name = "groovyIndex", insertable = false, updatable = false)
    Groovy groovy;

    @ManyToOne
    @JoinColumn(name = "memberIndex", insertable = false, updatable = false)
    Member member;

}
