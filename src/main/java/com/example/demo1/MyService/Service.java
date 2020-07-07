package com.example.demo1.MyService;

import com.example.demo1.MyModel.Mymodel;
import com.example.demo1.MyRepositiory.Myrepositiory;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Myrepositiory myrepositiory;
    public Mymodel save(Mymodel mymodel){

       return myrepositiory.save(mymodel);

    }

}
