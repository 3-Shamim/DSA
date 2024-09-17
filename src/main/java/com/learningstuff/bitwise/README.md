* Operators:
  * AND (&) operator:
    * Any operand is false then false
    * If all operand is true the true
    * When you AND 1 with any number the digits remaining the same
    * Example:
      * 1 & 1 = 1
      * 1 & 0 = 0
      * 0 & 1 = 0
      * 0 & 0 = 0
  * OR (|) operator:
    * Any operand is true then true
    * If all operand is false then false
    * Example:
        * 1 | 1 = 1
        * 1 | 0 = 1
        * 0 | 1 = 1
        * 0 | 0 = 0
  * XOR (^) operator:
    * If only one operand is true then true
    * If both operand is same the zero
    * Example:
        * 1 ^ 1 = 0
        * 1 ^ 0 = 1
        * 0 ^ 1 = 1
        * 0 ^ 0 = 0
    * Observations:
      * a ^ a = 0
      * a ^ 1 = Complement(a) (Complement means opposite)
      * a ^ 0 = a
  * Complement (~) operator:
    * It basically makes the opposite
    * Example:
      * a              = 10110
      * Complement (a) = 01001
    * 2's complement:
      * adding 1 after complement call 2's complement
      * It gives the negative number
  * Left shit (<<) operator:
    * any number left shit by 1 will double the number
      * 0 0 0 0 1 0 1 0 = 10 
      * 0 0 0 1 0 1 0 0 = 20
    * Formula:
      * a << b = a * (2 ^ b)
  * Right shit (>>) operator:
    * any number right shit by 1 will divide the number by 2
      * 0 0 0 1 0 1 0 0 = 20
      * 0 0 0 0 1 0 1 0 = 10
    * 