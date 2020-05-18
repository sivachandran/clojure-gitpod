(ns gitpod.ex02-collections
  (:use clojure.repl))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Syntax
(defn
  function-name
  "Function doc as string"
  [params]
  ;; function body
  )

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;Creating your first function
(defn ;; Operator to define a function
  
  welcome ;; Function name
  
  "This function welcomes everyone" ;;Function docstring
  
  [] ;; Parameters
  
  (println "Welcome to the Clojure world!!!")) ;; Function body

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Calling the defined function
(welcome "Clojure Users")

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Get the document string of the given function of the 
(doc welcome)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; There are no explicit returns in the clojure functions.
;; For example this returns 1
(defn 
  welcome 
  "This function welcomes everyone" ;;Function docstring
  [] 
  (println "Welcome to the Clojure world!!!")
  1)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Function with parameter
(defn
  welcome-name
  "This function welcomes the given person" ;;Function docstring
  [name]
  (println "Hello" name "!" "Welcome to the Clojure world!!!"))

(welcome-name "programmers")