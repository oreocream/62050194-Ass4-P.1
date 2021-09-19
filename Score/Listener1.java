package Score;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Listener1 implements PropertyChangeListener{

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("live result(1): " + evt.getNewValue());
    }
    
}