// Fig. 10.6: PieceWorker.java
// PieceWorker class extends Employee.
package payrollsystemtest;

public class PieceWorker extends Employee 
{
   private double wage; // wage per piece
   private double pieces ; // hours worked for week

   // five-argument constructor
   public PieceWorker( String first, String last, String ssn, 
      double pieceWage, double piecesWorked, Date birthDay )
   {
      super( first, last, ssn, birthDay );
      setWage( pieceWage ); // validate and store piece wage
      setPieces( piecesWorked ); // validate and store pieces worked
   } // end five-argument HourlyEmployee constructor

   // set wage per piece
   public void setWage( double pieceWage )
   {
      wage = ( pieceWage < 0.0 ) ? 0.0 : pieceWage;
   } // end method setWage

   // return wage
   public double getWage()
   {
      return wage;
   } // end method getWage

   // set pieces after verification
   public void setPieces ( double piecesWorked )
   {
      pieces =  (piecesWorked < 0.0 ) ?   0 : piecesWorked ;
      
   } // end method setPieces

   // return hours worked
   public double getPieces()
   {
      return pieces;
   } // end method getHours

   // calculate earnings; override abstract method earnings in Employee
   @Override
   public double earnings()
   {
       // bonus on birthday
     Date birth1 ;
     int mm, bonus1;
      
      bonus1 =0;
      birth1 = super.getBirthDay();
      mm = birth1.getMonth();
     
      if (mm == bonusMonth )
          bonus1 = BONUS;   
       
       
         return getWage() * getPieces() + bonus1;
      
   } // end method earnings

   // return String representation of HourlyEmployee object
   @Override
   public String toString()
   {
      return String.format( "PieceWoker employee: %s\n%s: $%,.2f; %s: %,.2f", 
         super.toString(), "Piece wage", getWage(), 
         "Pieces worked", getPieces() );
   } // end method toString
   
} // end class PieceWorker



