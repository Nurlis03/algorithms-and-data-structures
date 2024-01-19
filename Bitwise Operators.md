A signed number −x equals an unsigned number 2n − x.
For example, the following pseudo-code snippet shows that the signed number 
x = −43 equals the unsigned number y = 232 −43: 
![Alt text](image.png)

If a number is larger than the upper bound of the bit representation, the number will overflow. In a signed representation, the next number after  2n-1 – 1 is -2n-1, and in an unsigned representation, the next number after  2n -1 is 0. For example, consider the following pseudo-code snippet:
![Alt text](image-1.png)
Initially, the value of x is 231 −1. This is the largest value that can be stored in an int variable, so the next number after 231 −1 is −231 .