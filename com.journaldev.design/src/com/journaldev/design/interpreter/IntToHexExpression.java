package com.journaldev.design.interpreter;

public class IntToHexExpression implements Expression {

	private int i;
	
	public IntToHexExpression(int c){
		this.i = c;
	}
	
	@Override
	public String interpret(InterpreterContext ic) {
		// TODO Auto-generated method stub
		return ic.getHexadecimalFormat(this.i);
	}


}
