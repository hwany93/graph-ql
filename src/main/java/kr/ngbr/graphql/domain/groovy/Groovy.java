package kr.ngbr.graphql.domain.groovy;

import kr.ngbr.graphql.domain.member.Member;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Groovy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long groovyIndex;

    @Column
    long memberIndex;

    @Column(nullable = false)
    String title;

    @Column(nullable = false)
    @CreationTimestamp
    LocalDateTime regDateTime;

    //////////////////////////////////////////////////////////////////////////////

    @ManyToOne
    @JoinColumn(name = "memberIndex", insertable = false, updatable = false)
    Member member;

    @OneToMany(mappedBy = "groovy")
    private List<GroovyInterest> groovyInterestList;

}
