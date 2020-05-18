(ns gitpod.ex02-collections
  (:use clojure.repl))

;; def - create var in current namespace
;; Typically we don't use create as much as variables as do we in 
;; Java,JS or other predominantly imperative style languages
(def a 1)


;; Use let to have local references
(let [sum (+ 1 2 3)]
  (print sum))