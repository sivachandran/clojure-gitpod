(ns gitpod.s08-back-to-collections
  (:use clojure.repl))

;; Basic operations

;; Get the nth element of it
(nth [1 2 3 4] 1)
(nth '(1 2 3 4) 1)

;; Both behaves the same way, what's the difference?

;; Add an element to the vector
(conj [1 2 3 4] 5)

;; Add an element to the list
(conj '(1 2 3 4) 5)

;; list is a linked list - fast appending, slow read
;; vector is a similar to array - fast read, relatively slow read

;; Oh you told something about immutability?
;; Whatever the changes that you do will not affect the created collection

(let [a-vec [1 2 3 4]
      dropped (drop 2 a-vec)]
  (println a-vec)
  (println dropped))



;; drop indeed drops elements. conj indeed add elements.
;; Then what does even immutability means?