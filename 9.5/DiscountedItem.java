class DiscountedItem extends Item
  {
      // add an instance variable for the discount
      private double discount;
      // Add constructors that call the super constructor
      public DiscountedItem()
      {
        super(); 
      }

      public DiscountedItem(String item, double price, double discount)
      {
        super(item, price); 
        this.discount = discount; 
      }
      // Add get/set methods for discount
      public double getDiscount()
      {
        return discount; // return discount here instead of 0
      }

      public void setDiscount(double changediscount)
      {
        discount = changediscount; 
      }

      // Add a toString() method that returns a call to the super toString
      // and then the discount in parentheses using the super.valueToString() method

      public String toString()
      {
        return super.toString() + "-$" + discount; 
      }

  }
