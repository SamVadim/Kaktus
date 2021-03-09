
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kazaev Vadim
 */
public class Music {
    private final String MusicName;
    private final String ArtistName;
    
    Music(String MusicName,String ArtistName){
        this.MusicName = MusicName;
        this.ArtistName = ArtistName;
    }
    @Override
    public String toString(){
        return MusicName + " - " +  ArtistName;
    }
    @Override
    public int hashCode() {
        return Objects.hash(ArtistName, MusicName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Music other = (Music) obj;
        if (!Objects.equals(this.MusicName, other.MusicName)) {
            return false;
        }
        if (!Objects.equals(this.ArtistName, other.ArtistName)) {
            return false;
        }
        return true;
    }
}
