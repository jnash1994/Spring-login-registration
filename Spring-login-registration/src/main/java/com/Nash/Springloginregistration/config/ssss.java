package com.Nash.Springloginregistration.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashMap;
import java.util.Map;

public class ssss {
    public static void main(String[] args) {
        PasswordEncoder pe=new BCryptPasswordEncoder();
        String ecode = pe.encode("1234");
        System.out.println(ecode);
        boolean matches = pe.matches("1234",ecode);
        System.out.println(matches);
        System.out.println("------------------------------------------------------");
        String ecode2 = pe.encode("1234");
        System.out.println(ecode2);
        boolean matches2 = pe.matches("1234",ecode2);
        System.out.println(matches2);




    }


}
