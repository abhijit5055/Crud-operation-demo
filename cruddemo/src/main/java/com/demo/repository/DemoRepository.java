package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Demo;

public interface DemoRepository  extends JpaRepository<Demo, Long> {

}
