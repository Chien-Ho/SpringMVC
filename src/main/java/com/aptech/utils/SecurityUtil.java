package com.aptech.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import com.aptech.dto.MyUser;

public class SecurityUtil {
	
	public static MyUser getPrincipal() {
		MyUser myUser = (MyUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return myUser;
		
	}
	public static List<String> getAuthorities() {
		// get roles
	
		List<String> result = new ArrayList<String>();
		@SuppressWarnings("unchecked")
		List<GrantedAuthority> authorities = (List<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		for(GrantedAuthority authority : authorities) {
			result.add(authority.getAuthority());
		}
		return result;
		
	}

}
