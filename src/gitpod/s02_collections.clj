(ns gitpod.s02-collections)

;; Below are some of the collections worth knowing.

;; Vector
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Sequential collection - equivalent of array/arraylist
[1 2 "three"]

;;List
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Sequential collection, essentially a linked list
'(1 2 3 true)

;; Set
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Unique elements
#{1 2 3 "four"}

;; Map
;; Indexed elements
{:one 1 :two 2 :three 3}

;; Clojure collections are immutable. We'll come there shortly.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Excercise
;; Try creating a vector, list, set, map
