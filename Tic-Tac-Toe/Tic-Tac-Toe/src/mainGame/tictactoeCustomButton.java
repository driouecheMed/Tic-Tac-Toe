
/***** A SPECIAL BUTTON THAT IS USED IN THE GAME ****/

package mainGame;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;


@SuppressWarnings("serial")
public class tictactoeCustomButton extends JButton {
	private State state;

    public tictactoeCustomButton()
    {
        state = State.empty;
        setForeground(Color.WHITE);
		setContentAreaFilled(false); //transparent button 
		setBorderPainted(false);	//transparent border
		setFont(new Font("Lucida Handwriting", Font.PLAIN, 70));
    }

    public State getState()
    {
        return state;
    }

    public void setState(State state)
    {
        this.state = state;
        if(state == State.empty)
        {
            this.setText("");
           
        }
        else
        {
            this.setText(state.toString());
        }
    } 
    
}
