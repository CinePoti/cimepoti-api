package br.com.cinepoti.cinepoti_api.repository;

import br.com.cinepoti.cinepoti_api.model.profile.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}