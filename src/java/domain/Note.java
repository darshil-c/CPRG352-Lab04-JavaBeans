/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author Chaudhari
 */
public class Note implements Serializable{

    private String title;
    private String content;

    // default constructor
    public Note() {
        this.title = "This is the title";
        this.content = "Contents go here";
    }

    // user defined constructor
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // setters and getters for variables
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
