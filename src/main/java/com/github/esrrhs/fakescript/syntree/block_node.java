package com.github.esrrhs.fakescript.syntree;

import java.util.ArrayList;

public class block_node extends syntree_node
{
	public ArrayList<syntree_node> m_stmtlist = new ArrayList<syntree_node>();
	
	@Override
	public esyntreetype gettype()
	{
		return esyntreetype.est_block;
	}

	@Override
	public String dump(int indent)
	{
		String ret = "";
		ret += gentab(indent);
		ret += "[block]:\n";
		for (int i = 0; i < (int)m_stmtlist.size(); i++)
		{
			ret += gentab(indent + 1);
			ret += "[stmt";
			ret += i;
			ret += "]:\n";
			ret += m_stmtlist.get(i).dump(indent + 2);
		}
		return ret;
	}
	
	public void add_stmt(syntree_node stmt)
	{
		m_stmtlist.add(stmt);
	}

}