package com.winter.ott.repository;

import com.winter.ott.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, String> {


}
