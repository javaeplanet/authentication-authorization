package com.javaeplanet.auth.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaeplanet.auth.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
