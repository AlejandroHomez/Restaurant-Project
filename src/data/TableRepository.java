package data;

import java.util.ArrayList;

import models.Recipe;
import models.Table;

public class TableRepository {
	
	private ArrayList<Table> tables = new ArrayList<Table>();
	
	public boolean crateTable(Table table) {
		
		tables.add(table);
		
		return true;
	}
	
	public ArrayList<Table> getTables(){
		return tables;
	}
	
	public Table findTableById(String tableNumber) {
		
		for(int i = 0 ; i < tables.size(); i++) {
			Table table = tables.get(i);
			
			if(table.getNumberTable().equals(tableNumber)) {
				return table;
			}
		}
		return null;
	}
	
	public boolean updateTable(Table table, Table updateTable) {
		
		int position = tables.indexOf(table);
		
		tables.set(position, updateTable);
		
		return true;
	}
	
	public boolean deleteTable(String id) {
		for(int i = 0 ; i < tables.size(); i++) {
			Table table = tables.get(i);
			if(table.getNumberTable().equals(id)) {
				tables.remove(i);
				return true;
			}
		}
		return false;
	}
	
}
