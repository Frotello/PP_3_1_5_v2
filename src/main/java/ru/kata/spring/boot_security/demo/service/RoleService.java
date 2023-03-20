package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {

    void addTestRoles();

    List<Role> findAllRoles();

    Set<Role> findByIdRoles(List<Long>roles);
}