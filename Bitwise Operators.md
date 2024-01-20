A signed number −x equals an unsigned number 2n − x.
For example, the following pseudo-code snippet shows that the signed number 
x = −43 equals the unsigned number y = 232 −43: 
![Alt text](image.png)

If a number is larger than the upper bound of the bit representation, the number will overflow. In a signed representation, the next number after  2n-1 – 1 is -2n-1, and in an unsigned representation, the next number after  2n -1 is 0. For example, consider the following pseudo-code snippet:
![Alt text](image-1.png)
Initially, the value of x is 231 −1. This is the largest value that can be stored in an int variable, so the next number after 231 −1 is −231 .

# Get Bit:

This method is used to find the bit at a particular position(say i) of the given number N. The idea is to find the Bitwise AND of the given number and 2i that can be represented as (1 << i). If the value return is 1 then the bit at the ith position is set. Otherwise, it is unset.

Below is the pseudo-code for the same:

```Java
// Function to get the bit at the
// ith position
static boolean getBit(int num, int i)
{
    // Return true if the bit is
    // set. Otherwise return false
    return ((num & (1 << i)) != 0);
}
```