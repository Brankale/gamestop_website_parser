/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestopapp;

/**
 *
 * @author Utente
 */
public class GameException extends RuntimeException {

    @Override
    public String toString() {
        return "failed to create a Game";
    }
    
}