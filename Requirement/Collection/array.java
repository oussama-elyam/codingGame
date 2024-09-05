// Def and use case
// ---> Fixed size upon creation.
// ---> Faster for primitive types and less memory overhead.
// ---> Basic, limited to storing and accessing elements.
// ---> Can be used for primitive types and objects.

// -----------------------------------------------------------------------------------------------------
// THEORIE
// -----------------------------------------------------------------------------------------------------

//Declaration
int[] numbers = new int[10]; // Declaration with size 10
int[] primes = {2, 3, 5, 7, 11}; // Initialization with values

//Manipulation

int firstPrime = primes[0]; // Access

primes[1] = 13; // Modify

int length = primes.length; // Get the length of the array

for (int i = 0; i < primes.length; i++) {
    System.out.println(primes[i]);
}

for (int prime : primes) {// Enhanced for-loop
    System.out.println(prime);
}
