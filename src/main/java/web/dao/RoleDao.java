package web.dao;

import web.model.Role;

import java.util.List;

public interface RoleDao {
    List<Role> listRoles();
    Role getRole(long id);
}
