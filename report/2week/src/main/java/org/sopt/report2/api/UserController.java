package org.sopt.report2.api;

import org.sopt.report2.model.User;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

@RestController
public class UserController {
    private final static List<User> userList = new LinkedList<>();

    @GetMapping("/")
    public String getTime(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm");

        return "현재 시간 : " + dateFormat.format(calendar.getTime());
    }

    @GetMapping("/users")
    public String getUser(@RequestParam(value = "name", defaultValue = "") final String name,
                          @RequestParam(value = "part", defaultValue = "") final String part){

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

    @GetMapping("/users/{user_idx}")
    public String getUserIdx(@PathVariable(value = "user_idx") final int user_idx){
        for(User u : userList){
            if(u.getUser_idx() == user_idx)
                return u.toString();
        }
        return "없습니다.";
    }

    @PostMapping("/users")
    public String addUser(@RequestBody final User user){
        userList.add(user);
        return "user 추가 성공";
    }

    @PutMapping("users/{user_idx}")
    public String updateUser(@PathVariable(value = "user_idx") final int user_idx,
                             @RequestBody final User user){
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

    @DeleteMapping("users/{user_idx}")
    public String deleteUser(@PathVariable(value = "user_idx") final int user_idx){
        for(User u : userList) {
            if (u.getUser_idx() == user_idx)
                userList.remove(u);
        }
        return "user 삭제 성공";
    }

}
