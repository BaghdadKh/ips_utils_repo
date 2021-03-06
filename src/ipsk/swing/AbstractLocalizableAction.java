//    IPS Java Utils
//    (c) Copyright 2009-2011
//    Institute of Phonetics and Speech Processing,
//    Ludwig-Maximilians-University, Munich, Germany
//
//
//    This file is part of IPS Java Utils
//
//
//    IPS Java Utils is free software: you can redistribute it and/or modify
//    it under the terms of the GNU Lesser General Public License as published by
//    the Free Software Foundation, version 3 of the License.
//
//    IPS Java Utils is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU Lesser General Public License for more details.
//
//    You should have received a copy of the GNU Lesser General Public License
//    along with IPS Java Utils.  If not, see <http://www.gnu.org/licenses/>.

package ipsk.swing;

import ipsk.swing.action.tree.ActionLeaf;
import ipsk.util.LocalizableMessage;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.KeyStroke;

/**
 * Abstract class for localizable actions.
 * @author K.Jaensch, klausj@phonetik.uni-muenchen.de
 *
 */

public abstract class AbstractLocalizableAction extends AbstractAction implements ActionLeaf{

  
    
    private LocalizableMessage displayName=new LocalizableMessage(NAME);
    private Icon icon;
   
    /**
     * Create action.
     * @param actionCommand action command string identifier
     */
    protected AbstractLocalizableAction(String actionCommand) {
        super();        
        putValue(Action.ACTION_COMMAND_KEY, actionCommand);
    }
  
    /**
     * Create action.
     * @param actionCommand action command string identifier
     * @param displayName the display string as localizable message
     */
    protected AbstractLocalizableAction(String actionCommand,LocalizableMessage displayName) {
        this(actionCommand);
        setDisplayName(displayName);
    }

    public String getActionCommand() {
        return (String) getValue(Action.ACTION_COMMAND_KEY);
    }
    
  
	public abstract void actionPerformed(ActionEvent e);

    public LocalizableMessage getDisplayName() {
        return displayName;
    }

    public void setDisplayName(LocalizableMessage displayName) {
        this.displayName = displayName;
        putValue(NAME,displayName.localize());
        
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }
    
    public KeyStroke getAccelerator(){
        return (KeyStroke)getValue(ACCELERATOR_KEY);
    }
    public void setAccelerator(KeyStroke accelerator){
        putValue(ACCELERATOR_KEY,accelerator);
    }
    public int getMnemonic() {
        return (Integer)getValue(MNEMONIC_KEY);
    }
    public void setMnemonic(int mnemonicVal) {
        putValue(Action.MNEMONIC_KEY, mnemonicVal);
    }


}
