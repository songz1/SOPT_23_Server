package org.sopt.report3.service.Impl;

import org.sopt.report3.dto.User;
import org.sopt.report3.service.UserService;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final static List<User> userList = new LinkedList<>();

    @Override
    public String getUser(String name, String part) {
        if(!name.equals("") || !part.equals("")){
            if(part.equals("")){
                for(User u : userList) {
                    if (u.getName().equals(name))
                        return u.toString();
                }
                return "없습니다.";
            }
            else if(name.equals("")){
                for(User u : userList){
                    if(u.getPart().equals(part))
                        return u.toString();
                }
                return "없습니다.";
            }
            else{
                for(User u : userList){
                    if(u.getName().equals(name) && u.getPart().equals(part))
                        return u.toString();
                }
                return "없습니다.";
            }
        }
        else{
            if(userList.isEmpty())
                return "없습니다.";
            else{
                String strUser = new String();
                for(User u : userList)
                    strUser += u.toString();
                return strUser;
            }
        }
    }

    @Override
    public String getUserIdx(int user_idx) {
        for(User u : userList){
            if(u.getUser_idx() == user_idx)
                return u.toString();
        }
        return "없습니다.";
    }

    @Override
    public String addUser(User user) {
        userList.add(user);
        return "user 추가 성공";
    }

    @Override
    public String updateUser(int user_idx, User user) {
        for(User u : userList) {
            if (u.getUser_idx() == user_idx) {
                if(!user.getName().equals("") && !user.getPart().equals("")){
                    u.setName(user.getName());
                    u.setPart(user.getPart());
                }
                else if(user.getName().equals("")){
                    u.setPart(user.getPart());
                }
                else if(user.getPart().equals("")){
                    u.setName(user.getName());
                }
                else{
                    return "업데이트 값 필요";
                }
            }
        }
        return "user 업데이트 성공";
    }

    @Override
    public String deleteUser(int user_idx) {
        for(User u : userList) {
            if (u.getUser_idx() == user_idx)
                userList.remove(u);
        }
        return "user 삭제 성공";
    }
}
