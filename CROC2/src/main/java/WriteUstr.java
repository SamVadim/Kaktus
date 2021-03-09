/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kazaev Vadim
 */
abstract public class WriteUstr {
    
    protected Music song;
    
    WriteUstr(){}
    
    WriteUstr(Music song){
        this.song = song;
    }
    @Override
    public String toString() {
        return  song.toString();
    }
    
}
