package com.jbit.mapper;

import com.jbit.entity.User;
import java.util.List;

public interface UserMapper {
    public List<User> findAll(int index, int limit);
    public int count();
    public User findById(long id);
    public void save(User user);
    public void  update(User user);
    public void deleteById(long id);
}
