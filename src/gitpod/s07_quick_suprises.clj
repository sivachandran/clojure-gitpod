(ns gitpod.s07-quick-suprises
  (:use clojure.repl))

;; Below are things that you might not have experienced before.
;; 
;; Your not expected to understand it right away. But it'll make you
;; curious to get a feel of it.
;; 
;; To give a wow-factor and will be discussed in detail in the future
;; sessions.

;; take takes the given elements from the given sequence
(take 2 [0 1 2 3 4])

;; Try to think of what range returns
(take 4 (range))

;; Try giving different values for 4 and experiment.
;; 
;; Able to reason it?

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; You can write a fibinocci generator within 50 characters of code

(def fib (lazy-cat [0 1] (map + (rest fib) fib)))

(take 10 fib)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; You can define your logical operators by yourself

(|| false true) ;; See this fails

;; Define the or operator yourself
(defmacro ||
  "Equivalent of or"
  ([] nil)
  ([expr]
   `~expr)
  ([expr & other-exprs]
   `(let [val# (|| ~expr)]
      (if val# val# (|| ~@other-exprs)))))

;; TA DA.. You've defined your own version of a logical operator
(|| false true)