package pe.idat.security;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if("alumno".equals(username)) {
			return new User("alumno", new  BCryptPasswordEncoder().encode("12345"), new ArrayList<>());
		}else {
			throw new UsernameNotFoundException("Alumno no Existe" + username);
		}
		
	}

}
