package com.vik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.vik.entity.BanckAccount;

public interface IBackAccountRepository extends CrudRepository<BanckAccount, Long>, JpaRepository<BanckAccount, Long> {

}
