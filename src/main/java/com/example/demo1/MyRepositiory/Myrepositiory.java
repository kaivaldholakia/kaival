package com.example.demo1.MyRepositiory;

import com.example.demo1.MyModel.Mymodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Myrepositiory extends JpaRepository<Mymodel,Integer> {




}
