/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Score;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Pongsiri
 */
public class Property implements Serializable {
    
    public static final String SCORE_PROPERTY = "Score";///
    
    private String Score;
    
    private PropertyChangeSupport propertySupport;
    
    public Property() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getScore() {
        return Score;
    }
    
    public void setScore(String Score) {
        String oldScore = this.Score;
        this.Score = Score;
        propertySupport.firePropertyChange(SCORE_PROPERTY, oldScore, Score);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
