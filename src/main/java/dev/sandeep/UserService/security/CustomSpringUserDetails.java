package dev.sandeep.UserService.security;

import dev.sandeep.UserService.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class CustomSpringUserDetails implements UserDetails {
    private User user;

    public CustomSpringUserDetails(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}


/*
https://accounts.google.com/o/oauth2/auth/oauthchooseaccount?access_type=offline&client_id=331221439469-cck96vlpggojbrd35h8ahaqkccngrsc9.apps.googleusercontent.com&redirect_uri=https%3A%2F%2Fwww.scaler.com%2Fusers%2Fauth%2Fgoogle_oauth2%2Fcallback&response_type=code&scope=email%20profile&state=cb8d416fa84318599881fbba230303651110ff526004d66f&service=lso&o2v=1&theme=glif&flowName=GeneralOAuthFlow
 */