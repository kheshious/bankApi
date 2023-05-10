package com.example.Bankdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Card_Repo extends JpaRepository<Card, Long>
{

}
