package com.user.microservices.Micro_Usersdetails.repository;

import com.user.microservices.Micro_Usersdetails.entity.Users;
import org.hibernate.secure.internal.JaccSecurityListener;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {
}
