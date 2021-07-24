/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringWebApp.controllers;

import com.example.SpringWebApp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author emer
 */
@Controller
public class BookController {
    
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    @RequestMapping("/books")
    public String getBooks(Model model){
    
        model.addAttribute("books", bookRepository.findAll());
        return "books/list";
    }
    
}
