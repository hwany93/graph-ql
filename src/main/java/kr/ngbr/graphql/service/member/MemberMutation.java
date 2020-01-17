package kr.ngbr.graphql.service.member;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import io.leangen.graphql.annotations.GraphQLMutation;
import kr.ngbr.graphql.domain.member.Member;
import kr.ngbr.graphql.domain.member.MemberRepository;
import kr.ngbr.graphql.model.group.MemberGender;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

@Component
@AllArgsConstructor
@GraphQLMutation(name = "MemberMutation")
public class MemberMutation implements GraphQLMutationResolver {

    MemberRepository memberRepository;

    public Member register(String id, String password, String name, String phoneNumber, String gender) {
        password = parseSha256(password);
        Member member = Member.builder().identify(id).name(name).password(password).phoneNumber(phoneNumber).gender(gender).build();
        return memberRepository.save(member);
    }


    private static String parseSha256(String password) {
        try {
            MessageDigest sha256;
            sha256 = MessageDigest.getInstance("SHA-256");
            sha256.update(password.getBytes());
            byte[] bytes = sha256.digest();
            StringBuilder builder = new StringBuilder();
            for (byte b : bytes) {
                builder.append(String.format("%02x", b));
            }
            return builder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }


}
