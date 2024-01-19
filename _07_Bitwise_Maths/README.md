# AND(&) OPERATOR
| a | b | a&b |  
|---|---|-----|
| 1 | 0 | 0   |   
| 0 | 1 | 0   | 
| 1 | 1 | 1   |   
| 0 | 0 | 0   |  

## Observation
n & 1  => n

---

# OR(|) OPERATOR
| a | b | a\b |  
|---|---|-----|
| 1 | 0 | 1   |   
| 0 | 1 | 1   |   
| 1 | 1 | 1   |   
| 0 | 0 | 0   |

---
# ZOR(^) OPERATOR
| a | b | a^b |  
|---|---|-----|
| 1 | 0 | 1   |  
| 0 | 1 | 1   |  
| 1 | 1 | 0   |   
| 0 | 0 | 1   |

## Observation
n ^ 1  => ~n

n ^ 0  =>  n

n ^ n  =>  0

---

# Complimentary
a = 10110

~a = 01001

# Left(<<) Shift OPERATOR

a<<1 => 2a



a<<b => a*(2^b)


## (10)base10 << 1 => (1010)base2 << 1 => 10100

=> 10<<1=20

---

# Right(>>) Shift OPERATOR

a>>1 => a/2

a>>b => a/(2^b)

## (10)base10 >> 1 => (1010)base2 >> 1 => 101

=> 10>>1=5

