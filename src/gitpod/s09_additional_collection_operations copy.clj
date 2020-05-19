(ns gitpod.s08-back-to-collections
  (:use clojure.repl))

;; Basic operations

;; Define a vector
(def ex-vec [1 2 3 4])
(def ex-list '(1 2 3 4))

;; map
;; 
;; [1 -> square -> 1
;;  2 -> square -> 4
;;  3 -> square -> 9
;;  4]-> square -> 16
(map inc ex-vec)

(defn square [x] (* x x))
(map square ex-vec)

;; reduce
;; 1 - *------>2
;;     |       |
;;     2       * ----> 6 
;;             |       |
;;             3       *------>24
;;                     |
;;                     4

(reduce * 1 ex-vec)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;Find the sum of square of all elements in ex-vec
;;Read and practice filter