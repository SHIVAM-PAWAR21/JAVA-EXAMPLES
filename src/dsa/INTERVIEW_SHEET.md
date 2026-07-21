# Java Interview Practice Sheet #1

10 problems: **5 Medium**, **5 Hard**. Each has a clear statement, examples,
constraints, what it tests, and a hint. Solutions are intentionally left out —
solve first, then ask me to review. Aim to explain your approach *out loud* before coding.

**How to use:** Give yourself ~25 min for Medium, ~40 min for Hard. Write the method
signature, a few test cases, then code. State time & space complexity when done.

---

# MEDIUM

## M1. Two Sum
Given an array of integers `nums` and a target, return the **indices** of the two
numbers that add up to the target. Assume exactly one solution; don't reuse an element.

- **Example:** `nums = [2,7,11,15], target = 9` → `[0,1]` (because 2 + 7 = 9)
- **Constraints:** 2 ≤ length ≤ 10^4; each element used at most once.
- **Tests:** arrays, `HashMap`, single-pass thinking
- **Signature:** `int[] twoSum(int[] nums, int target)`
- **Hint:** For each number, ask "have I already seen `target - num`?" Store seen values in a `HashMap<value, index>`. Aim for O(n), not O(n²).

## M2. Valid Palindrome
Return `true` if a string is a palindrome, considering **only letters and digits**
and ignoring case.

- **Example:** `"A man, a plan, a canal: Panama"` → `true`; `"race a car"` → `false`
- **Constraints:** string may be empty (empty = `true`).
- **Tests:** strings, two-pointer technique
- **Signature:** `boolean isPalindrome(String s)`
- **Hint:** Two pointers, one from each end. Skip non-alphanumeric chars; compare lowercased. Move inward until they cross.

## M3. First Non-Repeating Character
Return the **index** of the first character that appears exactly once. Return `-1` if none.

- **Example:** `"leetcode"` → `0`; `"aabb"` → `-1`
- **Constraints:** 1 ≤ length ≤ 10^5, lowercase letters.
- **Tests:** frequency counting, `HashMap`/array of counts
- **Signature:** `int firstUniqChar(String s)`
- **Hint:** First pass: count every character. Second pass: return the index of the first character whose count is 1.

## M4. Move Zeroes
Move all `0`s in an array to the end **while keeping the order** of non-zero elements.
Do it **in place** (no new array).

- **Example:** `[0,1,0,3,12]` → `[1,3,12,0,0]`
- **Constraints:** modify the array directly; minimize writes.
- **Tests:** in-place array manipulation, two pointers
- **Signature:** `void moveZeroes(int[] nums)`
- **Hint:** Keep an "insert position" pointer. Walk the array; each time you see a non-zero, write it at the insert position and advance it. Fill the rest with zeros.

## M5. Fibonacci with Memoization
Return the n-th Fibonacci number efficiently for n up to 90 (use `long`).

- **Example:** `n = 10` → `55`
- **Constraints:** 0 ≤ n ≤ 90; naive recursion (O(2^n)) will be too slow — improve it.
- **Tests:** recursion, memoization / dynamic programming
- **Signature:** `long fib(int n)`
- **Hint:** Cache results in an array or `HashMap` so each n is computed once (top-down), or build up iteratively from fib(0), fib(1) (bottom-up). O(n).

---

# HARD

## H1. Group Anagrams
Group words that are anagrams of each other.

- **Example:** `["eat","tea","tan","ate","nat","bat"]`
  → `[["eat","tea","ate"], ["tan","nat"], ["bat"]]` (order of groups doesn't matter)
- **Constraints:** 1 ≤ words ≤ 10^4; lowercase letters.
- **Tests:** `HashMap` with computed keys, sorting, strings 
- **Signature:** `List<List<String>> groupAnagrams(String[] words)`
- **Hint:** Two anagrams share the same **sorted letters** ("eat"→"aet"). Use that sorted string as a `HashMap` key mapping to the list of original words.

## H2. Longest Substring Without Repeating Characters
Find the length of the longest substring with **all unique** characters.

- **Example:** `"abcabcbb"` → `3` ("abc"); `"bbbbb"` → `1`
- **Constraints:** 0 ≤ length ≤ 5·10^4.
- **Tests:** sliding window, `HashSet`/`HashMap`
- **Signature:** `int lengthOfLongestSubstring(String s)`
- **Hint:** Maintain a window `[left..right]`. Expand `right`; if you hit a repeat, move `left` forward past the previous occurrence. Track the max window size seen.

## H3. Merge Intervals
Given intervals, merge all that overlap.

- **Example:** `[[1,3],[2,6],[8,10],[15,18]]` → `[[1,6],[8,10],[15,18]]`
- **Constraints:** 1 ≤ intervals ≤ 10^4; each is `[start, end]` with start ≤ end.
- **Tests:** sorting, greedy merging, 2D arrays
- **Signature:** `int[][] merge(int[][] intervals)`
- **Hint:** Sort by start time. Walk through; if the current interval's start ≤ the last merged interval's end, extend that end; otherwise start a new interval.

## H4. Min Stack
Design a javaDemos.stack that supports `push`, `pop`, `top`, and **`getMin`** — all in **O(1)**.

- **Example:** push 3, push 5, getMin→3, push 2, getMin→2, pop, getMin→3
- **Constraints:** `getMin` must be O(1); no scanning the javaDemos.stack.
- **Tests:** OOP/class design, javaDemos.stacks, invariants
- **Signature:** class `MinStack` with `push(int)`, `pop()`, `int top()`, `int getMin()`
- **Hint:** Keep a second javaDemos.stack that tracks the minimum-so-far in parallel with the main javaDemos.stack. This is where your OOP (Week 3) meets javaDemos.data structures.

## H5. Word Frequency Counter (file-based, capstone-level)
Read a text file, count how often each word occurs (case-insensitive, ignore punctuation),
and print the **top N** most frequent words, highest first.

- **Example:** input file with `"the cat sat on the mat the"` , N=2 → `the: 3`, then a 3-way tie.
- **Constraints:** file may be large; N given by the caller; ties broken alphabetically.
- **Tests:** file I/O, `HashMap`, sorting by value, Streams (Week 4)
- **Signature:** `List<String> topWords(String filename, int n) throws IOException`
- **Hint:** Read line by line; split on non-letters; lowercase; count in a `HashMap`. Then sort entries by count descending (alphabetical tiebreak) and take the first N. `Map.Entry` + a comparator, or Java Streams, works well.

---

## When you finish a problem
1. Write down its **time and space complexity**.
2. Test edge cases: empty input, one element, all-same, negatives.
3. Paste your solution to me — I'll review correctness, complexity, and style, and
   suggest a cleaner or faster approach if there is one.

**Suggested order (easiest first):** M2 → M4 → M3 → M1 → M5 → H4 → H3 → H1 → H2 → H5.
