package kr.ngbr.graphql.controller;

import kr.ngbr.graphql.domain.member.MemberQuery;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@AllArgsConstructor
public class MemberController {

    MemberQuery memberQuery;

    /*@PostMapping(value = "/member")
    public ResponseEntity<Object> getMembersByQuery(@RequestBody String query){

        return new ResponseEntity<>(executionResult, HttpStatus.OK);
    }*/

}
