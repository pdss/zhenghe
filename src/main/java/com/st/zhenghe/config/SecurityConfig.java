//package com.st.zhenghe.config;
//
///**
// * @Author: luotao
// * @CreateTime: 2019-03-25 00:36
// * @Description:
// */
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.Md4PasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private MyAuthenticationSuccessHandler myAuthenticationSuccessHandler;
//    @Autowired
//    private MyAuthenticationFailHandler myAuthenticationFailHandler;
//    @Autowired
//    private UserDetailServiceImpl userDetailService;

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/st/test").permitAll()
//                .antMatchers("/swagger-ui.html#/").permitAll()
//                .anyRequest().authenticated();
//        http.formLogin().loginProcessingUrl("/st/login")
//                .successHandler(myAuthenticationSuccessHandler)
//                .failureHandler(myAuthenticationFailHandler)
//                .and().csrf().disable();
//    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailService).passwordEncoder(passwordEncoder());
//    }
//    @Bean
//    PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//    @Bean
//    UserDetailsService myUserDetail(){
//        return new UserDetailServiceImpl();
//    }
//}
