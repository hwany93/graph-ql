package kr.ngbr.graphql.model.group;

public enum MemberGender {

    MALE("남자"), FEMALE("여자");

    private String name;

    MemberGender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
