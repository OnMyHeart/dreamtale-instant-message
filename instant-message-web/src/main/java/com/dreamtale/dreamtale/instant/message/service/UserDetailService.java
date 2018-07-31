//package com.dreamtale.dreamtale.instant.message.service;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//@Service(value = "userDetailService")
//public class UserDetailService implements UserDetailsService {
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserDetails userDetails = new UserDetails() {
//            @Override
//            public Collection<? extends GrantedAuthority> getAuthorities() {
//                List<GrantedAuthority> list = new ArrayList<>();
//                GrantedAuthority grantedAuthority = new GrantedAuthority() {
//                    @Override
//                    public String getAuthority() {
//                        return "USER";
//                    }
//                };
//                list.add(grantedAuthority);
//                return list;
//            }
//
//            @Override
//            public String getPassword() {
//                return "user";
//            }
//
//            @Override
//            public String getUsername() {
//                return "user";
//            }
//
//            @Override
//            public boolean isAccountNonExpired() {
//                return true;
//            }
//
//            @Override
//            public boolean isAccountNonLocked() {
//                return true;
//            }
//
//            @Override
//            public boolean isCredentialsNonExpired() {
//                return true;
//            }
//
//            @Override
//            public boolean isEnabled() {
//                return true;
//            }
//        };
//        return userDetails;
//    }
//}
