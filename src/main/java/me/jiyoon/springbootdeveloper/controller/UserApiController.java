package me.jiyoon.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.jiyoon.springbootdeveloper.dto.AddUserRequest;
import me.jiyoon.springbootdeveloper.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class UserApiController {

    private final UserService userService;

    @PostMapping("/user")
    public String signup(AddUserRequest request) {
        userService.save(request);  // 회원가입 메서드 호출
        return "redirect:/login";   // 회원 가입 완료된 이후에 로그인 페이지로 이동
    }
}
