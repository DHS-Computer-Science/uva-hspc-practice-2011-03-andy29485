# Practice 2011 - 03: Password Validaion

## Background
A company has asked you to write a password checker for their online system.
When new users enter their passwords, your program must determine whether or not
it is a good password. A good password meets all of the following requirements:
- The password is between 9 and 20 characters in length inclusive
  (its length can be equal to 9 or 20)
- The password contains at least 2 lowercase letters
- The password contains at least 2 uppercase letters
- The password contains at least 1 number
- The password contains at least 2 non-alphanumeric characters
  (assume the only non-alphanumeric characters are : ! @ # $ % ^ & * . , ; / ?)
- The password does not contain any 3 consecutive characters (case matters)
- Disregarding all non-alphanumeric characters and case, the subsequence of
  alphanumeric characters is not a palindrome (for example: "&Ra^#r" still
  counts as a palindrome)
- The password contains no subsequence of alphanumeric characters, disregarding
  case, either in forward or reverse order that is equal to any of the following
  words (for example: pKassWordL and KdRrowSmsap are both invalid passwords):
  - password
  - virginia
  - cavalier
  - code

## Description

### Input
The first line of input will contain an integer N signifying the number of test
cases. The following N lines will contain a string representing the password to
be checked. The passwords will contain no spaces.

### Output
For each test case, determine whether it meets the requirements for the
passwords as stated above. If the test case is valid, print "Valid Password",
if the test case is invalid, print "Invalid Password".

## Sample
### Input
```
3
SPring2011!!
pKassW&ordL*
123^45ABcde.
```

### Output
```
Valid Password
Invalid Password
Valid Password
```
