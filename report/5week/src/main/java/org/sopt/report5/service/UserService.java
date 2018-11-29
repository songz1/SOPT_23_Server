package org.sopt.report5.service;

import lombok.extern.slf4j.Slf4j;
import org.sopt.report5.dto.User;
import org.sopt.report5.mapper.UserMapper;
import org.sopt.report5.model.DefaultRes;
import org.sopt.report5.utils.ResponseMessage;
import org.sopt.report5.utils.StatusCode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;

@Slf4j
@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(final UserMapper userMapper){
        this.userMapper = userMapper;
    }

    public DefaultRes getAllUsers(){
        final List<User> userList = userMapper.findAll();
        if(userList.isEmpty())
            return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_USER);
        return DefaultRes.res(StatusCode.OK, ResponseMessage.READ_USER, userList);
    }

    public DefaultRes findByNameOrPart(final String name, final String part){

        if(!name.equals("") && !part.equals("")){
            User user = userMapper.findByNameAndPart(name, part);
            if(user == null)
                return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_USER);
            return DefaultRes.res(StatusCode.OK, ResponseMessage.READ_USER, user);
        }
        else if(!name.equals("")){
            User user = userMapper.findByName(name);
            if(user == null)
                return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_USER);
            return DefaultRes.res(StatusCode.OK, ResponseMessage.READ_USER, user);
        }
        else if(!part.equals("")){
            User user = userMapper.findByPart(part);
            if(user == null)
                return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_USER);
            return DefaultRes.res(StatusCode.OK, ResponseMessage.READ_USER, user);
        }
        else{
            return getAllUsers();
        }
    }

    public DefaultRes findByUserIdx(final int user_idx){
        final User user = userMapper.findByUserIdx(user_idx);
        if(user == null)
            return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_USER);
        return DefaultRes.res(StatusCode.OK, ResponseMessage.READ_USER, user);
    }

    @Transactional
    public DefaultRes save(final User user) {
        try {
            userMapper.save(user);
            return DefaultRes.res(StatusCode.CREATED, ResponseMessage.CREATED_USER);
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            log.error(e.getMessage());
            return DefaultRes.res(StatusCode.DB_ERROR, ResponseMessage.DB_ERROR);
        }
    }

    @Transactional
    public DefaultRes update(final int userIdx, final User user) {
        User temp = userMapper.findByUserIdx(userIdx);
        if (temp == null)
            return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_USER);

        try {
            if (!user.getName().equals("")) temp.setName(user.getName());
            if (!user.getPart().equals("")) temp.setPart(user.getPart());
            userMapper.update(userIdx, temp);
            return DefaultRes.res(StatusCode.NO_CONTENT, ResponseMessage.UPDATE_USER);
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            log.error(e.getMessage());
            return DefaultRes.res(StatusCode.DB_ERROR, ResponseMessage.DB_ERROR);
        }
    }

    @Transactional
    public DefaultRes deleteByUserIdx(final int userIdx) {
        final User user = userMapper.findByUserIdx(userIdx);
        if (user == null)
            return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_USER);

        try {
            userMapper.deleteByUserIdx(userIdx);
            return DefaultRes.res(StatusCode.NO_CONTENT, ResponseMessage.DELETE_USER);
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            log.error(e.getMessage());
            return DefaultRes.res(StatusCode.DB_ERROR, ResponseMessage.DB_ERROR);
        }
    }
}
