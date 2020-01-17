package kr.ngbr.graphql.domain.groovy;

import kr.ngbr.graphql.domain.interest.Interesting;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class GroovyInterest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long groovyInterestIndex;

    @ManyToOne
    @JoinColumn(name = "groovyIndex", insertable = false, updatable = false)
    Groovy groovy;

    @ManyToOne
    @JoinColumn(name = "interestingIndex", insertable = false, updatable = false)
    Interesting interesting;

}
