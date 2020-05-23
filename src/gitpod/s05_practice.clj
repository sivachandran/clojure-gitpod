(ns gitpod.s05-practice
  (:use clojure.repl))


;; 1. Print your name (hint: use print/println)
(print "Siva")


;; 2. Create a no-arity function that prints a message
(defn print-msg
  []
  (print "Welcome"))
(print-msg)

;; 3. Create a function that squares a given number
(defn
  square
  [n]
  (* n n))

(square 2)
;; 4. Create a function that accepts a number and check if its in range of 1 to 10 (inclusive) (int: descending or ascending)
(defn
  ascending
  [n]
  (and (> n 0) (< n 11)))

(ascending 5)
;; 5. Create a function that finds average of 2 given numbers (hint: nested s-expressions)
(defn avg
  [a b]
  (/ (+ a b) 2))

(avg 2 3)
;; 6. Write a function that finds max of 2 given numbers (hint: if-else)
(defn max_two
  [a b]
  (if (> a b)
  a
  b))

(max_two 3 2)
