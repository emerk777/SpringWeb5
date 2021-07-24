/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringWebApp.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import org.springframework.data.annotation.Id;

/**
 *
 * @author emer
 */

@Entity
public class Author {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String firstName;
    private String lastName;
    
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    public Author() {
    }    

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }
    
    

    @Override
    public int hashCode() {
//        Netbeans Version
//        int hash = 3;
//        hash = 17 * hash + Objects.hashCode(this.id);
//        return hash;
        
//       IntelliJ Version 
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public boolean equals(Object o) {
        /* Netbeans Version        
        if (this == obj) {
        return true;
        }
        if (obj == null) {
        return false;
        }
        if (getClass() != obj.getClass()) {
        return false;
        }
        final Author other = (Author) obj;
        if (!Objects.equals(this.id, other.id)) {
        return false;
        }
        return true;*/
        
        // IntelliJ Version  
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        
        Author author = (Author) o;
        
        return id != null ? id.equals(author.id) : author.id == null;
    }
    

    
    
    
}
