(ns gitpod.ex02-collections
  (:use clojure.repl))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Below are some of the operators to get
;; get comfortable with the syntax
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Add
(+ 1 2)

;; Multiply
(* 4 3)

;; Equality check
;; Yeah you can check multiple values at once
(= 1 1 1)

;; Descending
;; This is not greater than per se, but check if the
;; following numbers are in descending order
(> 4 3)
(> 4 3 2)
(> 4 3 4)

;; Ascending
;; Simliar to the above you check if the number 
;; are in descending order
(< 1 2 3)
(< 1 4 2 3)

;; Conditionals if-else
(if 
  (> 3 1);; Condition
  (print 3) ;; True branch
  (print 1)) ;; False branch

;; Nested expressions
;; Each nested expression evaluates to its value and
;; the result be used in the containing expression
(= 2
   (+ 1 1))