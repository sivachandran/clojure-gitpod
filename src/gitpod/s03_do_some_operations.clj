(ns gitpod.s04-do-some-operations
  (:use clojure.repl))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Below are some of the operators to get
;; get comfortable with the syntax
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; About s-expression
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


;; Add
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(+ 1 2)

;; Multiply
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(* 4 3 2)

;; Equality check
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Yeah you can check multiple values at once
(= 1 1 1)
(= 1 2 3)


;; Descending (not exactly greater than)
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; This is not greater than per se, but check if the
;; following numbers are in descending order
(> 4 3)
(> 4 3 2)
(> 4 3 4)

;; Ascending (not exactly less than)
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Simliar to the above you check if the number 
;; are in descending order
(< 1 2 3)
(< 1 4 2 3)

;; Logical operators
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Short-circuit and
(and true false)

;; Short-circuit or
(or false false true)

;; Negation
(not false)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; NOTE: The operands can be nested. Keeping it simple for now.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Conditionals if-else
(if (> 3 1);; Condition
  3 ;; True branch
  1) ;; False branch

;; Nested expressions
;; Each nested expression evaluates to its value and
;; the result be used in the containing expression
(= 2
   (+ 1 1))
