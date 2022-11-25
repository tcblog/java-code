package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody

//@RestController == @ResponseBody + @Controller
@RestController
@RequestMapping("/books")
public class BookController {
    // 2.2 设置当前操作的访问路径
//    @RequestMapping(method = RequestMethod.POST)
    // 2.3 设置当前操作的返回值类型
    @PostMapping
    public String save(){
        System.out.println("user sava...");
        return "{'info':'springmvc sava book'}";
    }

//    @RequestMapping(value = "/{id}",method  = RequestMethod.DELETE)
    // 2.3 设置当前操作的返回值类型
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("user delete..."+id);
        return "{'info':'springmvc delete book'}";
    }

//    @RequestMapping(method  = RequestMethod.PUT)
    @PutMapping
    public String update(@RequestBody User user){
        System.out.println("user update..."+user);
        return "{'info':'springmvc update book'}";
    }
//    @RequestMapping(value = "/{id}",method  = RequestMethod.GET)
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("user getById..."+id);
        return "{'info':'springmvc getById book'}";
    }
//    @RequestMapping(method  = RequestMethod.GET)
    @GetMapping
    public String getAll(){
        System.out.println("user getAll...");
        return "{'info':'springmvc getAll book'}";
    }
}
