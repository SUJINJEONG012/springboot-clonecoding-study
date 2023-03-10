package com.example.demo.config.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.domain.User;

public class PrincipalDetails implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	//User 생성자 만들어주기, PrincipalDetailsService 에서 리턴값으로 userEntity 받아오기 위해
	private User user;
	
	public PrincipalDetails(User user) {
		this.user = user;
	}
		
	
	

	// user 정보를 가져온느 getter메서드
	@Override
	public String getPassword() {
		
		return user.getPassword(); //user의 password
	}

	@Override
	public String getUsername() {
		return user.getUsername(); //user의 username
	}

	// return이 true일때, 정상적으로 로그인 로직이 실행 됨
	@Override //계정이 만료되지 않았는가 ?
	public boolean isAccountNonExpired() {
		return true; // 응, 만료되지 않았음
	}

	@Override //계정이 잠기지 않았는가?
	public boolean isAccountNonLocked() {
		return true; //응, 잠기지 않았어
	}

	@Override // 계정이 잠기지 않았는가?
	public boolean isCredentialsNonExpired() {
	
		return true; //응, 계쩡이 잠기지 않았어
	}

	@Override // 계정이 활성화 되었는가?
	public boolean isEnabled() {
		return true; // 응, 계정이 활성화 되어있음.
	}
	
	
	@Override
	//권한을 가져오는 메서드 (user의 role)
	//유저마다 권한이 1개가 아닐수도 있기 때문에 컬렉션 타입으로 받아야한다.
	public Collection<? extends GrantedAuthority> getAuthorities(){
		// GrantedAuthority 타입으로 받아주기.
		Collection<GrantedAuthority> collector = new ArrayList<>();
		
		//비어있는 권한을 부여해주기
		collector.add(new GrantedAuthority() {
			@Override
			public String getAuthority() {
				return user.getRole();
			}
		});

		return collector;
	}
	
	


}
