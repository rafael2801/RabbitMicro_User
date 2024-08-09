package com.ms.user.controller;

import com.ms.user.DTOs.UserRecordDto;
import com.ms.user.models.UserModel;
import com.ms.user.services.UserServices;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserServices userServices;

    @PostMapping
    public ResponseEntity<UserModel> save (@RequestBody @Valid UserRecordDto userRecordDto) {

        UserModel userModel = new UserModel();

        BeanUtils.copyProperties(userRecordDto, userModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(userServices.save(userModel));
    }
}
