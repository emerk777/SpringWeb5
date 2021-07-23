/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.SpringWebApp.domain.Book;
/**
 *
 * @author emer
 */
public interface BookRepository extends CrudRepository<Book, Long>{
    
}
