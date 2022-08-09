fun main() {
    
    // Read-only (immutable)
    val names = listOf("Ahad", "Turki", "Raghad", "Nasser", "Sumayah", "Fahdah")
    val namesAll = listOf("Ahad", "Turki", "Raghad", "Nasser")
    val color = listOf<String>()
    
    // Read and Write (mutable)
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val weekDays = mutableListOf("Sun", "Mon", "Tue", "Wed", "Fri", "Sat")

    
    // Read-Write (mutable) List - Operations
    
    
    // Add (Element)
   	println("list Before Add (six) $numbers")
    numbers.add("six")
    println("list After Add (six) $numbers")
    
    //print *
    repeat(50){
        print("*")
    }
	println("\n")
    
    
    // Add (Index, Element)
   println("list Before Add (Thu Before Fri) $weekDays")
   weekDays.add(4,"Thu")
    println("list After Add (Thu Before Fri) $weekDays")
   
    //print *
    repeat(50){
        print("*")
    }
	println("\n")
     
    // Add All (Index, List)
    val weekDays1 = mutableListOf("Sun", "Mon", "Tue", "Wed", "Fri", "Sat")
    
     println("list Before Add (numbers Between weekDays) $weekDays1")
     weekDays1.addAll(3,numbers)
     println("list After Add (numbers Between weekDays) $weekDays1")
     
      //print *
    repeat(50){
        print("*")
    }
	println("\n")
    
    
    // Add All (List)
     println("list Before Add (numbers to weekDays) $weekDays")
    	weekDays.addAll(numbers)
     println("list After Add (numbers to weekDays) $weekDays")
    
    //print *
    repeat(50){
        print("*")
    }
	println("\n")
 
 
      // Clear
    var names1 = mutableListOf("Ahad", "Turki", "Raghad", "Nasser", "Sumayah", "Fahdah")
    println("list Before Remove (All names) $names1")
    names1.clear()
    println("list After Remove (All names) $names1")
    
     //print *
    repeat(50){
        print("*")
    }
	println("\n")
    
   	
    // Remove
      var names2 = mutableListOf("Ahad", "Turki", "Raghad", "Nasser", "Sumayah", "Fahdah")
    println("list Before Remove (Raghad) $names2")
    names2.remove("Raghad")
    println("list After Remove (Raghad) $names2")
    
      //print *
    repeat(50){
        print("*")
    }
	println("\n")
    
    
    // Remove At 
     println("list Before Remove (element At position 2) $names2")
     names2.removeAt(2)
     println("list After Remove (element At position 2) $names2")
     
     //print *
    repeat(50){
        print("*")
    }
	println("\n")
     
    
    // Remove All
   	 println("list Before Remove (numbers from weekDays) $weekDays")
     weekDays.removeAll(numbers)
    println("list After Remove (numbers from weekDays) $weekDays")
    
    //print *
    repeat(50){
        print("*")
    }
	println("\n")
    
    // Read-only (immutable) List - Operations
     
     
    // The size of the list
    println("Number of elements in names =${names.size}")
    
    //print *
    repeat(50){
        print("*")
    }
	println("\n")
    
    // Contains
   	println("Is Nasser on the list: ${names.contains("Nasser")}")
    
    //print *
    repeat(50){
        print("*")
    }
	println("\n")
    
    // Contains All
   	println("Is (namesAll) have same elements as (names): ${namesAll.containsAll(names)}")
    
    //print *
    repeat(50){
        print("*")
    }
	println("\n")
    
    // get
    println("name At index (2) is: ${names.get(2)}")
    
    //print *
    repeat(50){
        print("*")
    }
	println("\n")
   	
    // indexOf
    println("Raghad's order in the list is: ${names.indexOf("Raghad")}")
    
     //print *
    repeat(50){
        print("*")
    }
	println("\n")
    
    // isEmpty
    println("names list is empty: ${names.isEmpty()}")
    
    //print *
    repeat(50){
        print("*")
    }
	println("\n")
    
    // Sublist
    
    println("The first three names on the list are: ${names.subList(0,3)}")
    
    
}
