package com.example.minitp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.minitp.repositry.ParentRepo;
import com.example.minitp.repositry.UserRepo;
@Service
public class ParentService {
	@Autowired
	ParentRepo userrepo;
}
