package hospital.config;

import hospital.service.ClientDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
//@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private ClientDetailsServiceImpl clientDetailsService;

    // реєструємо реалізацію UserDetailsService та PasswordEncoder для приведення пароля у формат SHA1
    @Autowired
    public void registerGlobalAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(clientDetailsService)
                .passwordEncoder(getShaPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // вмикаємо захист від CSRF атак
        http.csrf()
                .disable()
                // вказуємо правила запитів за якими буде визначатися доступ до ресурсів та інших даних
                .authorizeRequests()
                .antMatchers("/resources/**", "/").permitAll()
                .anyRequest().permitAll()
                .and();

        http.formLogin()
                // задаємо сторінку з формою логіну
                .loginPage("/login")
                // вказуваємо action з форми логіну
                .loginProcessingUrl("/j_spring_security_check")
                // вказуваємо URL при невдалому логіні
                .failureUrl("/login?error")
                // вказуємо параметри логіну і пароля с формы логина
                .usernameParameter("j_username")
                .passwordParameter("j_password")
                // надаємо всім доступ до форми логіна
                .permitAll();

        http.logout()
                // дозволяємо всім робити логаут
                .permitAll()
                // вказуємо Url логаута
                .logoutUrl("/logout")
                // вказуємо Url при вдалому логауті
                .logoutSuccessUrl("/login?logout")
                // робимо не валідною поточну сесію
                .invalidateHttpSession(true);

    }
    // Вказуємо Spring контейнеру, що потрібно ініціалізувати ShaPasswordEncoder
    @Bean
    public ShaPasswordEncoder getShaPasswordEncoder(){
        return new ShaPasswordEncoder();
    }

}