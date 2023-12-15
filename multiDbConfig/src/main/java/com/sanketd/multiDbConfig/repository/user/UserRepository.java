package com.sanketd.multiDbConfig.repository.user;

import com.sanketd.multiDbConfig.model.user.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
}