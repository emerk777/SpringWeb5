/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringWebApp.bootstrap;

import com.example.SpringWebApp.domain.Author;
import com.example.SpringWebApp.domain.Book;
import com.example.SpringWebApp.domain.Publisher;
import com.example.SpringWebApp.repositories.AuthorRepository;
import com.example.SpringWebApp.repositories.BookRepository;
import com.example.SpringWebApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author emer
 */
@Component
public class BootStrapData implements CommandLineRunner{
    
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    /*    
    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
    this.authorRepository = authorRepository;
    this.bookRepository = bookRepository;
    }
    */

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        
        System.out.println("Started in Bootstrap");
                
        Publisher publisher = new Publisher();
        publisher.setName("Emerald");
        publisher.setCity("Naples");
        publisher.setState("Fl");
        
        publisherRepository.save(publisher);
        System.out.println("Publisher Count: " + publisherRepository.count());
        
        
        Author eric = new Author("Erick", "Evans");
        Book ddd = new Book("Domain Diven Design", "1234567");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);
        
        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);
        
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        
        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);
        
        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);
        
        System.out.println("Number of Books: "+bookRepository.count());
        System.out.println("Publisher Number of Books: "+publisher.getBooks().size());
    }
    
}
