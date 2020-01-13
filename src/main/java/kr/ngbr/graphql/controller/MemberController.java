package kr.ngbr.graphql.controller;

import graphql.ExecutionResult;
import kr.ngbr.graphql.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@AllArgsConstructor
public class MemberController {

    MemberService memberService;

    @PostMapping(value = "/member")
    public ResponseEntity<Object> getMembersByQuery(@RequestBody String query){
        ExecutionResult executionResult = memberService.excute(query);
        return new ResponseEntity<>(executionResult, HttpStatus.OK);
    }

}
