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
  * 