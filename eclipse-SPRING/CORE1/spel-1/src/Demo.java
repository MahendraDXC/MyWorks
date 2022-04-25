import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Demo {

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expr = parser.parseExpression("12+56");
		Integer i = (Integer) expr.getValue();
		System.out.println(i);

	}

}
