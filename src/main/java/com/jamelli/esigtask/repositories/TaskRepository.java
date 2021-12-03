package com.jamelli.esigtask.repositories;

import com.jamelli.esigtask.domains.Task;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

    @Query(value = "SELECT * FROM TASK WHERE TITLE = ?1 OR DESCRIPTION = ?2 OR RESPONSIBLE = ?3 OR STATUS = ?4", nativeQuery = true)
    List<Task> find(String title, String description, String responsible, Boolean status);

    @Query(value = "SELECT * FROM TASK WHERE STATUS = ?1", nativeQuery = true)
    List<Task> findByStatus(Boolean b);

}