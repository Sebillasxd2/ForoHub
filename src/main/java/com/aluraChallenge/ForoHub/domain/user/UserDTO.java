package com.aluraChallenge.ForoHub.domain.user;
import com.aluraChallenge.ForoHub.domain.rol.Rol;
import com.aluraChallenge.ForoHub.domain.topico.Topico;
import com.aluraChallenge.ForoHub.domain.user.User;

public record UserDTO(Long Id, String username, String email, Rol rol, Integer numTopicosCreated, String[] topicosCreated, Integer numComments) {

    public UserDTO(User user) {
        this(user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getRol(),
                user.getNumTopicosCreated(),
                user.getTopicos().stream().map(Topico::getTitle).toList().toArray(new String[0]),
                user.getNumComments());
    }

}
