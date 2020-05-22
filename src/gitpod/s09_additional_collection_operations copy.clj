(ns gitpod.s08-back-to-collections
  (:use clojure.repl))

;; Addiotional collection operations

;; MAP
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; [1 -> square -> 1
;;  2 -> square -> 4
;;  3 -> square -> 9
;;  4]-> square -> 16
(map inc [1 2 3 4])

(defn square [x] (* x x))
(map square '(1 2 3 4))

;; REDUCE
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; reduce
;; 1 - *------>2
;;     |       |
;;     2       * ----> 6 
;;             |       |
;;             3       *------>24
;;                     |
;;                     4

(defn reducer-fn [acc x]
  (* acc x))

(reduce reducer-fn 1 [2 3 4])


(reducer-fn 1 2)
(reducer-fn 2 3)
(reducer-fn 6 4)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;