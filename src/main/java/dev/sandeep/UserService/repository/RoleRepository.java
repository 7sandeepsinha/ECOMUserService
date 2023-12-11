package dev.sandeep.UserService.repository;

import dev.sandeep.UserService.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Set<Role> findAllByIdIn(List<Long> roleIds);
}
