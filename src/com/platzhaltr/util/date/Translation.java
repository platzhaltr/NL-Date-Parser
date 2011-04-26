package com.platzhaltr.util.date;

import com.platzhaltr.util.date.analysis.DepthFirstAdapter;
import com.platzhaltr.util.date.node.ANumberExpr;

public class Translation extends DepthFirstAdapter {

	@Override
	public void caseANumberExpr(ANumberExpr node) {
		// TODO Auto-generated method stub
		super.caseANumberExpr(node);

		System.out.println(node.getNumber().toString());
	}

}
