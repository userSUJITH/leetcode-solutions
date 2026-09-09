# 3871. Count Commas in Range II

### Difficulty: Medium

## Description
You are given an integer n.

Return the total number of commas used when writing all integers from [1, n] (inclusive) in standard number formatting.

In standard formatting:


	A comma is inserted after every three digits from the right.
	Numbers with fewer than 4 digits contain no commas.


 
Example 1:


Input: n = 1002

Output: 3

Explanation:

The numbers "1,000", "1,001", and "1,002" each contain one comma, giving a total of 3.


Example 2:


Input: n = 998

Output: 0

Explanation:

​​​​​​​All numbers from 1 to 998 have fewer than four digits. Therefore, no commas are used.


 
Constraints:


	1 <= n <= 1015

## Submission Details
- **Status**: Accepted
- **Runtime**: 1
- **Memory**: 42708000
- **Language**: java

## Code
```java
class Solution {
    public long countCommas(long n) {
        long ans = 0;

        if (n >= 1_000)
            ans += n - 999;

        if (n >= 1_000_000)
            ans += n - 999_999;

        if (n >= 1_000_000_000)
            ans += n - 999_999_999;

        if (n >= 1_000_000_000_000L)
            ans += n - 999_999_999_999L;

        if (n >= 1_000_000_000_000_000L)
            ans += n - 999_999_999_999_999L;

        return ans;
    }
}
```
