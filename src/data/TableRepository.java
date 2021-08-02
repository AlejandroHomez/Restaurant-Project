package data;

import java.util.ArrayList;
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
	
}
