package com.example.demo1.MyController;

import com.example.demo1.MyModel.Mymodel;
import com.example.demo1.MyRepositiory.Myrepositiory;
import com.example.demo1.MyService.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;


@RestController
public class MyController {
    Myrepositiory myrepositiory;
    Service service;
    RestTemplate restTemplate;

    @Autowired
    public MyController(Myrepositiory myrepositiory, Service service, RestTemplate restTemplate) {
        this.myrepositiory = myrepositiory;
        this.service = service;
        this.restTemplate = restTemplate;
    }


    @GetMapping(path = "/get")
    public List<Mymodel> demo1(){


        return  myrepositiory.findAll();


    }

    @PutMapping(path = "/put")
    public  Mymodel put(@RequestBody Mymodel b){

        return myrepositiory.save(b);
    }


    @PostMapping(path = "/post")
    public Mymodel post(@RequestBody Mymodel c){

        return service.save(c);

    }

    @DeleteMapping(path = "/delete")
    public void delete(){

         myrepositiory.deleteAll();

    }

    @GetMapping(path = "/GetById/{ID}")
    public Optional<Mymodel> GetById(@PathVariable String ID){


       return myrepositiory.findById(Integer.parseInt(ID));
    }

    @DeleteMapping(path = "/deleteByID/{ID}")
    public void  delete(@PathVariable String ID){

        myrepositiory.deleteById(Integer.parseInt(ID));

    }

    @GetMapping(path= "/RestCall")
    public String RestCall(){

        String url = "http://localhost:8081/lateral";
        mymodel result = restTemplate.getForObject(url, mymodel.class);

        return  result;

    }





}
