public interface ListInterface
{
   /** Adds a new entry to the end of this list.
       Entries currently in the list are unaffected.
       The list's size is increased by 1.
       @param newEntry  The object to be added as a new entry. */
   public void add(Integer newEntry);
   
   
   /** Removes all entries from this list. */
   public void clear();
   
   /** Retrieves the entry at a given position in this list.
       @param givenPosition  An integer that indicates the position of
                             the desired entry.
       @return  A reference to the indicated entry.
       @throws  IndexOutOfBoundsException if either
                givenPosition < 1 or givenPosition > getLength(). */
   public Integer getEntry(int givenPosition);
   
   /** Gets the length of this list.
       @return  The integer number of entries currently in the list. */
   public int getLength();
       
   /** Sees whether this list is empty.
       @return  True if the list is empty, or false if not. */
   public boolean isEmpty();

   /** Handles three cases:
    * 1. If the list is empty, throws an exception.
    * 2. If the first element is odd, performs a specific action.
    * 3. Removes all odd values from the list. */
   public void removeAllOddValues();
}
