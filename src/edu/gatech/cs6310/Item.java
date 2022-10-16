//////////////////////////////////////////////////////////////////////////////////////////
//
// Project: grocery_express
//
// Author: Aubrey Savage
//
// Class: Item
// 
// Notes:
//
//////////////////////////////////////////////////////////////////////////////////////////

package edu.gatech.cs6310;

public class Item 
{
	private String itemName;
	private int itemWeight;
	
	public Item(String itemName, String itemWeight) 
	{
		this.itemName = itemName;
		this.itemWeight = Integer.parseInt(itemWeight);
	}
	
	
//////////////////////////////////////////////////////////////////////////////////////////
//
//Getter Functions
//
//////////////////////////////////////////////////////////////////////////////////////////
	
	public String getItemName()
	{
		return itemName;
	}
	
	public int getItemWeight()
	{
		return itemWeight;
	}
}
