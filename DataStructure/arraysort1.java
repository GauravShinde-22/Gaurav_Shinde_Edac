//======================================================================
//Program2: Array Program with Modularity
//-----------------------------------------

class Array1
   {
   private long[] a;                 // ref to array a
   private int n;               // number of data items
//----------------------------------------------------------------
   public Array1(int max)         // constructor
      {
      a = new long[max];                 // create the array
      n = 0;                        // no items yet
      }
//----------------------------------------------------------------
   public boolean find(long searchKey)
      {                              // find specified value
      int j;
      for(j=0; j<n; j++)            // for each element,
         if(a[j] == searchKey)           // found item?
            break;                       // exit loop before end
      if(j == n)                    // gone to end?
         return false;                   // yes, can't find it
      else
         return true;                    // no, found it
      }  // end find()
//----------------------------------------------------------------
   public void insert(long value)    // put element into array
      {
      a[n] = value;             // insert it
      n++;                      // increment size
      }
//----------------------------------------------------------------
   public boolean delete(long value)
      {
      int j;
      for(j=0; j<n; j++)        // look for it
         if( value == a[j] )
            break;
      if(j==n)                  // can't find it
         return false;
      else                           // found it
         {
         for(int k=j; k<n; k++) // move higher ones down
            a[k] = a[k+1];
         n--;                   // decrement size
         return true;
         }
      }  // end delete()
//----------------------------------------------------------------
   public void display()             // displays array contents
      {
      for(int j=0; j<n; j++)       // for each element,
         System.out.print(a[j] + " ");  // display it
      System.out.println("");
      }

   }  // end class Array1

class ArrayTest1
   {
   public static void main(String[] args)
      {
      int maxSize = 100;            // array size
      HighArray arr;                // reference to array
      arr = new HighArray(maxSize); // create the array
//----------------------------------------------------------------
      arr.insert(77);               // insert 10 items
      arr.insert(99);
      arr.insert(44);
      arr.insert(55);
      arr.insert(22);
      arr.insert(88);
      arr.insert(11);
      arr.insert(00);
      arr.insert(66);
      arr.insert(33);
//----------------------------------------------------------------
      arr.display();                // display items
//----------------------------------------------------------------
      int searchKey = 35;           // search for item
      if( arr.find(searchKey) )
         System.out.println("Found " + searchKey);
      else
         System.out.println("Can't find " + searchKey);
//----------------------------------------------------------------
      arr.delete(00);               // delete 3 items
      arr.delete(55);
      arr.delete(99);
//----------------------------------------------------------------
      arr.display();                // display items again
      }  // end main()
   }  // end class ArrayTest1
/*==================================================================
Program 3: Bubble sort program
--------------------------------*/
public void bubbleSort() {
		int out, in;
		for(out=nElems-1; out>1; out--)
			for(in=0; in<out; in++)
				if( a[in] > a[in+1] )
					swap(in, in+1);
	}

private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;

	}
/*===================================================================
Program 4:Selection Sort program
-----------------------------------*/
public void selectionSort() {
		int out, in, min;
		for(out=0; out<nElems-1; out++) {
			min = out;
			for(in=out+1; in<nElems; in++)
				if(a[in] < a[min] )
					min = in;
			swap(out, min);
		} 
	} 

	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;

	}
/*===================================================================
Program 5:Insertion Sort program
-----------------------------------*/
public void insertionSort()
{
		int in, out;

		for(out=1; out<nElems; out++) {
			long temp = a[out];
			in = out;
			while(in>0 && a[in-1] >= temp){
				a[in] = a[in-1];
				--in;
			}

			a[in] = temp;

		} 
	}
