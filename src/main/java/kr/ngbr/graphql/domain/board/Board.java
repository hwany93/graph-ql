package kr.ngbr.graphql.domain.board;

import kr.ngbr.graphql.domain.member.Member;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long boardIndex;

    @Column
    long memberIndex;

    @Column(nullable = false)
    String title;

    @Lob
    @Column(length = 512, nullable = false)
    String contents;

    @Column(nullable = false)
    @CreationTimestamp
    LocalDateTime regDateTime;

    ////////////////////////////////////////////////////////////////////////

    @ManyToOne
    @JoinColumn(name = "memberIndex", insertable = false, updatable = false)
    Member member;


}
