/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringWebApp.repositories;

import com.example.SpringWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author emer
 */
public interface AuthorRepository extends CrudRepository<Author, Long>{
    
}
