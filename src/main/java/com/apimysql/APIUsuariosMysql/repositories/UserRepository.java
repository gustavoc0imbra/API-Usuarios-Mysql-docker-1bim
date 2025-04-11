package com.apimysql.APIUsuariosMysql.repositories;

import com.apimysql.APIUsuariosMysql.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
