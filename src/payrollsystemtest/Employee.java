// Fig. 10.4: Employee.java
// Employee abstract superclass.
package payrollsystemtest;

public abstract class Employee 
{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;
   private Date   birthDay;
   
   static final int BONUS = 100;
   static final int bonusMonth = 7;

   // three-argument constructor
   public Employee( String first, String last, String ssn,  Date date1)
   {
      firstName = first;
      lastName = last;
      socialSecurityNumber = ssn;
      
      setBirthDay( date1);
          
   } // end three-argument Employee constructor

   // set  month, day,year  *******************************
   public void setBirthDay ( Date date1)
   {
      // MUST ALLOCATE SPACE for new oBJECT.
       
      birthDay = new Date( date1.getMonth(), date1.getDay(), date1.getYear() );
      
      //System.out.printf ("birthday = %s", birthDay); // debug
              
   }
   
 public Date getBirthDay ( )
   {
      return birthDay;
      
      //System.out.printf ("birthday = %s", birthDay);            
   } 
   
   // set first name
   public void setFirstName( String first )
   {
      firstName = first; // should validate
   } // end method setFirstName

   // return first name
   public String getFirstName()
   {
      return firstName;
   } // end method getFirstName

   // set last name
   public void setLastName( String last )
   {
      lastName = last; // should validate
   } // end method setLastName

   // return last name
   public String getLastName()
   {
      return lastName;
   } // end method getLastName

   // set social security number
   public void setSocialSecurityNumber( String ssn )
   {
      socialSecurityNumber = ssn; // should validate
   } // end method setSocialSecurityNumber

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } // end method getSocialSecurityNumber

   // return String representation of Employee object
   @Override
   public String toString()
   {
      return String.format( "%s %s\nsocial security number: %s   \nbirthday: %s", 
         getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDay() );
   } // end method toString

   // abstract method overridden by concrete subclasses
   public abstract double earnings(); // no implementation here
} // end abstract class Employee


/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
