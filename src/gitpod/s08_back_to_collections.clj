(ns gitpod.s08-back-to-collections
  (:use clojure.repl))

;; Basic operations

;; Define a vector
(def ex-vec [1 2 3 4])
(def ex-list '(1 2 3 4))

;; Get the nth element of it
(nth ex-vec 1)
(nth ex-list 1)

;; Both behaves the same way, what's the difference?

;; Add an element to the vector
(conj ex-vec 5)

;; Add an element to the list
(conj ex-list 5)

;; list is a linked list - fast appending, slow read
;; vector is a similar to array - fast read, relatively slow read

;; Oh you told something about immutability?
;; Whatever the changes that you do will not affect the created collection

(drop 2 ex-vec)

;; drop indeed drops elements. conj indeed add elements.
;; Then what does even immutability means?
;; 
(drop 2 ex-vec)
ex-vec