package com.example.Bankdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Account_Repo extends JpaRepository<Account, Long>
{

}
