package com.jiraynor.board_back.service;

import org.springframework.http.ResponseEntity;

import com.jiraynor.board_back.dto.response.user.GetSignInUserResponseDto;;

public interface UserService {
    
    ResponseEntity <? super GetSignInUserResponseDto> getSignInUser(String email);


}
