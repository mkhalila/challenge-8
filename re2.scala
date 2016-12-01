// Part 2 about Regular Expression Matching
//==========================================

// copy over all code from re.scala

// (2a) Complete the function iterT which needs to
// be tail-recursive(!) and takes an integer n, a 
// function f and an x as arguments. This function 
// should iterate f n-times starting with the 
// argument x.

import scala.annotation.tailrec

@tailrec
def iterT[A](n: Int, f: A => A, x: A): A = ...



// (2b) Complete the size function for regular
// expressions 

def size(r: Rexp): Int = ...

// two testcases about the sizes of simplified and 
// un-simplified derivatives

//val EVIL = SEQ(STAR(STAR(CHAR('a'))), CHAR('b'))
//size(iterT(20, (r: Rexp) => der('a', r), EVIL))        // should produce 7340068
//size(iterT(20, (r: Rexp) => simp(der('a', r)), EVIL))  // should produce 8



// (2c) Complete the fixpoint function below.

@tailrec
def fixpT[A](f: A => A, x: A): A = ...


/* testcases

//the Collatz function from CW 6 defined as fixpoint

def ctest(n: Long): Long =
  if (n == 1) 1 else
    if (n % 2 == 0) n / 2 else 3 * n + 1

// should all produce 1 
fixpT(ctest, 97L)
fixpT(ctest, 871L)
fixpT(ctest, 77031L)

*/

/*
// the same function on strings using the regular expression
// matcher
   
def foo(s: String): String = {
  if (matcher("a", s)) "a" else
  if (matcher("aa" ~ STAR("aa"), s)) s.take(s.length / 2) 
  else "a" ++ s * 3
}

// should all produce "a" 
fixpT(foo, "a" * 97)
fixpT(foo, "a" * 871)

*/