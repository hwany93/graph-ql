package kr.ngbr.graphql.model.group;

public enum GroupGrade{

    NEWBIE(1), REGULAR(2), MASTER(3);

    int grade;

    GroupGrade(int grade) {
        this.grade = grade;
    }
}
