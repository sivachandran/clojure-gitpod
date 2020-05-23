(ns gitpod.s06-var
  (:use clojure.repl))


;; let binding
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Use let to have local references
;; We typically use let bindings for referring to calculated variables
(let [sum (+ 1 2 3)]
  (print sum))

;; Throws error as sum is not available outside of the let scope
sum


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;EXCERCISE: Rewrite the average of 2 number function, using let



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; NOTE: There are reference types such as Var, Atoms and Refs.
;; We'll get there in the upcoming sessions
