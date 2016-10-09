package hospital.service;

import hospital.entity.Client;
import hospital.entity.ClientRoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ClientDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private ClientService clientService;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        // з допомогою сервісу отримуємо екземпляр клієнта
        Client client = clientService.findByLogin(login);
        // задаємо ролі для корисувача
        Set<GrantedAuthority> roles = new HashSet();
        roles.add(new SimpleGrantedAuthority(ClientRoleEnum.USER.name()));
        // на основі отриманих даних формуємо об'єкт UserDetails, який дозволить перевірити
        // введений користувачем логін і пароль і потім ідентифікувати коистувача
        UserDetails clientDetails = new org.springframework.security.core.userdetails.User(
                client.getLogin(), client.getPassword(), roles);
        return clientDetails;
    }
}