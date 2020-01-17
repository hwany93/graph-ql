package kr.ngbr.graphql.domain.interest;

import kr.ngbr.graphql.domain.groovy.GroovyInterest;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Interesting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int interestingIndex;

    @Column(nullable = false, length = 50)
    String title;

    @Column(nullable = false, length = 200)
    String subscribe;

    @Column(nullable = false)
    @CreationTimestamp
    LocalDateTime regDateTime;

    @OneToMany(mappedBy = "interesting")
    private List<GroovyInterest> groovyInterests;


}
