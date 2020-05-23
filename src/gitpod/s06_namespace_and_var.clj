(ns gitpod.s06-var
  (:use clojure.repl))


;; namespace and vars
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Comparable to the Java packages.
;; All the function/var defintions will be under its particular namespace
(do
  (ns some-space) ;; switch to a namespace
  (println *ns*) ;; Print the name of namespace
  (def var1 1)) ;; Define a variable in the namespace

;; EDITOR SWITCHES BACK TO THE CURRENT FILE'S NAMESPACE
*ns*

;; Won't work
var1

;; Since you're in different name spalce
;; 
some-space/var1

;; NOTES:
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Typically used to create static constants and not meant to be changed
;; And not to be used like we use variables in other languages


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
;; NOTE: There are additional reference types such as Atoms, Refs.
;; We'll get there in the upcoming sessions