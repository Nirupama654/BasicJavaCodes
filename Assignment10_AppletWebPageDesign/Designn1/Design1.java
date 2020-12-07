package LabAssignments.Assignment10_AppletWebPageDesign.Designn1;
//package LabAssignments.Assignment10_AppletWebPageDesign;

import java.applet.*;
import java.awt.*;

/*<applet code = "Design1.class" width=200 height=60>
<param name="msg" value = "Nirupama Prasad">
</applet>*/

public class Design1 extends Applet{

    
    public void paint(Graphics g){
       
        g.drawString("Nirupama Prasad",20,20);
        showStatus("This is my First Applet Program");
    }

}
