package h07;

import h07.expression.ValueExpression;
import h07.tree.*;

import java.time.LocalTime;

/**
 * Represents a normal log.
 */
public class NormalLog extends Log{

    @Override
    protected Node generateTree(){
        ValueNode timeStamp = new ValueNode();
        timeStamp.setValueExpression( () -> LocalTime.now().toString() );

        ValueNode separator = new ValueNode();
        separator.setValueExpression( () -> ": " );

        ValueNode level = new ValueNode();
        level.setValueExpression( () -> String.valueOf(this.level));

        ValueNode message = new ValueNode();

        ValueNode backslashN = new ValueNode();
        backslashN.setValueExpression( () -> ";" );

        MapNode replaceNewline = new MapNode(message);

        MapNode red = new MapNode(replaceNewline);
        MapNode yellow = new MapNode(replaceNewline);
        MapNode blue = new MapNode(replaceNewline);

        red.setMapExpression(String -> ANSI_RED);
        yellow.setMapExpression(String -> ANSI_YELLOW);
        blue.setMapExpression(String -> ANSI_BLUE);

        ConditionNode warningPriority = new ConditionNode(level, yellow, red);
        warningPriority.setConditionExpression(String -> (String=="2"||String=="3"));

        ConditionNode informationPriority = new ConditionNode(level, blue, warningPriority);
        informationPriority.setConditionExpression(String -> (String=="0"||String=="1"));

        replaceNewline.setMapExpression(createColorExpression(informationPriority.evaluate() + this.message));
        message.setValueExpression(() -> replaceNewline.evaluate());

        ConcatenationNode concatenationNode1 = new ConcatenationNode(separator, informationPriority);
        ConcatenationNode concatenationNode2 = new ConcatenationNode(timeStamp, concatenationNode1);
        ConcatenationNode concatenationNode3 = new ConcatenationNode(concatenationNode2, backslashN);



        return concatenationNode3;
    }

}
