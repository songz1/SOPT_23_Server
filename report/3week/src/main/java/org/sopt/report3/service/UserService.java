package org.sopt.report3.service;

import org.sopt.report3.dto.User;

public interface UserService {
    String getUser(final String name, final String part);
    String getUserIdx(final int user_idx);
    String addUser(final User user);
    String updateUser(final int user_idx, final User user);
    String deleteUser(final int user_idx);
}
