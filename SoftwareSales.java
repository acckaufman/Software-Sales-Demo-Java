package chapter4;

/*Amanda Kaufman
Chapter 4
Programming Challenge 4
SoftwareSales Class
This class holds the number of units of a software package sold and the unit cost per package.
It has a function to return the total cost of purchases based on discounts for purchasing in bulk.
*/

public class SoftwareSales 
{
		private int numUnitsSold;	//Number of software units sold
		private double unitCost;	//Cost per unit for the software
		
		//***************************************************************************************
		//Constructor accepts arguments for the number of units sold and unit cost.				*
		//***************************************************************************************
		public SoftwareSales(int num, double cost)
		{
			numUnitsSold = num;
			unitCost = cost;			
		}
		
		//Accessor Functions:
		
		//***************************************************************************************
		//getNumUnitsSold() returns the number currently stored in numUnitsSold.				*
		//***************************************************************************************
		public int numUnitsSold()
		{
			return numUnitsSold;
		}
		
		//***************************************************************************************
		//getUnitCost() returns the number currently stored in unitCost.						*
		//***************************************************************************************
		public double getUnitCost()
		{
			return unitCost;
		}
		
		//***************************************************************************************
		//printDiscount() informs the user what the discount was on a purchase based on the		*
		//number of units sold.
		//***************************************************************************************
		public void printDiscount()
		{
			//If the number of units sold is between 1-9, there is no discount.
			if (numUnitsSold < 10)
			{
				System.out.print("No discount is applied for " + numUnitsSold + " units.\n");
			}
			//If the number of units sold is between 10-19, there is a 20% discount.
			else if (numUnitsSold >= 10 && numUnitsSold < 20)
			{
				System.out.print("The discount applied for " + numUnitsSold + " units is 20%.\n");
			}
			//If the number of units sold is between 20-49, there is a 30% discount.
			else if (numUnitsSold >= 20 && numUnitsSold < 50)
			{
				System.out.print("The discount applied for " + numUnitsSold + " units is 30%.\n");
			}
			//If the number of units sold is between 50-99, there is a 40% discount.
			else if (numUnitsSold >= 50 && numUnitsSold < 100)
			{
				System.out.print("The discount applied for " + numUnitsSold + " units is 40%.\n");
			}
			//If none of the above applies, the number of units sold must be over 100,
			//and the customer gets a 50% discount.
			else
			{
				System.out.print("The discount applied for " + numUnitsSold + " units is 50%.\n");
			}
		}		
		
		//***************************************************************************************
		//getTotalCost() calculates and returns the total cost of the purchase based on the		*
		//number of units sold and the discount applied to each quantity.						*
		//***************************************************************************************
		public double getTotalCost()
		{
			//If the number of units sold is between 1-9, there is no discount.
			//Total cost is simply the number of units times unit cost.
			if (numUnitsSold < 10)
			{
				return (numUnitsSold * unitCost);
			}
			//If the number of units sold is between 10-19, there is a 20% discount.
			//Total cost is 80% of number of units times unit cost.
			else if (numUnitsSold >= 10 && numUnitsSold < 20)
			{
				return (numUnitsSold * unitCost * 0.8);	
			}
			//If the number of units sold is between 20-49, there is a 30% discount.
			//Total cost is 70% of number of units times unit cost.
			else if (numUnitsSold >= 20 && numUnitsSold < 50)
			{
				return (numUnitsSold * unitCost * 0.7);	
			}
			//If the number of units sold is between 50-99, there is a 40% discount.
			//Total cost is 60% of number of units times unit cost.
			else if (numUnitsSold >= 50 && numUnitsSold < 100)
			{
				return (numUnitsSold * unitCost * 0.6);	
			}
			//If none of the above applies, the number of units sold must be over 100,
			//and the customer gets a 50% discount.
			//Total cost is 50% of number of units times unit cost.
			else
			{
				return (numUnitsSold * unitCost * 0.5);	
			}
		}
		
		//Mutator functions:
		
		//***************************************************************************************
		//setNumUnitsSold() manually sets numUnitsSold to the argument value.					*
		//***************************************************************************************
		public void setNumUnitsSold(int num)
		{
			numUnitsSold = num;
		}
		
		//***************************************************************************************
		//setUnitCost() manually sets unitCost to the argument value							*
		//***************************************************************************************
		public void setUnitCost(double cost)
		{
			unitCost = cost;
		}
}
