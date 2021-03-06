package CalcAPI;

public class CalcAPI
{
	public static int Calc(int a,int b,char op)
	{
		String opp = "+-/*";
		if( opp.indexOf(op) == -1 )
			throw new IllegalArgumentException();
		if( op == '/' && b == 0 )
			throw new ArithmeticException();
		int answ=0;
		switch(op)
		{
		case '+':
			answ=a+b;
			break;
		case '-':
			answ=a-b;
			break;
		case '*':
			answ=a*b;
			break;
		case '/':
			answ=a/b;
			break;
		}
		return answ;
	}
}
