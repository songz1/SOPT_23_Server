package org.sopt.report3.api;

import lombok.extern.slf4j.Slf4j;
import org.sopt.report3.dto.User;
import org.sopt.report3.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@Slf4j
@RestController
public class UserController {

    private final UserService userService;

    public UserController(final UserService userService){
        this.userService = userService;
    }

    @GetMapping("/")
    public String getTime(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm");

        return "현재 시간 : " + dateFormat.format(calendar.getTime());
    }

    @GetMapping("/users")
    public ResponseEntity getUser(@RequestParam(value = "name", defaultValue = "") final String name,
                                  @RequestParam(value = "part", defaultValue = "") final String part){
        try{
            return new ResponseEntity<>(userService.getUser(name, part), HttpStatus.OK);
        }catch (Exception e){
            log.error(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/users/{user_idx}")
    public ResponseEntity getUserIdx(@PathVariable(value = "user_idx") final int user_idx){
        try{
            return new ResponseEntity<>(userService.getUserIdx(user_idx), HttpStatus.OK);
        }catch (Exception e){
            log.error(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/users")
    public ResponseEntity addUser(@RequestBody final User user){
        try{
            return new ResponseEntity<>(userService.addUser(user), HttpStatus.OK);
        }catch (Exception e){
            log.error(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("users/{user_idx}")
    public ResponseEntity updateUser(@PathVariable(value = "user_idx") final int user_idx,
                                     @RequestBody final User user){
        try{
            return new ResponseEntity<>(userService.updateUser(user_idx, user), HttpStatus.OK);
        }catch (Exception e){
            log.error(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("users/{user_idx}")
    public ResponseEntity deleteUser(@PathVariable(value = "user_idx") final int user_idx){
        try {
            return new ResponseEntity<>(userService.deleteUser(user_idx), HttpStatus.OK);
        }catch (Exception e) {
            log.error(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

