/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.kamil.Controler;

/**
 * Exception class
 * @author kil85
 * @version 1.0
 */
public class MyException extends Exception{
    
/**
 * Basic constructor without message
 */
    public MyException(){};
    /**
     * Constructor with text message
     * @param message message print alfter thow of the exception 
     */
    public MyException(String message){
        super(message);
    }
}
